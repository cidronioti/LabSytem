
package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.ControleMaquina;
import br.com.labsystem.bean.ModeloMaquina;
import br.com.labsystem.bean.ModeloTabela;
import br.com.labsystem.bean.TrataCampoSoLetrasMaiusculas;
import br.com.labsystem.bean.TrataCampoSoNumeros;
import br.com.labsystem.bean.TrataCampoTam5;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author CIDRONIO
 */
public class TcadastroMaquinas extends javax.swing.JFrame {
    ModeloMaquina modelo = new ModeloMaquina();
    ControleMaquina controle = new ControleMaquina();
    ConectaBanco conecta = new ConectaBanco();
    public TcadastroMaquinas() {
        initComponents();
        letrasMaiusculas();
        conecta.conexao();
        preencherTabela("select * from cad_maquina order by cod_maquina");
        jTextFieldNumIdentificacao.setDocument(new TrataCampoSoNumeros());
        SwingUtilities.invokeLater(new Runnable() {  
            public void run() {  
                jTextFieldCodigo.requestFocus();  
            }  
        });  
        setIconeForme();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSo = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNumIdentificacao = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldMenDedicada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldHd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldProcessador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldMonitor = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextFieldMemRam = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldObs = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonLimpaCampos = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSys 1.0 - Cadastro de Máquinas");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Máquina"));

        jLabel6.setText("Processador");

        jLabel8.setText("Mem. Ram");

        jLabel9.setText("Mem. Dedicada");

        jTextFieldMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaActionPerformed(evt);
            }
        });

        jLabel3.setText("Modelo");

        jLabel10.setText("Monitor");

        jLabel1.setText("Codigo");

        jLabel11.setText("Status");

        jLabel2.setText("Marca");

        jLabel7.setText("HD");

        jLabel4.setText("Nº Identificação");

        jLabel5.setText("S.O.");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Com Defeito", "Funcionado", "Manutenção", " " }));

        jLabel13.setText("Obs");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldObs)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldMenDedicada, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMonitor)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel11))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldHd)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMemRam, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldNumIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5))
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMarca)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMemRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMenDedicada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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

        jLabel12.setText("Busca por Códico");

        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyPressed(evt);
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
                .addGap(60, 60, 60)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addContainerGap())
        );

        jButtonLimpaCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/novo.png"))); // NOI18N
        jButtonLimpaCampos.setText("Limpar Campos");
        jButtonLimpaCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpaCamposActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonLimpaCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpaCampos)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSair))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(580, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(verificaCampoVazio()){
            JOptionPane.showMessageDialog(rootPane, "Há campos vazios!");
        }else{
            salvar();
            limpaCampos();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimpaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpaCamposActionPerformed
        limpaCampos();
        jButtonSalvar.setEnabled(true);
    }//GEN-LAST:event_jButtonLimpaCamposActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if(!jTextFieldBuscar.getText().equals("")){
            buscarMaquina();
            jButtonSalvar.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Campo de busca vazio!");
        }
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if(!jTextFieldCodigo.getText().equals("")){
            alterar();
            jButtonSalvar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(this, "ERRO - Campo Código Vazio!");
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(!jTextFieldCodigo.getText().isEmpty()){
            controle.excluirDados(jTextFieldCodigo.getText());
            preencherTabela("select * from cad_maquina order by cod_maquina");
        }else{
            JOptionPane.showMessageDialog(rootPane, "ERRO - Há Campos Vazios!");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!jTextFieldBuscar.getText().equals("")) {
                buscarMaquina();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo de busca vazio!");
            }
            jButtonSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldBuscarKeyPressed

    private void jTextFieldMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaActionPerformed

    public void salvar(){
        conecta.conexao();
        try{
            modelo.setCodigo(jTextFieldCodigo.getText());
            modelo.setMarca(jTextFieldMarca.getText());
            modelo.setModelo(jTextFieldModelo.getText());
            modelo.setNum_identfic(Integer.parseInt(jTextFieldNumIdentificacao.getText()));
            modelo.setSo(jTextFieldSo.getText());
            modelo.setProcessador(jTextFieldProcessador.getText());
            modelo.setHd(jTextFieldHd.getText());
            modelo.setMemoriaRam(jTextFieldMemRam.getText());
            modelo.setMemoriaDedicada(jTextFieldMenDedicada.getText());
            modelo.setMonitor(jTextFieldMonitor.getText());
            modelo.setStatusFuncionamento(String.valueOf(jComboBox1.getSelectedItem()));
            modelo.setStatusUso("L");
            modelo.setObs(jTextFieldObs.getText());
            controle.salvar(modelo);
            preencherTabela("select * from cad_maquina order by cod_maquina");
            conecta.desconecta();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"ERRO - "+ ex);
        }
    }
    
    public void preencherTabela(String SQL){ //criando tabela
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Codigo","Marca","Modelo","Nº Identifc.", "Status Func."};
        conecta.conexao();
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getString("cod_maquina"),conecta.rs.getString("marca_maquina"),conecta.rs.getString("Modelo_Maquina"),conecta.rs.getInt("num_ident_maquina"), conecta.rs.getString("status_funcionamento")});
            }while(conecta.rs.next());
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher Tabela!\n Erro" +ex);
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
    
     public boolean verificaCampoVazio(){
        JTextField[] jt = {jTextFieldCodigo,jTextFieldHd,jTextFieldMarca,jTextFieldMemRam,jTextFieldMenDedicada,jTextFieldModelo, jTextFieldMonitor,jTextFieldNumIdentificacao,jTextFieldObs,jTextFieldProcessador,jTextFieldSo};
        for(int i = 0; i < jt.length; i++){
            if(jt[i].getText().equals("")){
                i=  jt.length;
                return true;
            }
        } 
        return false;
    }
    public  void limpaCampos(){
        JTextField[] jt = {jTextFieldCodigo,jTextFieldHd,jTextFieldMarca,jTextFieldMemRam,jTextFieldMenDedicada,jTextFieldModelo, jTextFieldMonitor,jTextFieldNumIdentificacao,jTextFieldObs,jTextFieldProcessador,jTextFieldSo};
        for(int i = 0; i < jt.length; i++){
           jt[i].setText("");
        }       
    }
    
    public void letrasMaiusculas(){
        JTextField[] jt = {jTextFieldBuscar,jTextFieldHd,jTextFieldMarca,jTextFieldMemRam,jTextFieldMenDedicada,jTextFieldModelo, jTextFieldMonitor,jTextFieldNumIdentificacao,jTextFieldObs,jTextFieldProcessador,jTextFieldSo};
        for(int i = 0; i < jt.length; i++){
           jt[i].setDocument(new TrataCampoSoLetrasMaiusculas());          
        }  
        jTextFieldCodigo.setDocument(new TrataCampoTam5());
    }
    
    public void buscarMaquina(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_maquina where cod_maquina = '"+jTextFieldBuscar.getText()+"'");
        try {
            conecta.rs.first();
            jTextFieldCodigo.setText(conecta.rs.getString("cod_maquina"));
            jTextFieldHd.setText(conecta.rs.getString("hd_maquina"));
            jTextFieldMarca.setText(conecta.rs.getString("marca_maquina"));
            jTextFieldMemRam.setText(conecta.rs.getString("memoria_ram_maquina"));
            jComboBox1.setSelectedItem(conecta.rs.getString("status_funcionamento"));
            jTextFieldMenDedicada.setText(conecta.rs.getString("meomoria_dedicada"));
            jTextFieldModelo.setText(conecta.rs.getString("modelo_maquina"));
            jTextFieldMonitor.setText(conecta.rs.getString("monitor_maquina"));
            jTextFieldNumIdentificacao.setText(conecta.rs.getString("num_ident_maquina"));
            jTextFieldProcessador.setText(conecta.rs.getString("processador_maquina"));
            jTextFieldSo.setText(conecta.rs.getString("so_maquina"));
            preencherTabela("select * from cad_maquina order by cod_maquina");
            jTextFieldBuscar.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Maquina não Encontrada!"+ ex);
        }
        conecta.desconecta();
    }
    
    public  void alterar(){
       conecta.conexao();
        try {
            // TODO add your handling code here:
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_maquina set marca_maquina = ?, modelo_maquina = ?, num_ident_maquina = ?, so_maquina = ?, processador_maquina = ? ,hd_maquina = ?,memoria_ram_maquina = ?, meomoria_dedicada = ?, monitor_maquina = ?, status_funcionamento = ?, obs = ? where cod_maquina = ?");
            pst.setString(1, jTextFieldMarca.getText());
            pst.setString(2, jTextFieldModelo.getText());
            pst.setInt(3, Integer.parseInt(jTextFieldNumIdentificacao.getText()));
            pst.setString(4, jTextFieldSo.getText());
            pst.setString(5, jTextFieldProcessador.getText());
            pst.setString(6, jTextFieldHd.getText());
            pst.setString(7, jTextFieldMemRam.getText());
            pst.setString(8, jTextFieldMenDedicada.getText());
            pst.setString(9, jTextFieldMonitor.getText());
            pst.setString(10, String.valueOf(jComboBox1.getSelectedItem()));
            pst.setString(11, jTextFieldObs.getText());
            pst.setString(12, jTextFieldCodigo.getText());           
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!");
            limpaCampos();
            preencherTabela("select * from cad_maquina order by cod_maquina"); 
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Alterar Dados!\n Erro" +ex);
        }
        
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
                new TcadastroMaquinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpaCampos;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldHd;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldMemRam;
    private javax.swing.JTextField jTextFieldMenDedicada;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldMonitor;
    private javax.swing.JTextField jTextFieldNumIdentificacao;
    private javax.swing.JTextField jTextFieldObs;
    private javax.swing.JTextField jTextFieldProcessador;
    private javax.swing.JTextField jTextFieldSo;
    // End of variables declaration//GEN-END:variables
}
