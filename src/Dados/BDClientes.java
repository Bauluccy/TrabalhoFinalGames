package Dados;

import Class.Clientes;
import Utilidade.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDClientes {
    private Connection conn;
    
    public BDClientes() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexão: " + ":\n" + e.getMessage());
        }
    }
    
    public ArrayList listar() throws SQLException {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList bibliotecaGames = new ArrayList();

        try {
            String SQL = "SELECT * FROM clientes";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id_clientes = rs.getInt("ID_cliente");
                String nome_Cliente = rs.getString("nomeCliente");
                int cpfCliente = rs.getInt("CPF");
                String loginCLiente = rs.getString("ClienteLogin");

                bibliotecaGames.add(new Clientes(id_clientes, nome_Cliente, cpfCliente, loginCLiente));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao listar agenda " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }

        return bibliotecaGames;

    }
    
    
}
