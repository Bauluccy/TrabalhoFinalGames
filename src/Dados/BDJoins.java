package Dados;

import Class.HistoricoDeCompras;
import Class.Joins;
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

public class BDJoins {
    
    
    private Connection conn;
    public BDJoins() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexão: " + ":\n" + e.getMessage());
        }
    }
    
    public ArrayList joinsListar() throws Exception{
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList joinHistorico = new ArrayList();
        
        try{
            String sql = "SELECT historico.ID_Historico, clientes.nomeCliente, jogos.titulo, historico.data, historico.hora, historico.quantidade, historico.tipoPagamento, historico.valorTotal FROM historico,clientes,jogos WHERE clientes.ID_cliente = historico.id_cliente AND jogos.ID_Jogo = historico.id_jogo ORDER BY historico.data, historico.hora";
            connL = this.conn;
            ps = connL.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                   int ID_Historico = rs.getInt("ID_Historico");
                   DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");
                   Date data = rs.getDate("data");
                   Time hora = rs.getTime("hora");
                   String nome_cliente = rs.getString("nomeCliente");
                   String nome_jogo = rs.getString("titulo");
                   int quantidade = rs.getInt("quantidade");
                   String tipoPagamento = rs.getString("tipoPagamento");
                   Double valorTotal = rs.getDouble("valorTotal");
                   
                   joinHistorico.add(new Joins(ID_Historico,nome_cliente, nome_jogo, data, hora, quantidade, tipoPagamento,valorTotal));
               }
            
        }catch(SQLException sqle){
            throw new Exception("Erro ao listar as consultas" + sqle);
        }
        finally{
            Conexao.close(conn, ps);
        }
        return joinHistorico;
    }
    
    
    
}
