package Class;

import java.sql.Time;
import java.util.Date;

public class HistoricoDeCompras {
    int ID_Historico;
    int ID_Cliente;
    int ID_Jogo;
    int quantidade;
    Date data;
    Time hora;
    String tipoPagamento;
    double valorTotal;

    public HistoricoDeCompras() {
        
    }

    public HistoricoDeCompras(int ID_Historico, int ID_Cliente, int ID_Jogo, int quantidade, Date data, Time hora, String tipoPagamento, double valorTotal) {
        this.ID_Historico = ID_Historico;
        this.ID_Cliente = ID_Cliente;
        this.ID_Jogo = ID_Jogo;
        this.quantidade = quantidade;
        this.data = data;
        this.hora = hora;
        this.tipoPagamento = tipoPagamento;
        this.valorTotal = valorTotal;
    }

    public int getID_Historico() {
        return ID_Historico;
    }

    public void setID_Historico(int ID_Historico) {
        this.ID_Historico = ID_Historico;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public int getID_Jogo() {
        return ID_Jogo;
    }

    public void setID_Jogo(int ID_Jogo) {
        this.ID_Jogo = ID_Jogo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    
}

   