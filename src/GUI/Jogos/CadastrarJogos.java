package GUI.Jogos;

import Class.Jogos;
import Dados.BDJogos;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import java.sql.Time;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CadastrarJogos extends javax.swing.JFrame {
    ArrayList<Jogos> listaJogos = new ArrayList<Jogos>();

    public CadastrarJogos() {
        initComponents();
//        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboCadGenero = new javax.swing.JComboBox<>();
        botaoOk = new javax.swing.JButton();
        botaoCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        textCadValor = new javax.swing.JTextField();
        textCadJogo = new javax.swing.JTextField();

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

        jLabel1.setText("Titulo");

        jLabel2.setText("Genero");

        comboCadGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        jLabel7.setText("Valor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboCadGenero, 0, 127, Short.MAX_VALUE)
                            .addComponent(textCadJogo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCadValor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(textCadValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCadJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboCadGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void botaoOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOkMouseClicked

        Jogos jogos = new Jogos();
        try{
            if(textCadJogo.getText().equals("") || textCadValor.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Insira todos os campos! ");
            }else{
                jogos.setID_Jogo(jogos.getID_Jogo());
                jogos.setNomeJogo(textCadJogo.getText());
                jogos.setGenero(comboCadGenero.getSelectedItem().toString());
    
                jogos.setValor(Double.parseDouble(textCadValor.getText()));
                jogos.setAtivo(1);
                
                JOptionPane.showMessageDialog(rootPane, "Inserido com sucesso!");
                BDJogos BDEXE = new BDJogos();
                BDEXE.inserir(jogos);
                dispose();
            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Insira todos os campos!!! ");
        }

        

    }//GEN-LAST:event_botaoOkMouseClicked

    private void botaoCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarJogos().setVisible(true);
            }
        });
    }
    
    public void carregarCombos(){
        //START COMBOS
        //Carregar combo
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
        
//                {"RPG", "FPS", "Looter Shooter", "Survival", "Rogue Like", "Hack'n Slash"};
        
        try {
            generos.add("RPG");
            comboCadGenero.removeAllItems();
            BDJogos BDJ = new BDJogos();
            for(int i = 0; i < generos.size() -1; i++){
             comboCadGenero.addItem(generos.get(i));
                
            }
//            comboCadGenero.setModel(new DefaultComboBoxModel<String>(generos));
        } catch (Exception ex) {
            System.out.println("Erro ao listar jogos" + ex);
        }

        
        
        for (int i = 0; i < listaJogos.size(); i++) {
            comboCadGenero.addItem(listaJogos.get(i).getGenero());
        }  
        
        //END COMBOS//
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancel;
    private javax.swing.JButton botaoOk;
    private javax.swing.JComboBox<String> comboCadGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField textCadJogo;
    private javax.swing.JTextField textCadValor;
    // End of variables declaration//GEN-END:variables
}
