
package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.ControleUsuario;
import br.com.labsystem.bean.Criptografia;
import br.com.labsystem.bean.ManipularImagem;
import br.com.labsystem.bean.ModeloTabela;
import br.com.labsystem.bean.ModeloUsuario;
import br.com.labsystem.bean.TrataCampoSoLetrasMaiusculas;
import br.com.labsystem.bean.TrataCampoSoLetrasMaiusculasCodTam7;
import br.com.labsystem.bean.TrataCampoTam10;
import com.sun.glass.events.KeyEvent;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import static jdk.nashorn.tools.ShellFunctions.input;
import sun.misc.CompoundEnumeration;

/**
 *
 * @author CIDRONIO
 */
public class TcadastroUsuarios extends javax.swing.JFrame implements SerialPortEventListener {
    ControleUsuario Controle = new ControleUsuario();
    ModeloUsuario modelo = new ModeloUsuario();
    ConectaBanco conecta = new ConectaBanco();
    Criptografia cripto = new Criptografia();
    String foto;
    BufferedImage imagem;
    int x;
    
    SerialPort serialPort;
        /** The port we're normally going to use. */
	
	private BufferedReader input;
	private OutputStream output;
	private static final int TIME_OUT = 2000;
	private static int DATA_RATE = 9600;
        private static String PORT_NAMES[] = new String[2];
        
    public TcadastroUsuarios(int x) {//esse construtor so é chamado se o formulario execultado pelo administrador
        initComponents();
        this.x = x;
        jTextFieldFoto.setVisible(false);
        conecta.conexao();
        preencherTabela("select * from cad_usuario order by nome_usuario");
        soLetrasMaiusculas();
        mascaras();
        //conecta.desconecta();
        SwingUtilities.invokeLater(new Runnable() {  
            public void run() {  
                jTextFieldCodigo.requestFocus();  
            }  
        });  
        verificaConfig();
        initialize();
        setIconeForme();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    public TcadastroUsuarios(String nome, int x) {//esse construtor é chamado pelo form Tusuario
        initComponents();
         this.x = x;
         if(this.x == 2){
             jTextFieldCodigo.setEnabled(false);
             jTextFieldLogin.setEnabled(false);
             jPasswordFieldSenha.setEnabled(false);
             jPasswordFieldConfirmarSenha.setEnabled(false);
             jComboBoxPermissão.setEnabled(false);
             jButtonExcluir.setEnabled(false);
             jButtonNovo.setEnabled(false);
             jButtonSalvar.setEnabled(false);
             jButtonBuscar.setEnabled(false);
             preencherFormePeloUsuario(nome);
             soLetrasMaiusculas();
             mascaras();
             verificaConfig();
             initialize();
             
         }
         jTextFieldFoto.setVisible(false);
         setIconeForme();
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         
     }
     
     public TcadastroUsuarios() {
        initComponents();
        
        this.x = x;
        jTextFieldFoto.setVisible(false);
        conecta.conexao();
        preencherTabela("select * from cad_usuario order by nome_usuario");
        soLetrasMaiusculas();
        mascaras();
        //conecta.desconecta();
        SwingUtilities.invokeLater(new Runnable() {  
            public void run() {  
                jTextFieldCodigo.requestFocus();  
            }  
        });  
        //initialize();
        setIconeForme();
        verificaConfig();
        initialize();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jComboBoxPermissão = new javax.swing.JComboBox();
        jTextFieldCurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldDataNasc = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelfoto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPeriodoIngresso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jTextFieldFoto = new javax.swing.JTextField();
        jTextFieldTag = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonNome = new javax.swing.JRadioButton();
        jRadioButtonCodigo = new javax.swing.JRadioButton();
        jTextFieldBusca = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSys 1.0 - Cadastro de Usuários");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usuário"));

        jComboBoxPermissão.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Usuário Comum" }));

        jLabel5.setText("Permissão");

        jLabel6.setText("Senha");

        jLabel2.setText("Nome");

        jLabel3.setText("Data Nascimento");

        jLabel7.setText("Confirmar Senha");

