package Class;

import java.util.Date;

public class Clientes {
    int ID_Cliente;
    String nomeCliente;
    long CPF;
    String clienteLogin;
    Date dataNasc;

    public Clientes() {
    }

    public Clientes(int ID_Cliente, String nomeCliente, long CPF, String clienteLogin, Date dataNasc) {
        this.ID_Cliente = ID_Cliente;
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.clienteLogin = clienteLogin;
        this.dataNasc = dataNasc;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getClienteLogin() {
        return clienteLogin;
    }

    public void setClienteLogin(String clienteLogin) {
        this.clienteLogin = clienteLogin;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
}