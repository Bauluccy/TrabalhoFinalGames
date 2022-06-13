package Dados;

import Class.Jogos;
import Utilidade.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDJogos {
    private Connection conn;
    short cont = 0;

    public BDJogos() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexão: " + ":\n" + e.getMessage());
        }
    }

    public ArrayList listar() {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList Lista = new ArrayList();

        try {
            String SQL = "SELECT * FROM jogos";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idJogos = rs.getInt("ID_Jogo");
                String tituloJogo = rs.getString("titulo");
                String generoJogo = rs.getString("genero");

                Lista.add(new Jogos(idJogos, tituloJogo, generoJogo));
            }

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todos os jogos da biblioteca " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }

        return Lista;
    }
    
    
    
    public void inserir(Jogos jogos) {

        PreparedStatement ps = null;
        Connection connL = null;


        if (jogos == null) {
            JOptionPane.showMessageDialog(null, "O campo jogos não pode ser nulo.");
        }
        try {
            String SQL = "INSERT INTO jogos (titulo, genero) values (?,?)";

            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, jogos.getNomeJogo());
            ps.setString(2, jogos.getGenero());
            ps.executeUpdate();

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir um novo jogo " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    
    
    public void atualizar(Jogos jogos) {
        PreparedStatement ps = null;
        Connection connL = null;
        if (jogos == null) {
            JOptionPane.showMessageDialog(null, "O campo jogos não pode ser nulo.");
        }

        try {
            String SQL = "UPDATE jogos set titulo=?, genero=? WHERE ID_Jogo=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, jogos.getNomeJogo());
            ps.setString(2, jogos.getNomeJogo());
            ps.setInt(3, jogos.getID_Jogo());
            ps.executeUpdate();

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o jogo " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    
    public void excluir(Jogos jogos) {
        PreparedStatement ps = null;
        Connection connL = null;
        if (jogos == null) {
            JOptionPane.showMessageDialog(null, "O campo jogos não pode ser nulo.");
        }

        try {
            String SQL = "DELETE FROM jogos WHERE ID_Jogo=?";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            ps.setInt(1, jogos.getID_Jogo());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o jogo" + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
}
