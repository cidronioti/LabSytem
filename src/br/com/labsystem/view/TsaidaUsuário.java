package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.ModeloTabela;
import br.com.labsystem.bean.TrataCampoSoLetrasMaiusculas;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author CIDRONIO
 */
public class TsaidaUsuário extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    public TsaidaUsuário(String data) {
        initComponents();
        preencherTabela("select *from controle_acesso where data_acesso = '"+data+"'and status_controle_acesso = 'LOGADO'");//seleciona na tabela todos os usuários que estão logados na data atual
        mascaras();
        jTextFieldBusca.setDocument(new TrataCampoSoLetrasMaiusculas());
        
        setIconeForme();
    }

    public TsaidaUsuário() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldHoraEntrada = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCodMaquina = new javax.swing.JTextField();
        jFormattedTextFieldHoraSaida = new javax.swing.JFormattedTextField();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonNome = new javax.swing.JRadioButton();
        jRadioButtonCodigo = new javax.swing.JRadioButton();
        jTextFieldBusca = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonRegistrarSaída = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSys 1.0  - Registro de Saída de Usuários");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usuário"));

        jTextFieldCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setEnabled(false);

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setEnabled(false);

        jLabel2.setText("Nome");

        jLabel3.setText("Cod. Máquina");

        jLabel1.setText("Nº Matricula");

        jLabel4.setText("Data");

        jLabel5.setText("Hora Entrada");

        jFormattedTextFieldHoraEntrada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldHoraEntrada.setEnabled(false);

        jLabel6.setText("Hora Saída");

        jTextFieldCodMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodMaquina.setEnabled(false);

        jFormattedTextFieldHoraSaida.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jFormattedTextFieldData.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldData.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextFieldCodMaquina)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jFormattedTextFieldHoraEntrada, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextFieldHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextFieldNome)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        jRadioButtonNome.setSelected(true);
        jRadioButtonNome.setText("Nome");
        jRadioButtonNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonNomeMouseClicked(evt);
            }
        });

        jRadioButtonCodigo.setText("Matricula");
        jRadioButtonCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonCodigoMouseClicked(evt);
            }
        });

        jTextFieldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaKeyPressed(evt);
            }
        });

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/database_search.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButtonNome)
                        .addGap(30, 30, 30)
                        .addComponent(jRadioButtonCodigo)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonNome)
                    .addComponent(jRadioButtonCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/novo.png"))); // NOI18N
        jButtonNovo.setText("Limpar Campos");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonRegistrarSaída.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/user_delete.png"))); // NOI18N
        jButtonRegistrarSaída.setText("Registrar Saída");
        jButtonRegistrarSaída.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarSaídaActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRegistrarSaída)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonRegistrarSaída)
                    .addComponent(jButtonSair))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(452, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if(jTextFieldBusca.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ERRO - Campo de Busca Vazio!");
        }else if(jRadioButtonNome.isSelected()){
            BuscarUsuarioPorNome();
            jTextFieldBusca.setText("");
            jFormattedTextFieldHoraSaida.requestFocus();
        }else{
            BuscarUsuarioPorCodigo();
            jTextFieldBusca.setText("");
            jFormattedTextFieldHoraSaida.requestFocus();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jRadioButtonNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonNomeMouseClicked
        jRadioButtonNome.setSelected(true);
        jRadioButtonCodigo.setSelected(false);
    }//GEN-LAST:event_jRadioButtonNomeMouseClicked

    private void jRadioButtonCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonCodigoMouseClicked
        jRadioButtonNome.setSelected(false);
        jRadioButtonCodigo.setSelected(true);
    }//GEN-LAST:event_jRadioButtonCodigoMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
          LimpaCampos();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonRegistrarSaídaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarSaídaActionPerformed
        registraSaida();
    }//GEN-LAST:event_jButtonRegistrarSaídaActionPerformed

    private void jTextFieldBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextFieldBusca.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ERRO - Campo de Busca Vazio!");
            } else if (jRadioButtonNome.isSelected()) {
                BuscarUsuarioPorNome();
                jTextFieldBusca.setText("");
                jFormattedTextFieldHoraSaida.requestFocus();
            } else {
                BuscarUsuarioPorCodigo();
                jTextFieldBusca.setText("");
                jFormattedTextFieldHoraSaida.requestFocus();
            }
        }
    }//GEN-LAST:event_jTextFieldBuscaKeyPressed

    public void BuscarUsuarioPorNome(){
        conecta.conexao();
        conecta.executaSQL("select *from controle_acesso where nome_usuario like '%"+jTextFieldBusca.getText()+"%' and status_controle_acesso = 'LOGADO'");
        try {
            conecta.rs.last();
            jTextFieldCodigo.setText(conecta.rs.getString("cod_usuario"));
            jTextFieldNome.setText(conecta.rs.getString("nome_usuario"));
            jFormattedTextFieldData.setText(conecta.rs.getString("data_acesso"));
            jTextFieldCodMaquina.setText(conecta.rs.getString("cod_maquina"));
            jFormattedTextFieldHoraEntrada.setText(conecta.rs.getString("hora_entrada"));
            jFormattedTextFieldHoraSaida.setText(conecta.rs.getString("hora_saida"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Nome de Usuário não Encontrado!"+ ex);
        }
        conecta.desconecta();
    }
    
    public void BuscarUsuarioPorCodigo(){
        conecta.conexao();
        conecta.executaSQL("select *from controle_acesso where cod_usuario = '"+jTextFieldBusca.getText()+"' and status_controle_acesso = 'LOGADO'");
        try {
            conecta.rs.last();
            jTextFieldCodigo.setText(conecta.rs.getString("cod_usuario"));
            jTextFieldNome.setText(conecta.rs.getString("nome_usuario"));
            jFormattedTextFieldData.setText(conecta.rs.getString("data_acesso"));
            jTextFieldCodMaquina.setText(conecta.rs.getString("cod_maquina"));
            jFormattedTextFieldHoraEntrada.setText(conecta.rs.getString("hora_entrada"));
            jFormattedTextFieldHoraSaida.setText(conecta.rs.getString("hora_saida"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Nome de Usuário não Encontrado!"+ ex);
        }
        conecta.desconecta();
    }
    
    public void LimpaCampos(){
        JTextField[] jt = {jTextFieldBusca,jTextFieldCodMaquina,jTextFieldCodigo,jTextFieldNome};
        JFormattedTextField[] jf = {jFormattedTextFieldData,jFormattedTextFieldHoraEntrada,jFormattedTextFieldHoraSaida};
        for(int i = 0; i < jt.length; i++){
            jt[i].setText("");
        }
        for(int j = 0; j < jf.length; j++){
            jf[j].setText("");
        }
    }
    
    public void preencherTabela(String SQL){ //criando tabela
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Matricula","Nome","Data Acesso","Cod Maquina", "Hora Entrada"};
        conecta.conexao();
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("cod_usuario"),conecta.rs.getString("nome_usuario"),conecta.rs.getString("data_acesso"),conecta.rs.getString("cod_maquina"), conecta.rs.getString("hora_entrada")});
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
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(103);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(103);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conecta.desconecta();
        
    }
    
    public  void mascaras(){
        try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##/##/####");
            jFormattedTextFieldData.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }
        
        try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##:##:##");
            jFormattedTextFieldHoraEntrada.setFormatterFactory(new DefaultFormatterFactory(form));
            jFormattedTextFieldHoraSaida.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }
        
    }
       
    public void registraSaida(){
        conecta.conexao();
        try {
            // TODO add your handling code here:
            PreparedStatement pst = conecta.conn.prepareStatement("update controle_acesso set cod_maquina = ?, data_acesso = ?, hora_entrada = ?, hora_saida = ?,nome_usuario = ?,status_controle_acesso = ?, cod_usuario = ? where cod_usuario ='"+jTextFieldCodigo.getText()+"'and data_acesso = '"+jFormattedTextFieldData.getText()+"'and status_controle_acesso = 'LOGADO'");
            pst.setString(1, jTextFieldCodMaquina.getText());
            pst.setString(2, jFormattedTextFieldData.getText());
            pst.setString(3, jFormattedTextFieldHoraEntrada.getText());
            pst.setString(4, jFormattedTextFieldHoraSaida.getText());
            pst.setString(5, jTextFieldNome.getText());
            pst.setString(6, "DESLOGADO");
            pst.setString(7, jTextFieldCodigo.getText());           
            pst.execute();
            atualizaStatusUsoLivre();///verificar
            JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!");
             preencherTabela("select * from controle_acesso order by nome_usuario"); 
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher Tabela!\n Erro" +ex);
        }
    }
       
    public void atualizaStatusUsoLivre(){
         conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_maquina set status_uso = 'L' where cod_maquina = '"+jTextFieldCodMaquina.getText()+"'");
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Tusuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
    }
    
    private void setIconeForme() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TsaidaUsuário().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonRegistrarSaída;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraEntrada;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonCodigo;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldCodMaquina;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
