package GUI.Historico;

import Class.Clientes;
import Class.HistoricoDeCompras;
import Class.Jogos;
import Class.Joins;
import Dados.BDClientes;
import Dados.BDHistorico;
import Dados.BDJogos;
import Dados.BDJoins;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import java.sql.Time;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CadastrarHistorico extends javax.swing.JFrame {
    ArrayList<Joins> listaJoins = new ArrayList<Joins>();
    ArrayList<Clientes> listaCliente = new ArrayList<Clientes>();
    ArrayList<Jogos> listaJogos = new ArrayList<Jogos>();
    ArrayList<HistoricoDeCompras> listaHistorico = new ArrayList<HistoricoDeCompras>();

    public CadastrarHistorico() {
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboJogo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        dateChooser = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboQnt = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboPagamento = new javax.swing.JComboBox<>();
        botaoOk = new javax.swing.JButton();
        botaoCancel = new javax.swing.JButton();
        timePickerHora = new com.github.lgooddatepicker.components.TimePicker();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Cliente");

        comboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Game");

        comboJogo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Data");

        dateChooser.setCalendarPreferredSize(new java.awt.Dimension(350, 200));
        try {
            dateChooser.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }

        jLabel4.setText("Hora");

        jLabel5.setText("Quantidade");

        comboQnt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Pagamento");

        comboPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botaoOk.setText("OK");
        botaoOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoOkMouseClicked(evt);
            }
        });

        botaoCancel.setText("Cancel");
        botaoCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelActionPerformed(evt);
            }
        });

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
                        .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboJogo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timePickerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboPagamento, 0, 169, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(comboQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(comboJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(timePickerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(comboPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(botaoOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCancel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        carregarCombos();
        
    }//GEN-LAST:event_formWindowOpened

    private void botaoCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelActionPerformed

    private void botaoOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOkMouseClicked
            
            HistoricoDeCompras historico = new HistoricoDeCompras();
        try{
            if(dateChooser.getSelectedDate().equals("") || timePickerHora.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Preencha todos os campos! ");
                
            }else{
                historico.setID_Cliente(comboCliente.getSelectedIndex()+1);
                historico.setID_Jogo(comboJogo.getSelectedIndex()+1);
                
                Calendar dataSelecionada = dateChooser.getSelectedDate();
                java.sql.Date dataSQL = new java.sql.Date(dataSelecionada.getTimeInMillis());
                historico.setData(dataSQL);
                
                
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                String horaSelecionada = timePickerHora.getText();
                    Time time = new Time(format.parse(horaSelecionada).getTime());
                    historico.setHora(time);
                
                historico.setQuantidade(Integer.parseInt(comboQnt.getSelectedItem().toString()));
                historico.setTipoPagamento(comboPagamento.getSelectedItem().toString());
                
                double valorJogosTotal;
                
                for(int i = comboJogo.getSelectedIndex(); i <= comboJogo.getSelectedIndex(); i++)
                { 
                    if(listaJogos.get(i).getAtivo() == 1){
                        valorJogosTotal = listaJogos.get(i).getValor() * Double.parseDouble(comboQnt.getSelectedItem().toString());
                        historico.setValorTotal(valorJogosTotal);
                        
                    }else{
                        
                    }
                }
                historico.setAtivo(1);
            
                BDHistorico BDEXE = new BDHistorico();
                BDEXE.inserir(historico);
                dispose();
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Insira todos os campos! ");
        }
        
        
    }//GEN-LAST:event_botaoOkMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    }//GEN-LAST:event_formWindowGainedFocus

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CadastrarHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarHistorico().setVisible(true);
            }
        });
    }
    
    public void carregarCombos(){
        //START COMBOS
        //Carregar combo Clientes
        try {
            comboCliente.removeAllItems();
            BDClientes BDC = new BDClientes();
            listaCliente = BDC.listar();
        } catch (Exception ex) {
            System.out.println("Erro combo clientes" + ex);
        }

        for (int i = 0; i < listaCliente.size(); i++) {
            comboCliente.addItem(listaCliente.get(i).getNomeCliente());
        }  
        
        //Carregar combo Games
        try {
            comboJogo.removeAllItems();
            BDJogos BDJ = new BDJogos();
            listaJogos = BDJ.listar();
        } catch (Exception ex) {
            System.out.println("Erro combo games" + ex);
        }

        for (int i = 0; i < listaJogos.size(); i++) {
            if(listaJogos.get(i).getAtivo() == 1){
                comboJogo.addItem(listaJogos.get(i).getNomeJogo());
            }else{
                
            }
        }
        
        //Carregar combo Quantidade
        try {
            comboQnt.removeAllItems();
        } catch (Exception ex) {
            System.out.println("Erro combo quantidade" + ex);
        }

        for (int i = 1; i < 11; i++) {
            comboQnt.addItem(""+i);
        }
        
        
        //Carregar combo Pagamentos
        String[] tipoPag = {"Cartão Crédito", "Cartão Débito", "Boleto", "Pix"};
        try {
            comboPagamento.removeAllItems();
            BDHistorico BDH = new BDHistorico();
            
            comboPagamento.setModel(new DefaultComboBoxModel<String>(tipoPag));
            
            
        } catch (Exception ex) {
            System.out.println("Erro qualquer" + ex);
        }
        
        
        for (int i = 0; i < listaHistorico.size(); i++) {
            comboPagamento.addItem(listaHistorico.get(i).getTipoPagamento());
        }  
        //END COMBOS//
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancel;
    private javax.swing.JButton botaoOk;
    private javax.swing.JComboBox<String> comboCliente;
    private javax.swing.JComboBox<String> comboJogo;
    private javax.swing.JComboBox<String> comboPagamento;
    private javax.swing.JComboBox<String> comboQnt;
    private datechooser.beans.DateChooserCombo dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private com.github.lgooddatepicker.components.TimePicker timePickerHora;
    // End of variables declaration//GEN-END:variables
}
