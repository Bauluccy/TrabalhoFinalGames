package GUI;

import Class.Joins;
import Dados.BDJoins;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TelaPrincipal extends javax.swing.JFrame {
    
    ArrayList<Joins> historicoJoin = new ArrayList();
    
    
    public TelaPrincipal() {
        initComponents();
        JTableHeader header =  Tabela.getTableHeader();
        DefaultTableCellRenderer centralizado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        Tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        Tabela.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        Tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        Tabela.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        Tabela.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        Tabela.getColumnModel().getColumn(5).setCellRenderer(centralizado);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Data", "Hora", "Cliente", "Game", "Qnt", "Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jButton1.setText("Adicionar");

        jButton2.setText("Sair");

        jMenu1.setText("Opções");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel table = (DefaultTableModel) Tabela.getModel();
        String nomeCliente, nomeJogo, tipoPagamento = null;
        Date data;
        Time hora;
        int quantidade;
        
        
        if(Tabela.getRowCount() > 0){
            while (Tabela.getRowCount() > 0){
                table.removeRow(0);
            }
        }
        
        BDJoins bdjoin;
        
        try{
            bdjoin = new BDJoins();
            historicoJoin = bdjoin.joinsListar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco." + ex);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        for(int i = 0; i < historicoJoin.size(); i++){
            DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = dtOutput.format(historicoJoin.get(i).getData());
            
            DateFormat hrOutput = new SimpleDateFormat("HH:mm");
            String horaFormatada = hrOutput.format(historicoJoin.get(i).getHora());
            
            nomeCliente = historicoJoin.get(i).getNomeCliente();
            nomeJogo = historicoJoin.get(i).getNomeJogo();
            quantidade = historicoJoin.get(i).getQuantidade();
            String quantidadeString = Integer.toString(quantidade);
            
            tipoPagamento = historicoJoin.get(i).getTipoPagamento();
            
            
            table.addRow(new String[]{dataFormatada,horaFormatada,nomeCliente,nomeJogo,quantidadeString,tipoPagamento});
        }
        
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
