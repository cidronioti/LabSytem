package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.ModeloTabela;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author CIDRONIO
 */
public class Tfrequencia extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();//instanciando a classe que faz conxão com o banco de dados
    String data;
    JFileChooser gerarPDF=new JFileChooser();
    public Tfrequencia(String data) {
        initComponents();
        preencherTabela("select * from controle_acesso");//chamando o metodo preencher tabela e passando uma string sql como parametro
        this.data = data;
        mascaras();
        setIconeForme();
    }

    public Tfrequencia() {initComponents();}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButtonFrequenciaDia = new javax.swing.JRadioButton();
        jRadioButtonOutraData = new javax.swing.JRadioButton();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelContaRegistros = new javax.swing.JLabel();
        jButtonGeraPdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSys 1.0 - Relatório de Frequencia");
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

        buttonGroup1.add(jRadioButtonFrequenciaDia);
        jRadioButtonFrequenciaDia.setSelected(true);
        jRadioButtonFrequenciaDia.setText("Frequencia do Dia");
        jRadioButtonFrequenciaDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonFrequenciaDiaMouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButtonOutraData);
        jRadioButtonOutraData.setText("Outra Data");
        jRadioButtonOutraData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonOutraDataMouseClicked(evt);
            }
        });

        jFormattedTextFieldData.setEnabled(false);
        jFormattedTextFieldData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldDataKeyPressed(evt);
            }
        });

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/database_search.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/visualizar.png"))); // NOI18N
        jButtonImprimir.setText("Visualizar");
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelContaRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGeraPdf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonFrequenciaDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonOutraData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBuscar)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonFrequenciaDia)
                    .addComponent(jRadioButtonOutraData)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonImprimir)
                    .addComponent(jLabelContaRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGeraPdf))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(540, 359));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jRadioButtonFrequenciaDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonFrequenciaDiaMouseClicked
        jRadioButtonFrequenciaDia.setSelected(true);
        jRadioButtonOutraData.setSelected(false);
        jFormattedTextFieldData.setEnabled(false);
        jFormattedTextFieldData.setText("");
    }//GEN-LAST:event_jRadioButtonFrequenciaDiaMouseClicked

    private void jRadioButtonOutraDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonOutraDataMouseClicked
        jRadioButtonFrequenciaDia.setSelected(false);
        jRadioButtonOutraData.setSelected(true);
        jFormattedTextFieldData.setEnabled(true);
        jFormattedTextFieldData.requestFocus();
    }//GEN-LAST:event_jRadioButtonOutraDataMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if(jRadioButtonFrequenciaDia.isSelected()){//preenche a tabela com os dados da frequencia do dia
            preencherTabela("select * from controle_acesso where data_acesso = '"+data+"'");
        }else{
            if(jFormattedTextFieldData.getText().equals("  /  /    ")){
                JOptionPane.showMessageDialog(null, "Campo data vazio!");
            }else{//preenche a tabela com os dados da frequencia de uma data informada pelo usuario
                preencherTabela("select * from controle_acesso where data_acesso = '"+jFormattedTextFieldData.getText()+"'");
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirActionPerformed
        conecta.conexao();
        if (jRadioButtonFrequenciaDia.isSelected()) {
            try {//gera o relatorio a partir da data atual
                Connection conectaR = new ConectaBanco().conexaoRetorno();
                HashMap parameter = new HashMap();
                parameter.put("DATA_ACESSO", data);
                JasperPrint jasperPrint;
                jasperPrint = JasperFillManager.fillReport("ireport/fraquencia.jasper", parameter, conectaR);
                JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                jasperViewer.setTitle("LabSys 1.0 - Relatório de Frequencia Diária");///setando o título na barra de titulos
                jasperViewer.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));//setando o icone na barra de titulos
                jasperViewer.setVisible(true);
                jasperViewer.toFront();
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatório" + ex);
            }
        } else {
            try {//gera o relatorio a partir de uma data informada pelo usuario               
                Connection conectaR = new ConectaBanco().conexaoRetorno();
                HashMap parameter = new HashMap();
                parameter.put("DATA_ACESSO", jFormattedTextFieldData.getText());
                JasperPrint jasperPrint;
                jasperPrint = JasperFillManager.fillReport("ireport/fraquencia.jasper", parameter, conectaR);// setando o caminho do relatório
                JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                jasperViewer.setTitle("LabSys 1.0 - Relatório de Frequencia Diária");///setando o título na barra de titulos
                jasperViewer.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));//setando o icone na barra de titulos
                jasperViewer.setVisible(true);
                jasperViewer.toFront();//seta o relatorio para frente da aplicaçao
                               
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatório" + ex);
            }
        }
        conecta.desconecta();
    }//GEN-LAST:event_jButtonImprimirActionPerformed

    private void jButtonGeraPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeraPdfActionPerformed
        GenerarPDF();
    }//GEN-LAST:event_jButtonGeraPdfActionPerformed

    private void jFormattedTextFieldDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {//faz a busca se a tecla enter for pressionada no momento em que o foco estiver no campo de texto referente a buca
            if (jRadioButtonFrequenciaDia.isSelected()) {
                preencherTabela("select * from controle_acesso where data_acesso = '" + data + "'");
            } else {
                if (jFormattedTextFieldData.getText().equals("  /  /    ")) {
                    JOptionPane.showMessageDialog(null, "Campo data vazio!");
                } else {
                    preencherTabela("select * from controle_acesso where data_acesso = '" + jFormattedTextFieldData.getText() + "'");
                }
            }
        }
    }//GEN-LAST:event_jFormattedTextFieldDataKeyPressed
    
    public  void mascaras(){
        try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##/##/####");
            jFormattedTextFieldData.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }
        
    }
    
    public void preencherTabela(String SQL){ //preenche a tabela com os dados retornados da consulta que é recebida por parametro
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Matricula","Nome","Data Acesso","Cod Maquina", "Hora Entrada","Hora Saida"};
        conecta.conexao();
        conecta.executaSQL(SQL);
        int i = 0;
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("cod_usuario"),conecta.rs.getString("nome_usuario"),conecta.rs.getString("data_acesso"),conecta.rs.getString("cod_maquina"), conecta.rs.getString("hora_entrada"),conecta.rs.getString("hora_saida")});
                i++;
            }while(conecta.rs.next());
            jLabelContaRegistros.setText(String.valueOf(i)+" Registros");//seta para um jlabel o total de registros presentes na tabela
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ERRO - Esta Data não Existe ou Houve Algum Problema com a Base de Dados!\n Erro" +ex);
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
 
    private void setIconeForme() {//seta o icone que ira aparecer na barra de titulos e na barra de ferramentas do sistema operacional
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }
    
    void GenerarPDF(){
        int resp;
        Calendar c=Calendar.getInstance();
        String fecha=String.valueOf(c.get(Calendar.DATE));
        fecha=fecha+"-"+String.valueOf(c.get(Calendar.MONTH));
        fecha=fecha+"-"+String.valueOf(c.get(Calendar.YEAR));     
        resp=gerarPDF.showSaveDialog(this);//JFileChooser de nome RealizarBackupMySQL
        if (resp==JFileChooser.APPROVE_OPTION) {//Se o usuario presionar salvar; genera o Backup
            String caminho = (String.valueOf(gerarPDF.getSelectedFile().toString())
                        +"_"+fecha+".pdf");// pegando o caminho do diretorio onde o pdf sera salvo
            if (jRadioButtonFrequenciaDia.isSelected()) {
            try {//gera o pdf a partir da data atual
                Connection conectaR = new ConectaBanco().conexaoRetorno();
                HashMap parameter = new HashMap();
                parameter.put("DATA_ACESSO", data);
                JasperPrint jasperPrint;
                jasperPrint = JasperFillManager.fillReport("ireport/fraquencia.jasper", parameter, conectaR);
                JasperExportManager.exportReportToPdfFile(jasperPrint, caminho);
                JOptionPane.showMessageDialog(rootPane, "Relatório no Formato PDF Gerado com Sucesso!");
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatório" + ex);
            }
        } else {
            try {//gera o pdf a partir de uma data informada pelo usuario
                Connection conectaR = new ConectaBanco().conexaoRetorno();
                HashMap parameter = new HashMap();
                parameter.put("DATA_ACESSO", jFormattedTextFieldData.getText());
                JasperPrint jasperPrint;
                jasperPrint = JasperFillManager.fillReport("ireport/fraquencia.jasper", parameter, conectaR);
                JasperExportManager.exportReportToPdfFile(jasperPrint, caminho);
                JOptionPane.showMessageDialog(rootPane, "Relatório no Formato PDF Gerado com Sucesso!");
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatório no" + ex);
            }
        }
        } else if (resp==JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null,"Geração do PDF Cancelada!");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tfrequencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGeraPdf;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabelContaRegistros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFrequenciaDia;
    private javax.swing.JRadioButton jRadioButtonOutraData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
