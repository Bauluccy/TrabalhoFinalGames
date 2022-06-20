/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidade;

import Class.Clientes;
import Class.HistoricoDeCompras;
import Class.Jogos;
import Class.Joins;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author fifol
 */
public class TableModelGames extends AbstractTableModel{
    
    public ArrayList<Joins> joinsTBModel = new ArrayList<Joins>();
    public ArrayList<Clientes> clientesTBModel = new ArrayList<Clientes>();
    public ArrayList<Jogos> jogosTBModel = new ArrayList<Jogos>();
    public ArrayList<HistoricoDeCompras> historicoTBModel = new ArrayList<HistoricoDeCompras>();

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return historicoTBModel.get(linha).getData();
            case 1:
                return historicoTBModel.get(linha).getHora();
            case 2:
                return clientesTBModel.get(linha).getNomeCliente();
            case 3:
                return jogosTBModel.get(linha).getNomeJogo();
            case 4:
                return historicoTBModel.get(linha).getQuantidade();
            case 5:
                return historicoTBModel.get(linha).getTipoPagamento();
            case 6:
                return historicoTBModel.get(linha).getValorTotal();
                
        }
        return null;
    }
    
    
    @Override
    public void setValueAt(Object valor,int linha, int coluna) {
        switch (coluna) {
            case 0:
                DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");
                Date data;  
            try {
                data = dtOutput.parse((String) valor);
                historicoTBModel.get(linha).setData(data);
            } catch (ParseException ex) {
                System.out.println("Problema na data em TableModelGames" + ex);
            }
            break;
            case 1:
                DateFormat hrOutput = new SimpleDateFormat("HH:mm");
                Time time;
                try{
                    time = (Time) hrOutput.parse((String) valor);
                    historicoTBModel.get(linha).setHora(time);
                }catch(ParseException ex){
                    System.out.println("Problema na hora em TableModelGames" + ex);
                }
            break;
            case 2:
                clientesTBModel.get(linha).setNomeCliente((String) valor);
            break;
            case 3:
                jogosTBModel.get(linha).setNomeJogo((String) valor);
            break;
            case 4:
                historicoTBModel.get(linha).setQuantidade(Integer.parseInt((String) valor));
            break;
            case 5:
                historicoTBModel.get(linha).setTipoPagamento((String) valor);
            break;
            case 6:
                historicoTBModel.get(linha).setValorTotal(Double.parseDouble((String) valor));
                break;
        }
    }
    
    
    public Joins get(int row) { return joinsTBModel.get(row); };
    
}
