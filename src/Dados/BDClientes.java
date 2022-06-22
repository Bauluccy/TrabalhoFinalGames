package Dados;

import Class.Clientes;
import Utilidade.Conexao;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
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
        ArrayList listaClientes = new ArrayList();

        try {
            String SQL = "SELECT * FROM clientes";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id_clientes = rs.getInt("ID_cliente");
                String nome_Cliente = rs.getString("nomeCliente");
                long cpfCliente = rs.getLong("CPF");
                String loginCLiente = rs.getString("ClienteLogin");
                Date dataNasc = rs.getDate("dataNasc");

                listaClientes.add(new Clientes(id_clientes, nome_Cliente, cpfCliente, loginCLiente, dataNasc));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao listar clientes " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }

        return listaClientes;

    }
    
    public void inserir(Clientes clientes) {

        PreparedStatement ps = null;
        Connection connL = null;

        if (clientes == null) {
            JOptionPane.showMessageDialog(null, "O campo cliente não pode ser nulo.");
        }
        try {
            String SQL = "INSERT INTO clientes (nomeCliente, CPF, ClienteLogin, dataNasc)"
                    + "values (?,?,?,?)";

            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, clientes.getNomeCliente());
            ps.setLong(2, clientes.getCPF());
            ps.setString(3, clientes.getClienteLogin());
            java.util.Date dataJAVA = clientes.getDataNasc();
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime());
            ps.setDate(4,dataSQL);

            ps.executeUpdate();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir um novo cliente " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }

    }
    
    public void atualizar(Clientes clientes) {
        PreparedStatement ps = null;
        Connection connL = null;

        if (clientes == null) {
            JOptionPane.showMessageDialog(null, "O campo cliente não pode ser nulo.");
        }

        try {
            String SQL = "UPDATE clientes set nomeCliente=?, CPF=?, ClienteLogin=?, dataNasc=? WHERE ID_cliente=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, clientes.getNomeCliente());
            ps.setLong(2, clientes.getCPF());
            ps.setString(3, clientes.getClienteLogin());
             java.util.Date dataJAVA = clientes.getDataNasc();
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime());
            ps.setDate(4, dataSQL);
            ps.setInt(5, clientes.getID_Cliente());
            ps.executeUpdate();

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o cliente " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    public void excluir(int id) {
        PreparedStatement ps = null;
        Connection connL = null;
        if (id == 0) {
            JOptionPane.showMessageDialog(null, "O campo clientes não pode ser nulo.");
        }
        try {
            String SQL = "DELETE FROM clientes WHERE ID_cliente=?";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o cliente " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    public Clientes procurar(int ID_Cli) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        Clientes clientes = new Clientes();
        clientes = null;
        try {
            String SQL = "SELECT * FROM clientes WHERE ID_cliente = ?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, ID_Cli);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_cliente = rs.getInt("ID_cliente");
                String nome = rs.getString("nomeCliente");
                long CPF = rs.getLong("CPF");
                Date dataNasc = rs.getDate("dataNasc");
                String login = rs.getString("ClienteLogin");
                
                clientes = new Clientes(id_cliente, nome, CPF, login, dataNasc);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar o cliente " + sqle);
        } finally {
            //conexaoAulaDAO.close(connL, ps);
        }
        return clientes;
    }
    
    
}
