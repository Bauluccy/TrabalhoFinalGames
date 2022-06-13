package Class;

public class Clientes {
    int ID_Cliente;
    String nomeCliente;
    int CPF;
    String clienteLogin;

    public Clientes() {
    }

    public Clientes(int ID_Cliente, String nomeCliente, int CPF, String clienteLogin) {
        this.ID_Cliente = ID_Cliente;
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.clienteLogin = clienteLogin;
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

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getClienteLogin() {
        return clienteLogin;
    }

    public void setClienteLogin(String clienteLogin) {
        this.clienteLogin = clienteLogin;
    }
    
    
}