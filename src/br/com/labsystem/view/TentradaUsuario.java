package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.ModeloTabela;
import br.com.labsystem.bean.TrataCampoSoLetrasMaiusculas;
import br.com.labsystem.bean.TrataCampoTam5;
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
public class TentradaUsuario extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    String data,hora;
    public TentradaUsuario(String data, String hora) {
        initComponents();
        preencherTabela("select *from cad_usuario");//seleciona na tabela todos os usuários que fizeram login nodia
        mascaras();
        this.data = data;
        this.hora = hora;
        jTextFieldBusca.setDocument(new TrataCampoSoLetrasMaiusculas());
        preencherComboboxMaquina();
        setIconeForme();
    }

    public TentradaUsuario() {
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
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
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
        setTitle("LabSys 1.0  - Registro de Entrada de Usuários");

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
        jFormattedTextFieldHoraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldHoraEntradaActionPerformed(evt);
            }
        });

        jFormattedTextFieldData.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldData.setEnabled(false);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jFormattedTextFieldData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jFormattedTextFieldHoraEntrada, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 26, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)))
                .addContainerGap())
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButtonNome)
                        .addGap(30, 30, 30)
                        .addComponent(jRadioButtonCodigo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jButtonRegistrarSaída.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/user_add.png"))); // NOI18N
        jButtonRegistrarSaída.setText("Registrar Entrada");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRegistrarSaída)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair)))
                .addGap(0, 10, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(439, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if(jTextFieldBusca.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ERRO - Campo de Busca Vazio!");
        }else if(jRadioButtonNome.isSelected()){
            BuscarUsuarioPorNome();
            jTextFieldBusca.setText("");
        }else{
            BuscarUsuarioPorCodigo();
            jTextFieldBusca.setText("");
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
        registraEntrada();
    }//GEN-LAST:event_jButtonRegistrarSaídaActionPerformed

    private void jFormattedTextFieldHoraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHoraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldHoraEntradaActionPerformed

    private void jTextFieldBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextFieldBusca.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ERRO - Campo de Busca Vazio!");
            } else if (jRadioButtonNome.isSelected()) {
                BuscarUsuarioPorNome();
                jTextFieldBusca.setText("");
            } else {
                BuscarUsuarioPorCodigo();
                jTextFieldBusca.setText("");            
            }
        }
    }//GEN-LAST:event_jTextFieldBuscaKeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void BuscarUsuarioPorNome(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where nome_usuario like '%"+jTextFieldBusca.getText()+"%'");
        try {
            conecta.rs.last();
            jTextFieldCodigo.setText(conecta.rs.getString("cod_usuario"));
            jTextFieldNome.setText(conecta.rs.getString("nome_usuario"));
            jFormattedTextFieldData.setText(data);
            jFormattedTextFieldHoraEntrada.setText(hora);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Nome de Usuário não Encontrado!"+ ex);
        }
        conecta.desconecta();
    }
    
    public void BuscarUsuarioPorCodigo(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where cod_usuario = '"+jTextFieldBusca.getText()+"'");
        try {
            conecta.rs.last();
            jTextFieldCodigo.setText(conecta.rs.getString("cod_usuario"));
            jTextFieldNome.setText(conecta.rs.getString("nome_usuario"));
            jFormattedTextFieldData.setText(data);
            jFormattedTextFieldHoraEntrada.setText(hora);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Nome de Usuário não Encontrado!"+ ex);
        }
        conecta.desconecta();
    }
    
    public void LimpaCampos(){
        JTextField[] jt = {jTextFieldBusca,jTextFieldCodigo,jTextFieldNome};
        JFormattedTextField[] jf = {jFormattedTextFieldData,jFormattedTextFieldHoraEntrada};
        for(int i = 0; i < jt.length; i++){
            jt[i].setText("");
        }
        for(int j = 0; j < jf.length; j++){
            jf[j].setText("");
        }
    }
    
    public void preencherTabela(String SQL){ //criando tabela
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Matricula","Nome","Data Nasc.","Curso", "Período Ingre."};
        conecta.conexao();
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("cod_usuario"),conecta.rs.getString("nome_usuario"),conecta.rs.getString("data_nasc_usuario"),conecta.rs.getString("curso_usuario"), conecta.rs.getString("periodo_ingresso")});
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
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }
        
    }
    
    public void registraEntrada(){
        
        conecta.conexao();
       // conecta.executaSQL("select status_uso from cad_maquina where cod_maquina= '"+String.valueOf(jComboBox1.getSelectedItem())+"'");
        
        try {     
//            if(!conecta.rs.getString("status_uso").equals("O")){
//                System.out.println("ENTROU");
                PreparedStatement pst = conecta.conn.prepareStatement("insert into controle_acesso(cod_usuario,cod_maquina,data_acesso,hora_entrada,nome_usuario,status_controle_acesso)values(?,?,?,?,?,?)");
                pst.setString(1, jTextFieldCodigo.getText());
                pst.setString(2, (String)jComboBox1.getSelectedItem());
                pst.setString(3, jFormattedTextFieldData.getText());
                pst.setString(4, jFormattedTextFieldHoraEntrada.getText());
                pst.setString(5, jTextFieldNome.getText());
                pst.setString(6, "LOGADO");
                pst.execute();
                conecta.desconecta();   
                atualizaStatusUsoOcupado();//verifica
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
           // }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO - "+ex);
        }
        conecta.desconecta();      
    }
   
    public void atualizaStatusUsoOcupado(){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_maquina set status_uso = 'O' where cod_maquina = '"+jComboBox1.getSelectedItem()+"'");
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Tusuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
    }

    private void setIconeForme() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }
    
    public void preencherComboboxMaquina(){
        conecta.conexao();
        conecta.executaSQL("select * from cad_maquina");
        try {
            conecta.rs.first(); 
            
            while(conecta.rs.next()){
                if(!conecta.rs.getString("status_uso").equals("O")){
                    jComboBox1.addItem(conecta.rs.getString("cod_maquina"));
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TentradaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TentradaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonRegistrarSaída;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonCodigo;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
