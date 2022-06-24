/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Jogos;

import Class.Jogos;
import Dados.BDJogos;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fifol
 */
public class AlterarJogos extends javax.swing.JFrame {
//    TelaPrincipal telaprinc;
//    CadastrarClientes cadastroHis;
    
//    int indexID;
//    
//    public AlterarHistorico(TelaPrincipal tabela) {
//        this();
//        this.indexID = Integer.parseInt(tabela.ID_Index);
//    }
    

    
    ArrayList<Jogos> listaJogos = new ArrayList<Jogos>();
    
    
    /**
     * Creates new form Alterar
     */
    public AlterarJogos() {
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
        buttonAtualizar = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        textAlterTitulo = new javax.swing.JTextField();
        comboGenero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        textAlterValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabela Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Titulo");

        jLabel2.setText("Genero");

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

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Valor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancel)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAlterTitulo)
                            .addComponent(textAlterValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(35, 35, 35)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textAlterTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textAlterValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAtualizar)
                    .addComponent(buttonCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       int indexID = Integer.parseInt(TabelaJogos.ID_Index);
        
        procurarJogo(indexID);
//        carregaCombos();
        
    }//GEN-LAST:event_formWindowOpened

    private void buttonAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtualizarMouseClicked
        
        Jogos jogos = new Jogos();
        BDJogos bdj = new BDJogos();
        Date datahora = new Date();
        
        int indexID = Integer.parseInt(TabelaJogos.ID_Index);
        jogos = bdj.procurar(indexID);
        
        if(jogos != null){
            jogos.setID_Jogo(indexID);
            jogos.setNomeJogo(textAlterTitulo.getText());
            jogos.setGenero(comboGenero.getSelectedItem().toString());
            jogos.setValor(Double.parseDouble(textAlterValor.getText()));
            
            bdj.atualizar(jogos);
            JOptionPane.showMessageDialog(rootPane, "Atualizado com sucesso!!!");
            dispose();
        }else{
            System.out.println("Erro ao atualizar o jogo: " + indexID);
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
            java.util.logging.Logger.getLogger(AlterarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AlterarJogos().setVisible(true);
            }
        });
    }
    
    public void procurarJogo(int index){
        Jogos jogos = new Jogos();
        BDJogos bdj;
        
        carregaCombos();
        
        
            try {
                bdj = new BDJogos();
                jogos = bdj.procurar(index);
            }catch (Exception e) {
                System.out.println("Erro ao tentar receber id do jogo:" + e);
            }
            
            if(jogos == null){
                JOptionPane.showMessageDialog(null, "Linha inválida!");
            }else{
                textAlterTitulo.setText(jogos.getNomeJogo());
                textAlterValor.setText(Double.toString(jogos.getValor()));
                
                comboGenero.setSelectedItem(jogos.getGenero());
                
            }
    }
    
    public void carregaCombos(){
        
//      String[] generos = {"RPG", "FPS", "Looter Shooter", "Survival", "Rogue Like", "Hack'n Slash"};
        List<String> generos = new ArrayList<String>();
        generos.add("RPG");
        generos.add("FPS");
        generos.add("Looter Shooter");
        generos.add("Survival");
        generos.add("Rogue Like");
        generos.add("Hack'n Slash");
        generos.add("Mundo Aberto");
        generos.add("Puzzle");
        generos.add("Esporte");
        generos.add("Estratégia");
        generos.add("Terror");
        
        try {
            comboGenero.removeAllItems();
            BDJogos BDJ = new BDJogos();
            for(int i = 0; i < generos.size() -1; i++){
             comboGenero.addItem(generos.get(i));
            }
            
        } catch (Exception ex) {
            System.out.println("Erro em carregar combo" + ex);
        }

        for (int i = 0; i < listaJogos.size(); i++) {
            comboGenero.addItem(listaJogos.get(i).getGenero());
        }  
    }
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
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textAlterTitulo;
    private javax.swing.JTextField textAlterValor;
    // End of variables declaration//GEN-END:variables
}
