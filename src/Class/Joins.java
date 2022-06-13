package Class;

import java.util.Date;
import java.sql.Time;


public class Joins {
    String nomeCliente;
    String nomeJogo;
    Date data;
    Time hora;

    public Joins() {
        
    }

    public Joins(String nomeCliente, String nomeJogo, Date data, Time hora) {
        this.nomeCliente = nomeCliente;
        this.nomeJogo = nomeJogo;
        this.data = data;
        this.hora = hora;
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
    
    
    
    
    
}
