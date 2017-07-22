
package br.com.labsystem.view;

import br.com.labsystem.bean.AtualizaHora;
import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.ManipularImagem;
import br.com.labsystem.bean.ModeloTabela;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author CIDRONIO
 */
public class Tusuario extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    String horaSys;
    public Tusuario(String nome, String hora) {
        this.horaSys = hora;
        initComponents();
        jLabelNome.setText(nome);
        buscandoDadosUsuario(nome);
        mascaras();
        preencheCombo();
        conecta.conexao();
        preencherTabela("select * from cad_maquina where status_funcionamento = 'Funcionado' && status_uso = 'L'");
        conecta.desconecta();
        this.setExtendedState(this.getExtendedState()|Tprincipal.MAXIMIZED_BOTH);
       
        AtualizaHora.start(jLabelHora);
        //AtualizaHora.start2(jFormattedTextFieldHoraEntrada);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hoje = new Date();
        jFormattedTextFieldData.setText(df.format(hoje));
      
        jFormattedTextFieldHoraEntrada.setText(hora);
        verificaHoraEntrada(hora);
        alteraEstadoBotao();
        preencherTabelaHistoricoUsuarioDis("select *from controle_acesso where data_acesso ='"+jFormattedTextFieldData.getText()+"'");
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);//bloqueia o botão close do form
        setIconeForme();
    }
    
    
    public Tusuario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cLabel1 = new com.bolivia.label.CLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelNumMatricula = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelNomeCompleto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelCurso = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelPeriodoIngresso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldHoraEntrada = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldHoraSaida = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jButtonRegistrarEntrada = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cLabel1.setText("");
        jPanel1.add(cLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        jLabelNome.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNome.setText("Nome");
        jPanel1.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 120, 110, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nº Matricula:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jLabelNumMatricula.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelNumMatricula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumMatricula.setText("jLabel1");
        jPanel1.add(jLabelNumMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 130, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nome:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 60, -1));

        jLabelNomeCompleto.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelNomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeCompleto.setText("jLabel12");
        jPanel1.add(jLabelNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 270, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Curso:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 60, -1));

        jLabelCurso.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelCurso.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCurso.setText("jLabel1");
        jPanel1.add(jLabelCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 210, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Perído de ingresso:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 130, -1));

        jLabelPeriodoIngresso.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelPeriodoIngresso.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPeriodoIngresso.setText("jLabel1");
        jPanel1.add(jLabelPeriodoIngresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 130, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, -1));

        jFormattedTextFieldData.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jFormattedTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora Entrarda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 110, -1));

        jFormattedTextFieldHoraEntrada.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jFormattedTextFieldHoraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, -1));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "C.P." }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 110, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Máquina");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 90, -1));

        jFormattedTextFieldHoraSaida.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jFormattedTextFieldHoraSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 80, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hora Saida");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 80, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Máquinas Disponíveis:");

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
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Histórico de Usuários do Dia:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButtonAlterar.setBackground(new java.awt.Color(102, 204, 255));
        jButtonAlterar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButtonAlterar.setText("Alterar Dados");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonRegistrarEntrada.setBackground(new java.awt.Color(102, 204, 255));
        jButtonRegistrarEntrada.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButtonRegistrarEntrada.setText("Registrar Entrada");
        jButtonRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarEntradaActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(102, 204, 255));
        jButtonSair.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabelHora.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(153, 153, 153));
        jLabelHora.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(400, 400, 400)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(191, 191, 191)
                                .addComponent(jButtonRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1030, 1030, 1030)
                                .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAlterar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSair)
                        .addComponent(jButtonRegistrarEntrada)))
                .addGap(77, 77, 77)
                .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1200, 725));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        Tlogin.main(null);
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        new TalteraPeloUsuario(jLabelNumMatricula.getText()).show();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarEntradaActionPerformed
        if(jComboBox1.getSelectedItem().equals("<Selecione>")){
            JOptionPane.showMessageDialog(null, "Selecione uma Máquina!");
        }else{
            registraEntrada2();
            preencherTabelaHistoricoUsuarioDis("select *from controle_acesso where data_acesso ='"+jFormattedTextFieldData.getText()+"'");
        }
    }//GEN-LAST:event_jButtonRegistrarEntradaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        pegaCodMaqTabela(); 
    }//GEN-LAST:event_jTable1MouseClicked
    
    public void buscandoDadosUsuario(String nome){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where login_usuario = '"+nome+"'");
        try {
            conecta.rs.first();
            jLabelNumMatricula.setText(conecta.rs.getString("cod_usuario"));
            jLabelCurso.setText(conecta.rs.getString("curso_usuario"));
            jLabelPeriodoIngresso.setText(conecta.rs.getString("periodo_ingresso"));
            jLabelNomeCompleto.setText(conecta.rs.getString("nome_usuario"));
            ManipularImagem.exibiImagemLabel(conecta.rs.getBytes("foto_usuario"), cLabel1);
//            String caminho = conecta.rs.getString("foto_usuario");
//            javax.swing.ImageIcon i = 
//            new javax.swing.ImageIcon(caminho);
//            Image imag = i.getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH);
//            jLabelFoto.setIcon(new ImageIcon(imag));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO - "+ex);
        }
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
    
    public void preencherTabela(String SQL){ //criando tabela
        conecta.conexao();
        
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Codigo","Marca","Modelo","Nº Identifc.", "Status Func."};
        int i =0;
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getString("cod_maquina"),conecta.rs.getString("marca_maquina"),conecta.rs.getString("Modelo_Maquina"),conecta.rs.getInt("num_ident_maquina"), conecta.rs.getString("status_funcionamento")});
                i++;
            }while(conecta.rs.next());  
            jLabel5.setText("Máquinas Disponíveis: "+String.valueOf(i));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher Tabela não há Maquinas Cadastradas, \nou há um Problema de Conexão com a Base de Dados!\n Erro" +ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(170);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(108);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(103);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conecta.desconecta();
    }
    public void preencheCombo(){
        conecta.conexao();
        conecta.executaSQL("select cod_maquina from cad_maquina where status_funcionamento = 'Funcionado' && status_uso = 'L'");
        try {          
            conecta.rs.first();
            do{              
                jComboBox1.addItem(String.valueOf(conecta.rs.getString("cod_maquina")));
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"ERRO AO PREENCHER COMBOBOX - não há Maquinas Cadastradas, \nou há um Problema de Conexão com a Base de Dados!\n"+ ex);
        }
        conecta.desconecta();      
    }
    
    public void registraEntrada(){       
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into controle_acesso(cod_usuario,cod_maquina,data_acesso,hora_entrada,nome_usuario,status_controle_acesso)values(?,?,?,?,?,?)");
            pst.setString(1, jLabelNumMatricula.getText());
            pst.setString(2, String.valueOf(jComboBox1.getSelectedItem()));
            pst.setString(3, jFormattedTextFieldData.getText());
            pst.setString(4, jFormattedTextFieldHoraEntrada.getText());
            pst.setString(5, jLabelNomeCompleto.getText());
            pst.setString(6, "LOGADO");
            pst.execute();
            jButtonRegistrarEntrada.setText("Registrar Saida");
            conecta.desconecta();
            if (jComboBox1.getSelectedItem().equals("C.P.")) {// alteração para permitir que usuário faça uso de sua maquina pessoal "notbook"

            } else {
                atualizaStatusUsoOcupado();
            }
            JOptionPane.showMessageDialog(null, "Entrada Registrada com Sucesso Bons Estudos!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO - "+ex);
        }
        conecta.desconecta();      
    }
    public void registraSaida(){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update controle_acesso set cod_maquina = ?, data_acesso = ?, hora_entrada = ?, hora_saida = ?,nome_usuario = ?,status_controle_acesso = ?, cod_usuario = ? where cod_usuario ='"+jLabelNumMatricula.getText()+"'and data_acesso = '"+jFormattedTextFieldData.getText()+"'and status_controle_acesso = 'LOGADO'");
            pst.setString(1, String.valueOf(jComboBox1.getSelectedItem()));
            pst.setString(2, jFormattedTextFieldData.getText());
            pst.setString(3, jFormattedTextFieldHoraEntrada.getText());
            pst.setString(4, jFormattedTextFieldHoraSaida.getText());
            pst.setString(5, jLabelNomeCompleto.getText());
            pst.setString(6, "DESLOGADO");
            pst.setString(7, jLabelNumMatricula.getText());           
            pst.execute();
            atualizaStatusUsoLivre();///verificar
            //JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!");
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Alterar Dados!\n Erro" +ex);
        }
    }
    public void verificaHoraEntrada(String hora){//se o usuario ja registrou entrada busca hora de entrado no banco se não pega a hora do sitema que ta sendo passado por parametro no construtor 
        conecta.conexao();
        //conecta.executaSQL("select hora_entrada from controle_acesso where cod_usuario = '"+jLabelNumMatricula.getText()+"'");
        conecta.executaSQL("select *from controle_acesso where cod_usuario = '"+jLabelNumMatricula.getText()+"'");
        try {
            conecta.rs.last(); //concertar a linha a baixo e substituir segunda a linha  por ela
            if((!conecta.rs.getString("hora_entrada").equals("'")) && (conecta.rs.getString("data_acesso").equals(jFormattedTextFieldData.getText())) && (conecta.rs.getString("status_controle_acesso").equals("LOGADO"))){ 
                System.out.println("ENTROU no IF");
                jComboBox1.removeAllItems();
                jComboBox1.addItem(conecta.rs.getString("cod_maquina"));         
                jFormattedTextFieldHoraEntrada.setText(conecta.rs.getString("hora_entrada"));
                jFormattedTextFieldHoraSaida.setText(hora);                
            }else {
                jFormattedTextFieldHoraEntrada.setText(hora);
            }
            conecta.desconecta();
        } catch (SQLException ex) {
            jFormattedTextFieldHoraEntrada.setText(hora);
            //JOptionPane.showMessageDialog(rootPane, "Erro ao Buscar hora!\n Erro" +ex);
        }
    }
    
    public void preencherTabelaHistoricoUsuarioDis(String SQL){ //Funcionando
        ArrayList dados = new ArrayList();
        conecta.conexao();
        int i = 0;
        String[] Colunas = new String[]{"Maquina","Nome","Hora Entrada","Status"};
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                jLabel2.setText("Histórico de Usuários do Dia: "+String.valueOf(i));//SE NÃO HOVER MÁQUINAS DISPONIVEIS SETA O VALOR INICIAL DA VARIAVEL QUE É ZERO
                dados.add(new Object[]{conecta.rs.getString("cod_maquina"),conecta.rs.getString("nome_usuario"),conecta.rs.getString("hora_entrada"),conecta.rs.getString("status_controle_acesso")});
                i++;
            }while(conecta.rs.next());           
            jLabel2.setText("Histórico de Usuários do Dia: "+String.valueOf(i));
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher Tabela - Ainda não há Usuarios, \nou há um Problema de Conexão com a Base de Dados!\n Erro" +ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable2.setModel(modelo);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable2.getColumnModel().getColumn(0).setResizable(false);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(170);
        jTable2.getColumnModel().getColumn(1).setResizable(false);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(2).setResizable(false);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(3).setResizable(false);
                
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_OFF);
        jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conecta.desconecta();       
    }
    
    public void atualizaStatusUsoOcupado(){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_maquina set status_uso = 'O' where cod_maquina = '"+String.valueOf(jComboBox1.getSelectedItem())+"'");
            pst.execute();
            preencherTabela("select * from cad_maquina where status_funcionamento = 'Funcionado' && status_uso = 'L'");
        } catch (SQLException ex) {
            Logger.getLogger(Tusuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
    }
    
    public void atualizaStatusUsoLivre(){
         conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_maquina set status_uso = 'L' where cod_maquina = '"+String.valueOf(jComboBox1.getSelectedItem())+"'");
            pst.execute();
            preencherTabela("select * from cad_maquina where status_funcionamento = 'Funcionado' && status_uso = 'L'");
        } catch (SQLException ex) {
            Logger.getLogger(Tusuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
    }
    
    public void registraEntrada2(){//por enquanto ta funcionando desse jeito caso der algum problema, retirar os comentario
            if(jButtonRegistrarEntrada.getText().equals("Registrar Saida")){
                int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja Realmente Registrar Saida?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
                if (selectedOption == JOptionPane.YES_OPTION) {
                    registraSaida();
                    alteraEstadoBotao();
                    Tlogin.main(null);
                    dispose();
                }
            }else{
                registraEntrada();
                alteraEstadoBotao();   
                Tlogin.main(null);
                dispose();
            }
    }
    public  void alteraEstadoBotao(){//concertar
        conecta.conexao();
        conecta.executaSQL("select status_controle_acesso from controle_acesso where cod_usuario ='"+jLabelNumMatricula.getText()+"'");
        try {
            conecta.rs.last();
            if(conecta.rs.getString("status_controle_acesso").equals("LOGADO")){
                jButtonRegistrarEntrada.setText("Registrar Saida");
                jButtonRegistrarEntrada.setBackground(new java.awt.Color(255, 102, 102));
            }else{
                jButtonRegistrarEntrada.setText("Registrar Entrada");
                jButtonRegistrarEntrada.setBackground(new java.awt.Color(102, 204, 255));
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"ERRO AO VERIFICAR STATOS CONTROLE - "+ ex);
        }
        
        conecta.desconecta();
    }
    
    public void pegaCodMaqTabela(){
        int linhaSelecionada = jTable1.getSelectedRow();
        String codigo = jTable1.getValueAt(linhaSelecionada, 0).toString();
        jComboBox1.setSelectedItem(codigo);
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
                new Tusuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.bolivia.label.CLabel cLabel1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonRegistrarEntrada;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraEntrada;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeCompleto;
    private javax.swing.JLabel jLabelNumMatricula;
    private javax.swing.JLabel jLabelPeriodoIngresso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
