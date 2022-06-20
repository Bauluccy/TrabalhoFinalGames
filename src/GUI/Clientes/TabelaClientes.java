package GUI.Clientes;

import GUI.Historico.*;
import Class.HistoricoDeCompras;
import Class.Joins;
import Dados.BDJoins;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.Normalizer.Form;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TabelaClientes extends javax.swing.JFrame {
    
    ArrayList<Joins> historicoJoin = new ArrayList();
    ArrayList<HistoricoDeCompras> listaHistorico = new ArrayList<HistoricoDeCompras>();
    
    
    public TabelaClientes() {
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
        Tabela.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        botaoAdicionar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Historico de vendas");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Data", "Hora", "Cliente", "Game", "Qnt", "Pagamento", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAdicionarMouseClicked(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });

        jMenu1.setText("Opções");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Clientes");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Games");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(botaoAdicionar)
                .addGap(12, 12, 12)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAdicionar)
                    .addComponent(botaoSair)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregaTable();
    }//GEN-LAST:event_formWindowOpened

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        dispose();
    }//GEN-LAST:event_botaoSairMouseClicked

    private void botaoAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarMouseClicked
        CadastrarClientes formCadastro = new CadastrarClientes();
        formCadastro.setVisible(true);
    }//GEN-LAST:event_botaoAdicionarMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        carregaTable();
    }//GEN-LAST:event_formWindowGainedFocus

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
//        int index;
//        index = Tabela.getSelectedRow();
//         if (evt.getClickCount() == 2) {
//            if (index != -1) {
//                HistoricoDeCompras historico = new HistoricoDeCompras();
//                
//                DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");
//                String dataFormatada = dtOutput.format(historicoJoin.get(index).getData());
//                historico.setData(listaHistorico.get(index).getData());
//                get.setFone(JOptionPane.showInputDialog(rootPane, "Altere o telefone ", Fones.get(index).getFone()));
//                
//                    try {
//                        TelefoneDAO TDAO = new TelefoneDAO();
//                        TDAO.atualizar(tel);                    
//                        carregaFones();
//                    } catch (ErpDAOException ex) {
//                        System.out.println("problema");
//                    }
//                
//            }
//
//        }
        
        
    }//GEN-LAST:event_TabelaMouseClicked

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
            java.util.logging.Logger.getLogger(TabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaClientes().setVisible(true);
            }
        });
    }
    
    public void carregaTable(){
        DefaultTableModel table = (DefaultTableModel) Tabela.getModel();
        String nomeCliente, nomeJogo, tipoPagamento = null;
        Date data;
        Time hora;
        int quantidade;
        double valorTotal;
        
        
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
            Logger.getLogger(TabelaClientes.class.getName()).log(Level.SEVERE, null, ex);
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
            valorTotal = historicoJoin.get(i).getValorTotal();
            String valorTotalString = Double.toString(valorTotal);
            
            table.addRow(new String[]{dataFormatada,horaFormatada,nomeCliente,nomeJogo,quantidadeString,tipoPagamento, valorTotalString});
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
