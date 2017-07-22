package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.HoarioControle;
import br.com.labsystem.bean.HorarioModelo;
import br.com.labsystem.bean.ModeloTabela;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author CIDRONIO
 */
public class ThorarioMonitoria extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    HorarioModelo modelo = new HorarioModelo();
    HoarioControle controle = new HoarioControle();
    String horaInicio,horaFim;
    public ThorarioMonitoria() {
        initComponents();
        mascaras();
        preencheCombos();
        //autoComplete();
        //preencherTabela("select * from cad_horario order by hora_inicio");
        preencheTabelaConstrutor();
        
        setIconeForme();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jFormattedTextFieldHoraInicioBusca = new javax.swing.JFormattedTextField();
        jFormattedTextFieldHoraFimBusca = new javax.swing.JFormattedTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldHoraFim = new javax.swing.JFormattedTextField();
        jFormattedTextFieldHoraInicio = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSeg = new javax.swing.JComboBox();
        jComboBoxTer = new javax.swing.JComboBox();
        jComboBoxQua = new javax.swing.JComboBox();
        jComboBoxQuin = new javax.swing.JComboBox();
        jComboBoxSex = new javax.swing.JComboBox();
        jComboBoxSab = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSys 1.0 - Horário de Monitoria");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/atualizar_1.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/lixeira.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

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
        jTable1.setFocusable(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Busca por Hora"));

        jFormattedTextFieldHoraFimBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldHoraFimBuscaKeyPressed(evt);
            }
        });

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/database_search.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel9.setText("Hora Inicio");

        jLabel10.setText("Hora Fim");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldHoraInicioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldHoraFimBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar))
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldHoraInicioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldHoraFimBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Informar Horario e Nome dos Monitores"));

        jLabel1.setText("Hora Inicio ");

        jLabel6.setText("Quinta");

        jLabel8.setText("Sábado");

        jLabel5.setText("Quarta");

        jFormattedTextFieldHoraFim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldHoraFimFocusLost(evt);
            }
        });

        jFormattedTextFieldHoraInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldHoraInicioFocusLost(evt);
            }
        });

        jLabel3.setText("Segunda");

        jLabel4.setText("Terça");

        jLabel7.setText("Sexta");

        jLabel2.setText("Hora Fim");

        jComboBoxSeg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECIONE>" }));

        jComboBoxTer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECIONE>" }));

        jComboBoxQua.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECIONE>" }));

        jComboBoxQuin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECIONE>" }));

        jComboBoxSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECIONE>" }));

        jComboBoxSab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECIONE>" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jFormattedTextFieldHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jFormattedTextFieldHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxSeg, 0, 221, Short.MAX_VALUE)
                    .addComponent(jComboBoxTer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxQua, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxQuin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxSex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxSab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair)
                        .addGap(118, 118, 118))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonSair))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(818, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if(!jFormattedTextFieldHoraFim.getText().equals("  :  :  ")){
            alterar();
            limpaCampos();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Há Campos Vazios!");
        }                        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(!(jFormattedTextFieldHoraInicio.getText().equals("  :  :  ") || jFormattedTextFieldHoraFim.getText().equals("  :  :  "))){
            salvar();
            //trataCadHora();
            jFormattedTextFieldHoraFim.setText("");
            jFormattedTextFieldHoraInicio.setText("");
            jFormattedTextFieldHoraInicio.requestFocus();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Há Campos Vazios!");
        }      
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
            BuscarHorario();
            jFormattedTextFieldHoraFimBusca.setText("");
            jFormattedTextFieldHoraInicioBusca.setText("");
            horaInicio = jFormattedTextFieldHoraInicio.getText();
            horaFim = jFormattedTextFieldHoraFim.getText();
            preencherTabela("select * from cad_horario order by hora_inicio");
            //jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        buscaTabela();
        horaInicio = jFormattedTextFieldHoraInicio.getText();
        horaFim = jFormattedTextFieldHoraFim.getText();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jFormattedTextFieldHoraInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHoraInicioFocusLost
        if(jFormattedTextFieldHoraInicio.getText().equals("  :  :  ")){
//            Toolkit.getDefaultToolkit().beep();
//            JOptionPane.showMessageDialog(null, "campo hora inicio vazio!");
        }
        else if(controle.validaHora(jFormattedTextFieldHoraInicio.getText())){
        
        }else{
            jFormattedTextFieldHoraInicio.setText("");
            jFormattedTextFieldHoraInicio.requestFocus();
        }
    }//GEN-LAST:event_jFormattedTextFieldHoraInicioFocusLost

    private void jFormattedTextFieldHoraFimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHoraFimFocusLost
        if(jFormattedTextFieldHoraFim.getText().equals("  :  :  ")){
            
        }
        else if(controle.validaHora(jFormattedTextFieldHoraFim.getText())){
        
        }else{
            jFormattedTextFieldHoraFim.setText("");
            jFormattedTextFieldHoraFim.requestFocus();
        }
    }//GEN-LAST:event_jFormattedTextFieldHoraFimFocusLost

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(jFormattedTextFieldHoraInicio.getText().equals("  :  :  ")){
            JOptionPane.showMessageDialog(null, "Há campos vazios!");
        }else{
            controle.excluirHorario(jFormattedTextFieldHoraInicio.getText());
            preencherTabela("select * from cad_horario order by hora_inicio");
            limpaCampos();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jFormattedTextFieldHoraFimBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHoraFimBuscaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            BuscarHorario();
            jFormattedTextFieldHoraFimBusca.setText("");
            jFormattedTextFieldHoraInicioBusca.setText("");           
            preencherTabela("select * from cad_horario order by hora_inicio");
        }
    }//GEN-LAST:event_jFormattedTextFieldHoraFimBuscaKeyPressed

    public  void mascaras(){           
        try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##:##:##");
            jFormattedTextFieldHoraInicio.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }        
        try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##:##:##");
            jFormattedTextFieldHoraFim.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }
        try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##:##:##");
            jFormattedTextFieldHoraInicioBusca.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }
         try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##:##:##");
             jFormattedTextFieldHoraFimBusca.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }
    }
    