        jFormattedTextFieldDataNasc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldDataNascFocusLost(evt);
            }
        });

        jLabel1.setText("Nº Matricula");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/image_add.png"))); // NOI18N
        jButton1.setText("Foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Curso");

        jLabelfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Período de Ingresso");

        jLabel10.setText("Login");

        jTextFieldFoto.setText("jTextField1");

        jLabel8.setText("Tag");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTag))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldPeriodoIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxPermissão, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jTextFieldFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxPermissão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPeriodoIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/novo.png"))); // NOI18N
        jButtonNovo.setText("Limpar Campos");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        buttonGroup1.add(jRadioButtonNome);
        jRadioButtonNome.setSelected(true);
        jRadioButtonNome.setText("Nome");
        jRadioButtonNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonNomeMouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCodigo);
        jRadioButtonCodigo.setText("Matricula");
        jRadioButtonCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonCodigoMouseClicked(evt);
            }
        });
        jRadioButtonCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCodigoActionPerformed(evt);
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
                        .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButtonNome)
                        .addGap(30, 30, 30)
                        .addComponent(jRadioButtonCodigo)))
                .addContainerGap(27, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSair))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(573, 673));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(!comparaTag(jTextFieldTag.getText())){
            if(tamSenha(jPasswordFieldSenha.getText())){
                verificaCampoVazio();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "TAG existente, por favor informe outra TAG!");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        limparCampos();
        jButtonSalvar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if(jTextFieldBusca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Não há Nada Informado no Campo de Busca!");
        }
        else if(jRadioButtonNome.isSelected()){
            BuscarUsuarioPorNome();
            jButtonSalvar.setEnabled(false);
        }else{
            BuscarUsuarioPorCodigo();
            jButtonSalvar.setEnabled(false);
        }
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jRadioButtonCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonCodigoMouseClicked
            jRadioButtonNome.setSelected(false);
            jRadioButtonCodigo.setSelected(true);
    }//GEN-LAST:event_jRadioButtonCodigoMouseClicked

    private void jRadioButtonNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonNomeMouseClicked
        jRadioButtonNome.setSelected(true);
        jRadioButtonCodigo.setSelected(false);
    }//GEN-LAST:event_jRadioButtonNomeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FotoVi();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (!jTextFieldCodigo.getText().equals("")) {
            int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja Realmente Excluir Esse Registro?", "labSys 1.0", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                Controle.excluirUsuario(jTextFieldCodigo.getText());
                preencherTabela("select * from cad_usuario order by nome_usuario");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Há Campos vazios!");
            }
        }
        conecta.desconecta();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if(jTextFieldCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Há Campos vazios!");
        }else if(x == 2){ 
            alterarPeloUsuario();
            alterar();
           // jButtonSalvar.setEnabled(true);
        }else{
            alterar();
            jButtonSalvar.setEnabled(true);
            limparCampos();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        close();
        dispose();
        
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jFormattedTextFieldDataNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataNascFocusLost
        if(Controle.validaData(jFormattedTextFieldDataNasc.getText())){
        
        }else{
            //Controle.validaData();
            jFormattedTextFieldDataNasc.setText("");
            jFormattedTextFieldDataNasc.requestFocus();
        }
        
    }//GEN-LAST:event_jFormattedTextFieldDataNascFocusLost

    private void jTextFieldBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextFieldBusca.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Não há Nada Informado no Campo de Busca!");
            } else if (jRadioButtonNome.isSelected()) {
                BuscarUsuarioPorNome();
            } else {
                BuscarUsuarioPorCodigo();
            }
            jButtonSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldBuscaKeyPressed

    private void jRadioButtonCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCodigoActionPerformed

    public void salvar(){
        conecta.conexao();
        try{
            modelo.setMatricula(jTextFieldCodigo.getText());
            modelo.setNome(jTextFieldNome.getText());
            modelo.setDatNasc(jFormattedTextFieldDataNasc.getText());
            modelo.setPermissao(String.valueOf(jComboBoxPermissão.getSelectedItem()));
            modelo.setSenha(cripto.criptografiaBase64Encoder(jPasswordFieldSenha.getText()));
            modelo.setTag(jTextFieldTag.getText());
            modelo.setCurso(jTextFieldCurso.getText());
            modelo.setImagem(ManipularImagem.getImgBytes(imagem));
            modelo.setLogin(jTextFieldLogin.getText());
            modelo.setPeriodoIngresso(jTextFieldPeriodoIngresso.getText());
            Controle.salvar(modelo);
            preencherTabela("select * from cad_usuario order by nome_usuario");
            conecta.desconecta();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"ERRO - "+ ex);
        }
    }
    
    public void limparCampos(){
        JTextField[] jt = {jTextFieldBusca,jTextFieldFoto,jTextFieldTag,jTextFieldCodigo,jTextFieldCurso,jTextFieldLogin,jTextFieldNome,jTextFieldPeriodoIngresso};
        for(int i = 0; i < jt.length; i++){
            jt[i].setText("");
        }
        jFormattedTextFieldDataNasc.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        jPasswordFieldSenha.setText("");
        //jLabelfoto = null;
        jLabelfoto.setIcon(null);
    }
    
    public void BuscarUsuarioPorNome(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where nome_usuario like '%"+jTextFieldBusca.getText()+"%'");
        try {
            conecta.rs.first();
            jTextFieldCodigo.setText(conecta.rs.getString("cod_usuario"));
            jTextFieldNome.setText(conecta.rs.getString("nome_usuario"));
            jFormattedTextFieldDataNasc.setText(conecta.rs.getString("data_nasc_usuario"));
            jTextFieldCurso.setText(conecta.rs.getString("curso_usuario"));
            jComboBoxPermissão.setSelectedItem(conecta.rs.getString("permissao_usuario"));
            jTextFieldLogin.setText(conecta.rs.getString("login_usuario"));
            jTextFieldPeriodoIngresso.setText(conecta.rs.getString("periodo_ingresso"));
            ManipularImagem.exibiImagemLabel(conecta.rs.getBytes("foto_usuario"), jLabelfoto);
            //String caminho = conecta.rs.getString("foto_usuario");
           // javax.swing.ImageIcon i = 
            //new javax.swing.ImageIcon(caminho);
            //Image imag = i.getImage().getScaledInstance(jLabelfoto.getWidth(), jLabelfoto.getHeight(), Image.SCALE_SMOOTH);
            //jLabelfoto.setIcon(new ImageIcon(imag));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Nome de Usuário não Encontrado!"+ ex);
        }
        conecta.desconecta();
    }
    
    public void BuscarUsuarioPorCodigo(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where cod_usuario = '"+jTextFieldBusca.getText()+"'");
        try {
            conecta.rs.first();
            jTextFieldCodigo.setText(conecta.rs.getString("cod_usuario"));
            jTextFieldNome.setText(conecta.rs.getString("nome_usuario"));
            jFormattedTextFieldDataNasc.setText(conecta.rs.getString("data_nasc_usuario"));
            jTextFieldCurso.setText(conecta.rs.getString("curso_usuario"));
            jComboBoxPermissão.setSelectedItem(conecta.rs.getString("permissao_usuario"));
            jTextFieldLogin.setText(conecta.rs.getString("login_usuario"));
            jTextFieldPeriodoIngresso.setText(conecta.rs.getString("periodo_ingresso"));
            ManipularImagem.exibiImagemLabel(conecta.rs.getBytes("foto_usuario"), jLabelfoto);
            
//            String caminho = conecta.rs.getString("foto_usuario");
//            javax.swing.ImageIcon i = 
//            new javax.swing.ImageIcon(caminho);
//            Image imag = i.getImage().getScaledInstance(jLabelfoto.getWidth(), jLabelfoto.getHeight(), Image.SCALE_SMOOTH);
//            jLabelfoto.setIcon(new ImageIcon(imag));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Matricula de Usuário não Encontrado!"+ ex);
        }
        conecta.desconecta();
    }
    public  void soLetrasMaiusculas(){
        jTextFieldBusca.setDocument(new TrataCampoSoLetrasMaiusculas());
        jTextFieldCodigo.setDocument(new TrataCampoSoLetrasMaiusculasCodTam7());
        jTextFieldNome.setDocument(new TrataCampoSoLetrasMaiusculas());
        jTextFieldLogin.setDocument(new TrataCampoSoLetrasMaiusculas());
        jTextFieldCurso.setDocument(new TrataCampoSoLetrasMaiusculas());
        jPasswordFieldConfirmarSenha.setDocument(new TrataCampoTam10());
        jPasswordFieldSenha.setDocument(new TrataCampoTam10());
    }
    
    public void preencherTabela(String SQL){ //criando tabela
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Matricula","Nome","Data Nasc.","Curso", "Período Ingre."};
        conecta.conexao();
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getString("cod_usuario"),conecta.rs.getString("nome_usuario"),conecta.rs.getString("data_nasc_usuario"),conecta.rs.getString("curso_usuario"), conecta.rs.getString("periodo_ingresso")});
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
    
    public void FotoVi(){ //metodo insere imagem no cadastro de cliente
     
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();

            try {
                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), jLabelfoto.getWidth(), jLabelfoto.getHeight());

                jLabelfoto.setIcon(new ImageIcon(imagem));

            } catch (Exception ex) {
               // System.out.println(ex.printStackTrace().toString());
            }

        } else {
            //JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }
//        String caminho;
//    
//        javax.swing.JFileChooser seletor = 
//	new javax.swing.JFileChooser();
//       
//        int acao = seletor.showOpenDialog(this);
//       
//        java.io.File f = seletor.getSelectedFile();
//
//       
//         caminho = f.getPath();
//         jTextFieldFoto.setText(caminho);
//    
//        javax.swing.ImageIcon i = 
//	new javax.swing.ImageIcon(caminho);
//     
//        Image imag = i.getImage().getScaledInstance(jLabelfoto.getWidth(), jLabelfoto.getHeight(), Image.SCALE_SMOOTH);
//        jLabelfoto.setIcon(new ImageIcon(imag));//Label2 recebendo imagem ajustada ao seu tamanho
    }
    public void verificaCampoVazio(){
        
            if(!verificaCamposVazios1()){
                if (jPasswordFieldSenha.getText().equals(jPasswordFieldConfirmarSenha.getText())) {
                    salvar();
                    limparCampos();
                    if (x == 1) {
                        close();
                        Tlogin.main(null);
//                        Tlogin tl = new Tlogin();
//                        tl.show();
                        dispose();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "As Senhas Informadas nao Conferem!\nTente outra Vez!");
                    jPasswordFieldSenha.setText("");
                    jPasswordFieldConfirmarSenha.setText("");
                    jPasswordFieldSenha.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Há campos vazios");
            }

       
    }
    
    public  void alterar(){
       conecta.conexao();
        try {
            // TODO add your handling code here:
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_usuario set nome_usuario = ?, data_nasc_usuario = ?, curso_usuario = ?, periodo_ingresso = ?, foto_usuario = ?, tag = ? where cod_usuario = ?");
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jFormattedTextFieldDataNasc.getText());
            pst.setString(3, jTextFieldCurso.getText());
            pst.setString(4, jTextFieldPeriodoIngresso.getText());
            pst.setBytes(5, ManipularImagem.getImgBytes(imagem));
            pst.setString(6, jTextFieldTag.getText());
            pst.setString(7, jTextFieldCodigo.getText());
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!");
             preencherTabela("select * from cad_usuario order by nome_usuario"); 
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Alterar Dados!\n Erro" +ex);
        }
        
    }
    
    public  void alterarPeloUsuario(){
       conecta.conexao();
        try {
            // TODO add your handling code here:
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_usuario set nome_usuario = ?, data_nasc_usuario = ?, curso_usuario = ?, periodo_ingresso = ?,permissao_usuario = ?, login_usuario = ?, senha_usuario = ?, foto_usuario = ? where cod_usuario = ?");
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jFormattedTextFieldDataNasc.getText());
            pst.setString(3, jTextFieldCurso.getText());
            pst.setString(4, jTextFieldPeriodoIngresso.getText());
            pst.setString(5, String.valueOf(jComboBoxPermissão.getSelectedItem()));
            pst.setString(6, jTextFieldLogin.getText());
            pst.setString(7, jPasswordFieldSenha.getText());
            pst.setString(8, jTextFieldFoto.getText());
            pst.setString(9, jTextFieldCodigo.getText());
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!");
             preencherTabela("select * from cad_usuario order by nome_usuario"); 
            conecta.desconecta();
            dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Alterar Dados!\n Erro" +ex);
        }
        
    }
    
    public  void preencherFormePeloUsuario(String nome){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where login_usuario = '"+nome+"'");
        try {
            conecta.rs.first();
            jTextFieldCodigo.setText(conecta.rs.getString("cod_usuario"));
            jTextFieldNome.setText(conecta.rs.getString("nome_usuario"));
            jFormattedTextFieldDataNasc.setText(conecta.rs.getString("data_nasc_usuario"));
            jTextFieldCurso.setText(conecta.rs.getString("curso_usuario"));
            jComboBoxPermissão.setSelectedItem(conecta.rs.getString("permissao_usuario"));
            jTextFieldLogin.setText(conecta.rs.getString("login_usuario"));
            jTextFieldPeriodoIngresso.setText(conecta.rs.getString("periodo_ingresso"));
            jTextFieldFoto.setText(conecta.rs.getString("foto_usuario"));
//            try{
//            String caminho = conecta.rs.getString("foto_usuario");
//            javax.swing.ImageIcon i = 
//            new javax.swing.ImageIcon(caminho);
//            Image image = i.getImage().getScaledInstance(jLabelfoto.getWidth(), jLabelfoto.getHeight(), Image.SCALE_SMOOTH);
//            jLabelfoto.setIcon(new ImageIcon(image));
//            }catch(Exception e){
//                JOptionPane.showMessageDialog(rootPane,"ERRO AO PEGAR FOTO"+ e);
//            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Matricula de Usuário não Encontrado!"+ ex);
        }
        conecta.desconecta();
     }
     
     private void setIconeForme() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }
     
     public boolean verificaCamposVazios1(){
         JTextField[] jt = {jTextFieldCodigo,jTextFieldCurso,jTextFieldLogin,jTextFieldNome,jTextFieldPeriodoIngresso};
    
         for(int i = 0; i < jt.length; i++){
            if(jt[i].getText().equals("") || jFormattedTextFieldDataNasc.getText().equals("")|| jPasswordFieldSenha.getText().equals("") || jPasswordFieldConfirmarSenha.getText().equals("")){
                i=  jt.length;
                //JOptionPane.showMessageDialog(null, "Há Campos Vazios!");
                return true;
            }
        }
         return false;
    }
     
     
    public void initialize() {
                verificaConfig();
		CommPortIdentifier portId = null;
		Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
		while (portEnum.hasMoreElements()) {
			CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
			for (String portName : PORT_NAMES) {
				if (currPortId.getName().equals(portName)) {
					portId = currPortId;
					break;
				}
			}
		}
		if (portId == null) {
			System.out.println("Could not find COM port.");
                        JOptionPane.showMessageDialog(null, "ERRO porta COM não encontrada");
			return;
		}

		try {
			// open serial port, and use class name for the appName.
			serialPort = (SerialPort) portId.open(this.getClass().getName(),
					TIME_OUT);

			// set port parameters
			serialPort.setSerialPortParams(DATA_RATE,
					SerialPort.DATABITS_8,
					SerialPort.STOPBITS_1,
					SerialPort.PARITY_NONE);

			// open the streams
			input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
			output = serialPort.getOutputStream();

			// add event listeners
			serialPort.addEventListener(this);
			serialPort.notifyOnDataAvailable(true);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	} 
    private void enviarDados(String dados) {

        try {
            System.out.println(dados);
            output.write(dados.getBytes());
        } catch (IOException ex) {
            System.out.println("Exception serial :" + dados);
            System.out.println("Erro " + ex);
        }

    }
     
    public synchronized void serialEvent(SerialPortEvent oEvent) {
            String leitura;////////////////////
            
		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				String inputLine=input.readLine();
                                leitura = inputLine;///////////////
                                enviarDados("onGreen");
                                jTextFieldTag.setText(leitura);
                                jPasswordFieldSenha.requestFocus();
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}
		// Ignore todos os outros eventTypes , mas você deve considerar os outros.
    }
    public synchronized void close() {
	if (serialPort != null) {
            serialPort.removeEventListener();
            serialPort.close();
	}
    }
    
    public void verificaConfig(){
        //String config[] = new String[2];
        conecta.conexao();
        conecta.executaSQL("select *from configuracao");
        try{
            conecta.rs.last();
            PORT_NAMES[0] = conecta.rs.getString("porta_com");
            DATA_RATE = Integer.parseInt(conecta.rs.getString("boud_rate"));
        }catch(Exception e){
        }   
        conecta.desconecta();
    }
    
    public boolean comparaTag(String t){
        conecta.conexao();
        conecta.executaSQL("select * from cad_usuario");
        try {
            conecta.rs.first();
            if(conecta.rs.getString("tag").equals(t)){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TcadastroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
        return false;
    }
    
    public boolean tamSenha(String s){
        if(s.length() < 8){
            int selecteOption = JOptionPane.showConfirmDialog(this, "Sua senha possui menos de oito caracteres, senha considerada fraca!\ndeseja salvar assim mesmo?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
            if (selecteOption == JOptionPane.YES_OPTION) {
                return true;          
            }           
        }else{
            return true; 
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        TcadastroUsuarios main = new TcadastroUsuarios();
		//main.initialize();
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TcadastroUsuarios().setVisible(true);
            }
        });*/
	Thread t=new Thread() {
            public void run() {
		//a seguinte linha irá manter este aplicativo vivo por 1000 segundos,
		//à espera de eventos a ocorrer e responder a elas ( imprimir as mensagens recebidas para o console ).
		try {Thread.sleep(1000000);} catch (InterruptedException ie) {}
            }
	};
	t.start();
	System.out.println("Started");
        main.setVisible(true);
    }
    public  void mascaras(){
        try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##/##/####");
            jFormattedTextFieldDataNasc.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxPermissão;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNasc;
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
    private javax.swing.JLabel jLabelfoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JRadioButton jRadioButtonCodigo;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldFoto;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeriodoIngresso;
    private javax.swing.JTextField jTextFieldTag;
    // End of variables declaration//GEN-END:variables
}
