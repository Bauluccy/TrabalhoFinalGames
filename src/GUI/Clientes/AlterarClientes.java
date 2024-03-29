/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Clientes;

import Class.Clientes;
import Dados.BDClientes;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fifol
 */
public class AlterarClientes extends javax.swing.JFrame {
//    TelaPrincipal telaprinc;
    CadastrarClientes cadastroHis;
    
//    int indexID;
//    
//    public AlterarHistorico(TelaPrincipal tabela) {
//        this();
//        this.indexID = Integer.parseInt(tabela.ID_Index);
//    }
    

    
    ArrayList<Clientes> listaCliente = new ArrayList<Clientes>();
    
    
    /**
     * Creates new form Alterar
     */
    public AlterarClientes() {
        initComponents();
//        this.telaprinc = new TelaPrincipal();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        alterDataCliente = new datechooser.beans.DateChooserCombo();
        buttonAtualizar = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        textAlterNome = new javax.swing.JTextField();
        textAlterCPF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textAlterLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabela Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Data");

        alterDataCliente.setCalendarPreferredSize(new java.awt.Dimension(370, 250));

        buttonAtualizar.setText("Atualizar");
        buttonAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAtualizarMouseClicked(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelMouseClicked(evt);
            }
        });

        jLabel8.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAlterNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textAlterLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(alterDataCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textAlterCPF))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textAlterNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textAlterCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(alterDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(textAlterLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAtualizar)
                    .addComponent(buttonCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       int indexID = Integer.parseInt(TabelaClientes.ID_Index);
        
        procuraCliente(indexID);
        
    }//GEN-LAST:event_formWindowOpened

    private void buttonAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtualizarMouseClicked
        
        Clientes clientes = new Clientes();
        BDClientes bdc = new BDClientes();
        Date datahora = new Date();
        
        int indexID = Integer.parseInt(TabelaClientes.ID_Index);
        DateFormat dtoutput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        clientes = bdc.procurar(indexID);
        
        if(clientes != null){
            clientes.setID_Cliente(indexID);
            clientes.setNomeCliente(textAlterNome.getText());
            clientes.setCPF(Long.parseLong(textAlterCPF.getText()));
            try{
                Calendar dataSelecionada = alterDataCliente.getSelectedDate();
                java.sql.Date dataSQL = new java.sql.Date(dataSelecionada.getTimeInMillis());
                clientes.setDataNasc(dataSQL);
            }catch(Exception e){
                e.printStackTrace();
            }
            clientes.setClienteLogin(textAlterLogin.getText());
            
            
            bdc.atualizar(clientes);
            JOptionPane.showMessageDialog(rootPane, "Atualizado com sucesso!!!");
            dispose();
        }else{
            System.out.println("Erro ao atualizar usuario: ");
        }
        
    }//GEN-LAST:event_buttonAtualizarMouseClicked

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
        dispose();
    }//GEN-LAST:event_buttonCancelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarClientes().setVisible(true);
            }
        });
    }
    
    public void procuraCliente(int index){
        Clientes clientes = new Clientes();
        BDClientes bdc;
        
//        carregaCombos();
        
        
//        if (principal.Tabela.getSelectedRow() != -1) {
            try {
                bdc = new BDClientes();
                clientes = bdc.procurar(index);
            }catch (Exception e) {
                System.out.println("Erro ao tentar receber id do cliente:" + e);
            }
            
            if(clientes == null){
                JOptionPane.showMessageDialog(null, "Linha inválida!");
            }else{
                textAlterNome.setText(clientes.getNomeCliente());
                textAlterCPF.setText(Long.toString(clientes.getCPF()));
                
                Date data = clientes.getDataNasc();
                Calendar cal = Calendar.getInstance();
                cal.setTime(data);
                alterDataCliente.setSelectedDate(cal);
                textAlterLogin.setText(clientes.getClienteLogin());
                
            }
    }
    
//    public void carregaCombos(){
//        
//        //START COMBOS
//        //Carregar combo Clientes
//        try {
//            comboAlterCliente.removeAllItems();
//            BDClientes BDC = new BDClientes();
//            listaCliente = BDC.listar();
//        } catch (Exception ex) {
//            System.out.println("Erro qualquer" + ex);
//        }
//
//        for (int i = 0; i < listaCliente.size(); i++) {
//            comboAlterCliente.addItem(listaCliente.get(i).getNomeCliente());
//        }  
//        
//        //Carregar combo Games
//        try {
//            comboAlterJogo.removeAllItems();
//            BDJogos BDJ = new BDJogos();
//            listaJogos = BDJ.listar();
//        } catch (Exception ex) {
//            System.out.println("Erro qualquer" + ex);
//        }
//
//        for (int i = 0; i < listaJogos.size(); i++) {
//            comboAlterJogo.addItem(listaJogos.get(i).getNomeJogo());
//        }
//        
//        //Carregar combo Qquantidade
//        try {
//            comboAlterQnt.removeAllItems();
//        } catch (Exception ex) {
//            System.out.println("Erro qualquer" + ex);
//        }
//
//        for (int i = 1; i < 11; i++) {
//            comboAlterQnt.addItem(""+i);
//        }
//        
//        
//        //Carregar combo Pagamentos
//        try {
//            comboAlterPag.removeAllItems();
//            BDHistorico BDH = new BDHistorico();
//            listaHistorico = BDH.listarPagamentos();
//            
//            
//            
//        } catch (Exception ex) {
//            System.out.println("Erro qualquer" + ex);
//        }
//        
//        
//        for (int i = 0; i < listaHistorico.size(); i++) {
//            comboAlterPag.addItem(listaHistorico.get(i).getTipoPagamento());
//        }  
//        //END COMBOS//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo alterDataCliente;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField textAlterCPF;
    private javax.swing.JTextField textAlterLogin;
    private javax.swing.JTextField textAlterNome;
    // End of variables declaration//GEN-END:variables
}
