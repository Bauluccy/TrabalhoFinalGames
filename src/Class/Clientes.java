package Class;

public class Clientes {
    int ID_CLiente;
    String nomeCLiente;
    int CPF;
    String clienteLogin;

    public Clientes() {
        
    }    
    
    public Clientes(int ID_CLiente, String nomeCLiente, int CPF, String clienteLogin) {
        this.ID_CLiente = ID_CLiente;
        this.nomeCLiente = nomeCLiente;
        this.CPF = CPF;
        this.clienteLogin = clienteLogin;
    }
    
    

    public int getID_CLiente() {
        return ID_CLiente;
    }

    public void setID_CLiente(int ID_CLiente) {
        this.ID_CLiente = ID_CLiente;
    }

    public String getNomeCLiente() {
        return nomeCLiente;
    }

    public void setNomeCLiente(String nomeCLiente) {
        this.nomeCLiente = nomeCLiente;
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
