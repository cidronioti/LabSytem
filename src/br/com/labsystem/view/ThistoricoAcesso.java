package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.ModeloTabela;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author CIDRONIO
 */
public class ThistoricoAcesso extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    JFileChooser gerarPDF=new JFileChooser();
    public ThistoricoAcesso() {
        initComponents();
        preencherTabela("select * from controle_acesso");
        setIconeForme();
    }
    @SuppressWarnings("unchecked")

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonImprimirHistorico = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelMensagem = new javax.swing.JLabel();
        jButtonGeraPdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSys 1.0 - Visualizar Histórico de Acesso");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonImprimirHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/visualizar.png"))); // NOI18N
        jButtonImprimirHistorico.setText("Visualizar Histórico");
        jButtonImprimirHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonImprimirHistoricoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonImprimirHistoricoMouseReleased(evt);
            }
        });
        jButtonImprimirHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirHistoricoActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonGeraPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/pdf (2).png"))); // NOI18N
        jButtonGeraPdf.setText("Gerar PDF");
        jButtonGeraPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeraPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGeraPdf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonImprimirHistorico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSair)
                        .addGap(22, 22, 22))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonImprimirHistorico)
                        .addComponent(jButtonSair)
                        .addComponent(jButtonGeraPdf))
                    .addComponent(jLabelMensagem))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(556, 309));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonImprimirHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirHistoricoActionPerformed
        try {
            Connection conectaR = new ConectaBanco().conexaoRetorno();
            HashMap parameter = new HashMap();
            JasperPrint jasperPrint;
            jasperPrint = JasperFillManager.fillReport("./ireport/hitorico.jasper", parameter, conectaR);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setTitle("LabSys 1.0 - Relatório de Histórico de Acesso");///setando o título na barra de titulos
            jasperViewer.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));//setando o icone na barra de titulos
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            // Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonImprimirHistoricoActionPerformed

    private void jButtonImprimirHistoricoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonImprimirHistoricoMousePressed
        
    }//GEN-LAST:event_jButtonImprimirHistoricoMousePressed

    private void jButtonImprimirHistoricoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonImprimirHistoricoMouseReleased
        
    }//GEN-LAST:event_jButtonImprimirHistoricoMouseReleased

    private void jButtonGeraPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeraPdfActionPerformed
//        try {//problema no caminho do relatorio
//                Connection conectaR = new ConectaBanco().conexaoRetorno();
//                HashMap parameter = new HashMap();
//                JasperPrint jasperPrint;
//                jasperPrint = JasperFillManager.fillReport("./ireport/hitorico.jasper", parameter, conectaR);
//                JasperExportManager.exportReportToPdfFile(jasperPrint, "./hitorico_acesso.pdf");
//                JOptionPane.showMessageDialog(rootPane, "Relatório no Formato PDF Gerado com Sucesso!");
//            } catch (JRException ex) {
//                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatório" + ex);
//            }
//        conecta.desconecta();
        GenerarPDF();
    }//GEN-LAST:event_jButtonGeraPdfActionPerformed

     public void preencherTabela(String SQL){ //criando tabela
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Matricula","Nome","Data Acesso","Cod Maquina", "Hora Entrada","Hora Saida"};
        conecta.conexao();
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("cod_usuario"),conecta.rs.getString("nome_usuario"),conecta.rs.getString("data_acesso"),conecta.rs.getString("cod_maquina"), conecta.rs.getString("hora_entrada"),conecta.rs.getString("hora_saida")});
            }while(conecta.rs.next());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher Tabela!\n Erro" +ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(5).setResizable(false);
        
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conecta.desconecta();      
    }
     
    private void setIconeForme() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }
    
     void GenerarPDF() {
        int resp;
        Calendar c = Calendar.getInstance();
        String fecha = String.valueOf(c.get(Calendar.DATE));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.MONTH));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.YEAR));
        resp = gerarPDF.showSaveDialog(this);//JFileChooser de nome RealizarBackupMySQL
        if (resp == JFileChooser.APPROVE_OPTION) {//Se o usuario presionar salvar; genera o Backup
            String caminho = (String.valueOf(gerarPDF.getSelectedFile().toString())
                    + "_" + fecha + ".pdf");// pegando o caminho do diretorio onde o pdf sera salvo
            try {//problema no caminho do relatorio
                Connection conectaR = new ConectaBanco().conexaoRetorno();
                HashMap parameter = new HashMap();
                JasperPrint jasperPrint;
                jasperPrint = JasperFillManager.fillReport("./ireport/hitorico.jasper", parameter, conectaR);
                JasperExportManager.exportReportToPdfFile(jasperPrint, caminho);
                JOptionPane.showMessageDialog(rootPane, "Relatório no Formato PDF Gerado com Sucesso!");
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatório" + ex);
            }
            conecta.desconecta();

        } else if (resp == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Geração do PDF Cancelada!");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThistoricoAcesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGeraPdf;
    private javax.swing.JButton jButtonImprimirHistorico;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
