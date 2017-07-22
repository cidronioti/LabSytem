package br.com.labsystem.view;

import br.com.labsystem.bean.AtualizaHora;
import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.Criptografia;
import br.com.labsystem.bean.ManipularImagem;
import br.com.labsystem.bean.TrataCampoSoLetrasMaiusculas;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author CIDRONIO
 */
public class Tlogin extends javax.swing.JFrame implements SerialPortEventListener {

    ConectaBanco conecta = new ConectaBanco();
    ConectaBanco con = new ConectaBanco();
    Criptografia cripto = new Criptografia();

    SerialPort serialPort;
    private static int DATA_RATE;
    private BufferedReader input;
    private OutputStream output;
    private static final int TIME_OUT = 2000;
    private static String PORT_NAMES[] = new String[2];

    String leitura;

    public Tlogin() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | Tlogin.MAXIMIZED_BOTH);
        conecta.conexao();
        habilita();
        jTextFieldLogin.setDocument(new TrataCampoSoLetrasMaiusculas());
        jTextFieldLogin.setText("LOGIN...");
        AtualizaHora.start(jLabelHora);

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hoje = new Date();
        jLabelData.setText(df.format(hoje));
        jPanelConfig.setVisible(false);
        listarPortas();
        verificaConfig();
        initialize();
        setIconeForme();
        jLabelImgCarregando.setVisible(false);
        add(BorderLayout.NORTH, jPanel1);
        add(BorderLayout.SOUTH, jPanel2);
        //cLabel1.setVisible(false);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                jPanel1.requestFocus();
            }
        });
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);//bloqueia o botão close do form
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelImgCarregando = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelFechar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelHora = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cLabel1 = new com.bolivia.label.CLabel();
        jPanelConfig = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImgCarregando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImgCarregando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/img/unnamed2.gif"))); // NOI18N
        jPanel1.add(jLabelImgCarregando, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 34, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LabSys");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 392, 98));

        jLabelFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/fechar-16.png"))); // NOI18N
        jLabelFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFecharMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, -1, 22));

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(153, 153, 153));
        jLabelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHora.setText("jLabel5");
        jPanel2.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 130, 20));

        jLabelData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(153, 153, 153));
        jLabelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelData.setText("jLabel5");
        jPanel2.add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 160, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 510, 40));

        jRadioButton1.setBackground(new java.awt.Color(0, 51, 102));
        jRadioButton1.setToolTipText("Configurações");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/setings32.png"))); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordFieldSenha.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPasswordFieldSenha.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordFieldSenha.setText("sernha");
        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        jPanel3.add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 244, 260, 30));

        jTextFieldLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextFieldLogin.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldLogin.setText("Login...");
        jTextFieldLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldLoginMouseClicked(evt);
            }
        });
        jPanel3.add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 197, 260, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Cadastrar Admin");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 287, 110, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/img/bt_entrar.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 279, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/img/bt_sair.png"))); // NOI18N
        jLabel2.setText("Senha");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 279, 70, 40));

        cLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/img/user-128.jpg"))); // NOI18N
        cLabel1.setText("");
        jPanel3.add(cLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 79, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 151, 390, 370));

        jPanelConfig.setBackground(new java.awt.Color(0, 51, 102));
        jPanelConfig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelConfig.setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COM0" }));
        jPanelConfig.add(jComboBox1);
        jComboBox1.setBounds(10, 30, 130, 21);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Porta COM");
        jPanelConfig.add(jLabel5);
        jLabel5.setBounds(10, 10, 120, 15);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Boud Rate");
        jPanelConfig.add(jLabel6);
        jLabel6.setBounds(10, 60, 60, 15);

        jComboBox2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9600" }));
        jPanelConfig.add(jComboBox2);
        jComboBox2.setBounds(10, 80, 130, 21);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButton2.setText("Conectar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelConfig.add(jButton2);
        jButton2.setBounds(10, 110, 130, 15);

        jPanel4.add(jPanelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 160, 160));

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1300, 865));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/img/bt_entrar_realce.png")));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/img/bt_entrar.png")));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/img/bt_sair_realce.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/img/bt_sair.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jTextFieldLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldLoginMouseClicked
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
        jTextFieldLogin.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordFieldSenha.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jTextFieldLoginMouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        close();
        new TcadastroUsuarios(1).show();
        jLabel4.setVisible(false);
        jTextFieldLogin.requestFocus();

        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        conecta.conexao();
        if (!jTextFieldLogin.getText().equals("LOGIN...")) {

            conecta.executaSQL("select *from cad_usuario where login_usuario ='" + jTextFieldLogin.getText() + "'");

            try {
                conecta.rs.first();
                if (conecta.rs.getString("permissao_usuario").equals("Usuário Comum") && cripto.descriptografiaBase64Decoder(conecta.rs.getString("senha_usuario")).equals(jPasswordFieldSenha.getText())) {
                    close();
                    new Tusuario(jTextFieldLogin.getText(), jLabelHora.getText()).show();
                    conecta.desconecta();
                    dispose();
                } //                if (conecta.rs.getString("permissao_usuario").equals("Administrador")) {
                //                    new Tprincipal().show();
                //                    dispose();
                //                } 
                else if (conecta.rs.getString("permissao_usuario").equals("Administrador") && cripto.descriptografiaBase64Decoder(conecta.rs.getString("senha_usuario")).equals(jPasswordFieldSenha.getText())) {
                    close();
                    new Tprincipal(jTextFieldLogin.getText()).show();
                    conecta.desconecta();
                    dispose();
                } else {
                    //JOptionPane.showMessageDialog(rootPane, "Usuario ou Senha Incorreto!");                  
                    jPasswordFieldSenha.setText("");
                    jPasswordFieldSenha.requestFocus();
                    Toolkit.getDefaultToolkit().beep();
                    //jTextFieldLogin.setText("");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO - \n" + ex);
            }
        }
        conecta.desconecta();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //conecta.desconecta();
        TloginAdimin la = new TloginAdimin(null, true);
        la.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed
        conecta.conexao();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!jTextFieldLogin.getText().equals("LOGIN...")) {

                conecta.executaSQL("select *from cad_usuario where login_usuario ='" + jTextFieldLogin.getText() + "'");

                try {
                    conecta.rs.first();
                    if (conecta.rs.getString("permissao_usuario").equals("Usuário Comum") && cripto.descriptografiaBase64Decoder(conecta.rs.getString("senha_usuario")).equals(jPasswordFieldSenha.getText())) {
                        close();
                        new Tusuario(jTextFieldLogin.getText(), jLabelHora.getText()).show();
                        dispose();
                    } //                if (conecta.rs.getString("permissao_usuario").equals("Administrador")) {
                    //                    new Tprincipal().show();
                    //                    dispose();
                    //                } 
                    else if (conecta.rs.getString("permissao_usuario").equals("Administrador") && cripto.descriptografiaBase64Decoder(conecta.rs.getString("senha_usuario")).equals(jPasswordFieldSenha.getText())) {
                        close();
                        new Tprincipal(jTextFieldLogin.getText()).show();
                        dispose();
                    } else {
                        //JOptionPane.showMessageDialog(rootPane, "Usuario ou Senha Incorreto!");                  
                        jPasswordFieldSenha.setText("");
                        jPasswordFieldSenha.requestFocus();
                        //jTextFieldLogin.setText("");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorreto!");
                }
            }
        }
        conecta.desconecta();
    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DATA_RATE = Integer.parseInt((String) jComboBox2.getSelectedItem());
        PORT_NAMES[0] = (String) jComboBox1.getSelectedItem();
        config();
        initialize();
        jPanelConfig.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            jPanelConfig.setVisible(true);
        } else {
            jPanelConfig.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jLabelFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelFecharMouseClicked

    public void habilita() { //Habilita botão q chama cadastro de usuario
        conecta.executaSQL("select * from cad_usuario ");
        try {
            conecta.rs.first();
            if (conecta.rs.getString("senha_usuario").equals("'")) {
                jLabel1.setEnabled(false);
                jLabel2.setEnabled(false);
                jLabel4.setVisible(true);
                jLabelFechar.setVisible(true);
            } else {
                jLabel4.setVisible(false);
                jLabelFechar.setVisible(false);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(TLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setIconeForme() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }

    public void listarPortas() {
        Enumeration<CommPortIdentifier> listaPortasCom = CommPortIdentifier.getPortIdentifiers();
        while (listaPortasCom.hasMoreElements()) {
            CommPortIdentifier identifPorta = listaPortasCom.nextElement();
            jComboBox1.addItem(identifPorta.getName());
        }
    }

    public void initialize() {

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
            jLabel7.setText("ERRO ao tentar se conectar a porta: " + PORT_NAMES[0]);
            //System.out.println("Could not find COM port.");
            //JOptionPane.showMessageDialog(null, "ERRO porta COM não encontrada");
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

            jLabel7.setText("Conectado a porta Serial " + PORT_NAMES[0]);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public synchronized void close() {
        if (serialPort != null) {
            serialPort.removeEventListener();
            serialPort.close();
            System.out.println("porta fechada");
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

    public void loginTag() {
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where tag ='" + leitura + "'");

        try {
            conecta.rs.first();
            if (conecta.rs.getString("permissao_usuario").equals("Usuário Comum")) {
                close();

                //Acessender led verde
                //enviarDados("onGreen");

                new Tusuario(conecta.rs.getString("login_usuario"), jLabelHora.getText()).show();
                dispose();
            } //                if (conecta.rs.getString("permissao_usuario").equals("Administrador")) {
            //                    new Tprincipal().show();
            //                    dispose();
            //                } 
            else if (conecta.rs.getString("permissao_usuario").equals("Administrador")) {
                close();

                //Acessender led verde
                //enviarDados("onGreen");

                new Tprincipal(conecta.rs.getString("login_usuario")).show();
                dispose();
            } else {
                //Acessender led vermelho 
                //enviarDados("onRed");

                //JOptionPane.showMessageDialog(rootPane, "Usuario ou Senha Incorreto!");                  
                jPasswordFieldSenha.setText("");
                jPasswordFieldSenha.requestFocus();
                //jTextFieldLogin.setText("");
            }
        } catch (SQLException ex) {
            //enviarDados("onRed");
            JOptionPane.showMessageDialog(null, "Sua TAG não foi encontrada");
        }
        conecta.desconecta();
    }

    public void config() {//esse método salva as configurações de porta COM e boud rate no banco de dados
        conecta.conexao();
        if (!jComboBox1.getSelectedItem().equals("COM0")) {
            try {
                PreparedStatement pst = conecta.conn.prepareStatement("insert into configuracao(porta_com, boud_rate) values(?,?)");
                pst.setString(1, (String) jComboBox1.getSelectedItem());
                pst.setString(2, (String) jComboBox2.getSelectedItem());
                pst.execute();
                //JOptionPane.showMessageDialog(rootPane, "Salvo com Sucesso");
            } catch (SQLException ex) {
                //Logger.getLogger(Tlogin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Erro: " + ex);
            }
        }
        conecta.desconecta();
    }

    public void verificaConfig() {//esse método busca as ultimas configurações de comunicação serial no banco de dados como "porta COM" para o sistema ficar escutando
        //String config[] = new String[2];
        conecta.executaSQL("select *from configuracao");
        try {
            conecta.rs.last();
            PORT_NAMES[0] = conecta.rs.getString("porta_com");
            DATA_RATE = Integer.parseInt(conecta.rs.getString("boud_rate"));
        } catch (Exception e) {
        }
        conecta.desconecta();
    }

    public void imgProgresso() {// imagem que indica que o usuário deve aguardar em quanto efetua o login  
        javax.swing.ImageIcon i
                = new javax.swing.ImageIcon("br.com.labsystem.img/unnamed.gif");

        Image imag = i.getImage().getScaledInstance(jLabelImgCarregando.getWidth(), jLabelImgCarregando.getHeight(), Image.SCALE_SMOOTH);
        jLabelImgCarregando.setIcon(new ImageIcon(imag));
    }

    private void limpaCompos() {
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.bolivia.label.CLabel cLabel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelFechar;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelImgCarregando;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelConfig;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables

    @Override
    public void serialEvent(SerialPortEvent oEvent) {
        ////////////////////

        if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
            conecta.conexao();
            try {
                String inputLine = input.readLine();
                leitura = inputLine;///////////////
                System.out.println(leitura);

                if (!(leitura.equals("") && leitura.equals("\n") && leitura.equals("\r"))) {
                    conecta.executaSQL("select * from cad_usuario where tag = '" + leitura + "'");
                    conecta.rs.first();

                    if (!(conecta.rs.getString("nome_usuario").isEmpty() && conecta.rs.getString("login_usuario").isEmpty() && conecta.rs.getString("senha_usuario").isEmpty())) {
                        jLabel7.setText("Aluno: " + conecta.rs.getString("nome_usuario"));
                        ManipularImagem.exibiImagemLabel(conecta.rs.getBytes("foto_usuario"), cLabel1);
                        limpaCompos();
                        jTextFieldLogin.setText(conecta.rs.getString("login_usuario"));
                        jPasswordFieldSenha.setText(conecta.rs.getString("senha_usuario"));
                        cLabel1.setVisible(true);
                        jLabelImgCarregando.setVisible(true);
                        enviarDados("onGreen");
                        
                        Thread.sleep(3000);
                        
                        //cLabel1.setVisible(false);
                        jLabelImgCarregando.setVisible(false);
                        //conecta.desconecta();
                        loginTag();
                    } else {
                        enviarDados("onRed");
                        JOptionPane.showMessageDialog(rootPane, "Tag não Cadastrada!");
                    }
                }
            } catch (SQLException e) {
                enviarDados("onRed");
                JOptionPane.showMessageDialog(rootPane, "Tag não Cadastrada!");
                //JOptionPane.showMessageDialog(rootPane, "Erro ExecutaSQL: " + e.toString());
            } catch (IOException | InterruptedException ex) {
                //Logger.getLogger(Tlogin.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ERRO IO | Interrup: "+ex);
            }
            conecta.desconecta();
        }
    }

}
