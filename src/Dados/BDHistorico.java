package Dados;

import Class.HistoricoDeCompras;
import Utilidade.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDHistorico {
    
    private Connection conn;

    public BDHistorico() {
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
        ArrayList agendaHistoricos = new ArrayList();

        try {
            String SQL = "SELECT * FROM historico";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int ID_historico = rs.getInt("ID_Historico");
                int id_cliente = rs.getInt("id_cliente");
                int id_jogo = rs.getInt("id_jogo");
                int quantidade = rs.getInt("quantidade");
                Date data = rs.getDate("data");
                DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");
                Time hora = rs.getTime("hora");
                String tipoPagamento = rs.getString("tipoPagamento");
                agendaHistoricos.add(new HistoricoDeCompras(ID_historico,id_cliente,id_jogo,quantidade,data,hora,tipoPagamento));
            }

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o histórico de compras " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }

        return agendaHistoricos;
    }
    
    
    
    public void inserir(HistoricoDeCompras historico) {

        PreparedStatement ps = null;
        Connection connL = null;

        if (historico == null) {
            JOptionPane.showMessageDialog(null, "O objeto historico não pode ser nulo.");
        }
        try {
            String SQL = "INSERT INTO historico (id_cliente, id_jogo, data, hora, quantidade, tipoPagamento) "
                    + "values (?,?,?,?,?,?)";

            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, historico.getID_Cliente());
            ps.setInt(2, historico.getID_Jogo());
            java.util.Date dataJAVA = historico.getData();
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
            ps.setDate(3, dataSQL);
            java.util.Date horaSQL = historico.getHora();  // Data da classe Java Util
            ps.setTime(4, (Time) horaSQL);
            
            ps.setInt(5, historico.getQuantidade());
            ps.setString(6, historico.getTipoPagamento());
            ps.executeUpdate();

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir um novo historico " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    
    
    public void atualizar(HistoricoDeCompras historico) {
        PreparedStatement ps = null;
        Connection connL = null;
        if (historico == null) {
            JOptionPane.showMessageDialog(null, "O campo historico não pode ser nulo.");
        }
        try {
            String SQL = "UPDATE historico set id_cliente=?, id_jogo=?, data=?, hora=?, quantidade=?, tipoPagamento=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, historico.getID_Cliente());
            ps.setInt(2, historico.getID_Jogo());
            java.util.Date dataJAVA = historico.getData();
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
            ps.setDate(3, dataSQL);
            java.util.Date horaSQL = historico.getHora();  // Data da classe Java Util
            ps.setTime(4, (Time) horaSQL);
            
            ps.setInt(5, historico.getQuantidade());
            ps.setString(6, historico.getTipoPagamento());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao editar historico " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    
    public void excluir(HistoricoDeCompras historico) {
        PreparedStatement ps = null;
        Connection connL = null;
        if (historico == null) {
            JOptionPane.showMessageDialog(null, "O campo historico não pode ser nulo.");
        }
        try {
            String SQL = "DELETE FROM historico WHERE ID_Historico=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, historico.getID_Historico());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir historico " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
}
