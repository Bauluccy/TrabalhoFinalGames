package GUI.Historico;

import Class.HistoricoDeCompras;
import Class.Joins;
import Dados.BDHistorico;
import Dados.BDJoins;
import GUI.Clientes.TabelaClientes;
import GUI.Jogos.TabelaJogos;
import GUI.Util.Configuracoes;
import java.awt.event.MouseEvent;
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

public class TelaPrincipal extends javax.swing.JFrame {
    
    ArrayList<Joins> historicoJoin = new ArrayList();
    ArrayList<HistoricoDeCompras> listaHistorico = new ArrayList<HistoricoDeCompras>();
    

    public int indexRow;
    public static String ID_Index; 
    
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
        Tabela.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        Tabela.getColumnModel().getColumn(7).setCellRenderer(centralizado);
        
        
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
        MenuClientes = new javax.swing.JMenuItem();
        MenuGames = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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

        Tabela.setAutoCreateRowSorter(true);
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Historico", "Data", "Hora", "Cliente", "Game", "Qnt", "Pagamento", "ValotTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TabelaMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);
        if (Tabela.getColumnModel().getColumnCount() > 0) {
            Tabela.getColumnModel().getColumn(0).setMinWidth(0);
            Tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        }

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

        jMenu1.setMnemonic('o');
        jMenu1.setText("Opções");

        MenuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenuClientes.setText("Clientes");
        MenuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuClientesMouseClicked(evt);
            }
        });
        MenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientesActionPerformed(evt);
            }
        });
        jMenu1.add(MenuClientes);

        MenuGames.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenuGames.setText("Games");
        MenuGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGamesActionPerformed(evt);
            }
        });
        jMenu1.add(MenuGames);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('f');
        jMenu2.setText("Ferramentas");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Configurações");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

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
        CadastrarHistorico formCadastro = new CadastrarHistorico();
        formCadastro.setVisible(true);
    }//GEN-LAST:event_botaoAdicionarMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        carregaTable();
    }//GEN-LAST:event_formWindowGainedFocus

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        if (evt.getClickCount() == 2) {
            indexRow = Tabela.getSelectedRow();
            ID_Index = Tabela.getValueAt(indexRow, 0).toString();
            AlterarHistorico formAlterarHist = new AlterarHistorico();
            formAlterarHist.setVisible(true);
        }
        
         
        
        if ((evt.getButton() == MouseEvent.BUTTON3)) { // Clique Direito
            indexRow = Tabela.getSelectedRow();
            ID_Index = Tabela.getValueAt(indexRow, 0).toString();
            int indexID = Integer.parseInt(ID_Index);
            int ativo; 
            int simNao = JOptionPane.showConfirmDialog(null, "Deseja excluir este historico?");
            
            if(simNao == 0){
                try {
                    ativo = 0;
                    BDHistorico bdh = new BDHistorico();
//                    HistoricoDeCompras historico = new HistoricoDeCompras();
                    bdh.excluir(indexID,ativo);
                    carregaTable();
                    JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso!!!:"+ indexID);
                } catch (Exception ex) {
                    System.out.println("problema");
                }
                
            }
        }
    }//GEN-LAST:event_TabelaMouseClicked

    private void TabelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaMouseExited

    private void MenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientesActionPerformed
        TabelaClientes tabelaClientes = new TabelaClientes();
        tabelaClientes.setLocationRelativeTo(rootPane);
        tabelaClientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuClientesActionPerformed

    private void MenuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuClientesMouseClicked
        
    }//GEN-LAST:event_MenuClientesMouseClicked

    private void MenuGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGamesActionPerformed
        TabelaJogos tabelaJogos = new TabelaJogos();
        tabelaJogos.setLocationRelativeTo(rootPane);
        tabelaJogos.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuGamesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Configuracoes telaConfig = new Configuracoes();
        telaConfig.setLocationRelativeTo(rootPane);
        telaConfig.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    
    
    
    public void carregaTable(){
        
        String nomeCliente, nomeJogo, tipoPagamento = null;
        Date data;
        Time hora;
        int ID_Historico, quantidade;
        double valorTotal;
        
        DefaultTableModel table = (DefaultTableModel) Tabela.getModel();
        
        
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
            int ativo = historicoJoin.get(i).getAtivo();
            if(ativo == 1){
                ID_Historico = historicoJoin.get(i).getID_Historico();
                String ID_HisString = Integer.toString(ID_Historico);
                
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
                
                table.addRow(new String[]{ID_HisString,dataFormatada,horaFormatada,nomeCliente,nomeJogo,quantidadeString,tipoPagamento, valorTotalString});
            }else{
                
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuClientes;
    private javax.swing.JMenuItem MenuGames;
    public javax.swing.JTable Tabela;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