//    public void autoComplete(){
//       conecta.conexao();
//       TextAutoCompleter textAutoCompleter = new TextAutoCompleter(jTextFieldSeg);
//       TextAutoCompleter textAutoCompleter1 = new TextAutoCompleter(jTextFieldTer);
//       TextAutoCompleter textAutoCompleter2 = new TextAutoCompleter(jTextFieldQua);
//       TextAutoCompleter textAutoCompleter3 = new TextAutoCompleter(jTextFieldQui);
//       TextAutoCompleter textAutoCompleter4 = new TextAutoCompleter(jTextFieldSex);
//       TextAutoCompleter textAutoCompleter5 = new TextAutoCompleter(jTextFieldSab);
//       conecta.executaSQL("select nome_usuario from cad_usuario where permissao_usuario = 'administrador'");
//        try {
//            conecta.rs.first();
//            do{
//                //System.out.println("nome: "+conecta.rs.getString("nome_usuario"));
//                textAutoCompleter.addItem(conecta.rs.getString("nome_usuario"));
//                textAutoCompleter1.addItem(conecta.rs.getString("nome_usuario"));
//                textAutoCompleter2.addItem(conecta.rs.getString("nome_usuario"));
//                textAutoCompleter3.addItem(conecta.rs.getString("nome_usuario"));
//                textAutoCompleter4.addItem(conecta.rs.getString("nome_usuario"));
//                textAutoCompleter5.addItem(conecta.rs.getString("nome_usuario"));
//                //textAutoCompleter.addItem("CARLOR");
//            }while(conecta.rs.next());
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(rootPane, ex);
//        }
//    }
    
    public void preencherTabela(String SQL){ //criando tabela
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Hora Inicio","Hora Fim","Segunda","Terça", "Quarta","Quinta","Sexta","Sábado"};
        conecta.conexao();
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getString("hora_inicio"),conecta.rs.getString("hora_fim"),conecta.rs.getString("n_seg"),conecta.rs.getString("n_ter"), conecta.rs.getString("n_qua"),conecta.rs.getString("n_qui"),conecta.rs.getString("n_sex"),conecta.rs.getString("n_sab")});
            }while(conecta.rs.next());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher Tabela!\n Erro" +ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(5).setResizable(false);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(6).setResizable(false);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(7).setResizable(false);
        
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conecta.desconecta();
        
    }
    
    public void limpaCampos(){
        JComboBox[] jc = {jComboBoxSeg,jComboBoxTer,jComboBoxQua,jComboBoxQuin,jComboBoxSex,jComboBoxSab};
        for(int i = 0; i < jc.length; i++){
            jc[i].setSelectedItem("<SELECIONE>");
        }
        jFormattedTextFieldHoraFim.setText("");
        jFormattedTextFieldHoraFimBusca.setText("");
        jFormattedTextFieldHoraInicio.setText("");
        jFormattedTextFieldHoraInicioBusca.setText("");
    }
    
     public void BuscarHorario(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_horario where hora_inicio = '"+jFormattedTextFieldHoraInicioBusca.getText()+"'and hora_fim ='"+jFormattedTextFieldHoraFimBusca.getText()+"'");
        try {
            conecta.rs.first();
            jFormattedTextFieldHoraInicio.setText(conecta.rs.getString("hora_inicio"));
            jFormattedTextFieldHoraFim.setText(conecta.rs.getString("hora_fim"));
            jComboBoxSeg.setSelectedItem(conecta.rs.getString("n_seg"));
            jComboBoxTer.setSelectedItem(conecta.rs.getString("n_ter"));
            jComboBoxQua.setSelectedItem(conecta.rs.getString("n_qua"));
            jComboBoxQuin.setSelectedItem(conecta.rs.getString("n_qui"));
            jComboBoxSex.setSelectedItem(conecta.rs.getString("n_sex"));
            jComboBoxSab.setSelectedItem(conecta.rs.getString("n_sab"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Horário não Encontrado!"+ ex);
        }
        conecta.desconecta();
    }
    
    public void buscaTabela(){
        int linhaSelecionada = jTable1.getSelectedRow();
        String horaInicio = jTable1.getValueAt(linhaSelecionada, 0).toString();
        String horaFim = jTable1.getValueAt(linhaSelecionada, 1).toString();
        conecta.conexao();
        conecta.executaSQL("select *from cad_horario where hora_inicio = '"+horaInicio+"'and hora_fim ='"+horaFim+"'");
        try {
            conecta.rs.first();
            jFormattedTextFieldHoraInicio.setText(conecta.rs.getString("hora_inicio"));
            jFormattedTextFieldHoraFim.setText(conecta.rs.getString("hora_fim"));
            jComboBoxSeg.setSelectedItem(conecta.rs.getString("n_seg"));
            jComboBoxTer.setSelectedItem(conecta.rs.getString("n_ter"));
            jComboBoxQua.setSelectedItem(conecta.rs.getString("n_qua"));
            jComboBoxQuin.setSelectedItem(conecta.rs.getString("n_qui"));
            jComboBoxSex.setSelectedItem(conecta.rs.getString("n_sex"));
            jComboBoxSab.setSelectedItem(conecta.rs.getString("n_sab"));
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Horário não Encontrado!"+ ex);
        }
        conecta.desconecta();      
    }
    
    public  void alterar(){
       conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_horario set hora_inicio = ?, hora_fim = ?, n_seg = ?, n_ter = ?, n_qua = ?, n_qui = ?, n_sex = ?, n_sab = ? where hora_inicio ='"+horaInicio+"'and hora_fim ='"+horaFim+"'");
            pst.setString(1, jFormattedTextFieldHoraInicio.getText());
            pst.setString(2, jFormattedTextFieldHoraFim.getText());
            pst.setString(3, String.valueOf(jComboBoxSeg.getSelectedItem()));
            pst.setString(4, String.valueOf(jComboBoxTer.getSelectedItem()));
            pst.setString(5, String.valueOf(jComboBoxQua.getSelectedItem()));
            pst.setString(6, String.valueOf(jComboBoxQuin.getSelectedItem()));
            pst.setString(7, String.valueOf(jComboBoxSex.getSelectedItem()));
            pst.setString(8, String.valueOf(jComboBoxSab.getSelectedItem()));
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!");
            preencherTabela("select * from cad_horario order by hora_inicio"); 
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Alterar Dados!\n Erro" +ex);
        }
        conecta.desconecta();
    }
    
    public void salvar(){
        modelo.setHoraInicio(jFormattedTextFieldHoraInicio.getText());
        modelo.setHoraFim(jFormattedTextFieldHoraFim.getText());
        modelo.setSeg(String.valueOf(jComboBoxSeg.getSelectedItem()));
        modelo.setTer(String.valueOf(jComboBoxTer.getSelectedItem()));
        modelo.setQua(String.valueOf(jComboBoxQua.getSelectedItem()));
        modelo.setQui(String.valueOf(jComboBoxQuin.getSelectedItem()));
        modelo.setSex(String.valueOf(jComboBoxSex.getSelectedItem()));
        modelo.setSab(String.valueOf(jComboBoxSab.getSelectedItem()));
        controle.salvarH(modelo);
        preencherTabela("select * from cad_horario order by hora_inicio");
        limpaCampos();
    }
    
    public boolean verificaCamposVazios(){
        JComboBox[] jc = {jComboBoxSeg,jComboBoxTer,jComboBoxQua,jComboBoxQuin,jComboBoxSex,jComboBoxSab};
        for(int i = 0; i < jc.length; i++){
            if((!jc[i].getSelectedItem().equals("<SELECIONE>")) || (!jFormattedTextFieldHoraFim.getText().equals("  :  :  ")) || (!jFormattedTextFieldHoraInicio.getText().equals("  :  :  "))){
                return true;
            }else
                JOptionPane.showMessageDialog(null, "Há campos vazios!");
                return false;           
        }
        return true;
    }
    
    public void preencheTabelaConstrutor(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_horario");
        try {
            conecta.rs.first();
            if(conecta.rs.getString("cod_horario").equals("'")){
            
            }else
               preencherTabela("select * from cad_horario order by hora_inicio"); 
        } catch (SQLException ex) {
            //Logger.getLogger(ThorarioMonitoria.class.getName()).log(Level.SEVERE, null, ex);
        }
       conecta.desconecta();
    }
    public void trataCadHora(){//esse metodo não permite que sejam cadastradas duas ou mais horas de inicio ou fom iguais
        conecta.conexao();
        conecta.executaSQL("select hora_inicio,hora_fim from cad_horario");
        
        try {////problema não ta entrando no if
            conecta.rs.first();
                if (conecta.rs.getString("hora_inicio").equals("'")) {
                    JOptionPane.showMessageDialog(null, "ENTORU NO PRIMEIRO IF");
                } else {
                    if (conecta.rs.getString("hora_inicio").equals(jFormattedTextFieldHoraInicio.getText()) || conecta.rs.getString("hora_fim").equals(jFormattedTextFieldHoraFim.getText())) {
                        JOptionPane.showMessageDialog(null, "A hora inicio ou hora fim já existe, não pode existir duas iguais!");
                    } else {
                        salvar();
                    }
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO - "+ex);
        }           
    }
    
    private void setIconeForme() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }
    
    public void preencheCombos(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where permissao_usuario = 'Administrador'");
        try {
            conecta.rs.first();
            do{
                jComboBoxSeg.addItem(conecta.rs.getString("nome_usuario"));
                jComboBoxTer.addItem(conecta.rs.getString("nome_usuario"));
                jComboBoxQua.addItem(conecta.rs.getString("nome_usuario"));
                jComboBoxQuin.addItem(conecta.rs.getString("nome_usuario"));
                jComboBoxSex.addItem(conecta.rs.getString("nome_usuario"));
                jComboBoxSab.addItem(conecta.rs.getString("nome_usuario"));
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ThorarioMonitoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThorarioMonitoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxQua;
    private javax.swing.JComboBox jComboBoxQuin;
    private javax.swing.JComboBox jComboBoxSab;
    private javax.swing.JComboBox jComboBoxSeg;
    private javax.swing.JComboBox jComboBoxSex;
    private javax.swing.JComboBox jComboBoxTer;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraFim;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraFimBusca;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraInicio;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraInicioBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
