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
                double valorUnidade = rs.getDouble("valorUnidade");
                int ativo = rs.getInt("ativo");

                Lista.add(new Jogos(idJogos, tituloJogo, generoJogo, valorUnidade,ativo));
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
            String SQL = "INSERT INTO jogos (titulo, genero, valorUnidade, ativo) values (?,?,?,?)";

            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, jogos.getNomeJogo());
            ps.setString(2, jogos.getGenero());
            ps.setDouble(3,jogos.getValor());
            ps.setInt(4,jogos.getAtivo());
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
            String SQL = "UPDATE jogos set titulo=?, genero=?, valorUnidade=? WHERE ID_Jogo=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, jogos.getNomeJogo());
            ps.setString(2, jogos.getGenero());
            ps.setDouble(3, jogos.getValor());
            ps.setInt(4, jogos.getID_Jogo());
            
            
            ps.executeUpdate();

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o jogo " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    
    public void excluir(int id, int ativo) {
        PreparedStatement ps = null;
        Connection connL = null;
        if (id == 0) {
            JOptionPane.showMessageDialog(null, "O campo id do jogo não pode ser nulo.");
        }
        
        try{
            String SQL = "UPDATE jogos set ativo=? WHERE ID_Jogo =?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1,ativo);
            ps.setInt(2, id);
            ps.executeUpdate();
            
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "Erro ao excluir o jogo" + sqle);
        }finally{
            Conexao.close(connL, ps);
        }

//        try {
//            String SQL = "DELETE FROM jogos WHERE ID_Jogo=?";
//            connL = this.conn;
//
//            ps = connL.prepareStatement(SQL);
//            ps.setInt(1, id);
//            ps.executeUpdate();
//        } catch (SQLException sqle) {
//            JOptionPane.showMessageDialog(null, "Erro ao excluir o jogo" + sqle);
//        } finally {
//            Conexao.close(connL, ps);
//        }
    }
    
     public Jogos procurar(int ID_Jogo) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        Jogos jogos = new Jogos();
        jogos = null;
        try {
            String SQL = "SELECT * FROM jogos WHERE ID_Jogo = ?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, ID_Jogo);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_jogo = rs.getInt("ID_Jogo");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                double valor = rs.getDouble("valorUnidade");
                int ativo = rs.getInt("ativo");
                jogos = new Jogos(id_jogo, titulo, genero, valor, ativo);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar o jogo " + sqle);
        } finally {
            //conexaoAulaDAO.close(connL, ps);
        }
        return jogos;
    }
}
