package Class;

import java.util.Date;
import java.sql.Time;


public class Joins {
    int ID_Historico;
    int ID_cliente;
    int ID_jogo;
    String nomeCliente;
    String nomeJogo;
    Date data;
    Time hora;
    int quantidade;
    String tipoPagamento;
    double valorTotal;

    public Joins() {
        
    }

    public Joins(int ID_Historico, String nomeCliente, String nomeJogo, Date data, Time hora, int quantidade, String tipoPagamento, double valorTotal) {
        this.ID_Historico = ID_Historico;
        this.nomeCliente = nomeCliente;
        this.nomeJogo = nomeJogo;
        this.data = data;
        this.hora = hora;
        this.quantidade = quantidade;
        this.tipoPagamento = tipoPagamento;
        this.valorTotal = valorTotal;
    }
    
    

    public Joins(int ID_Historico, int ID_cliente, int ID_jogo, String nomeCliente, String nomeJogo, Date data, Time hora, int quantidade, String tipoPagamento, double valorTotal) {
        this.ID_Historico = ID_Historico;
        this.ID_cliente = ID_cliente;
        this.ID_jogo = ID_jogo;
        this.nomeCliente = nomeCliente;
        this.nomeJogo = nomeJogo;
        this.data = data;
        this.hora = hora;
        this.quantidade = quantidade;
        this.tipoPagamento = tipoPagamento;
        this.valorTotal = valorTotal;
    }
    
    

    public int getID_Historico() {
        return ID_Historico;
    }

    public void setID_Historico(int ID_Historico) {
        this.ID_Historico = ID_Historico;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public int getID_jogo() {
        return ID_jogo;
    }

    public void setID_jogo(int ID_jogo) {
        this.ID_jogo = ID_jogo;
    }

    

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    
    
}
