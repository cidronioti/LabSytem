
package br.com.labsystem.view;

import br.com.labsystem.bean.AtualizaHora;
import br.com.labsystem.bean.ConectaBanco;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author CIDRONIO
 */
public class Tprincipal extends javax.swing.JFrame {
  ConectaBanco conecta= new ConectaBanco();
  JFileChooser RealizarBackupMySQL=new JFileChooser();
    public Tprincipal(String nome) {
        initComponents();
        this.setExtendedState(this.getExtendedState()|Tlogin.MAXIMIZED_BOTH);       
        AtualizaHora.start(jLabelHora);       
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hoje = new Date();
        jLabelData.setText(df.format(hoje));
        setIconeForme();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);//bloqueia o botão close do form
    }   
     public Tprincipal() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jButtonCadastrarUsuario = new javax.swing.JButton();
        jButtonCadMaquinas = new javax.swing.JButton();
        jButtonBackup = new javax.swing.JButton();
        jButtonBloquear = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelHora = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LabSys 1.0 - Sistema para Controle do Laboratorio Curso de Sitemas de Informação da UFPI");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jButtonCadastrarUsuario.setBackground(new java.awt.Color(0, 49, 102));
        jButtonCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/user-48.png"))); // NOI18N
        jButtonCadastrarUsuario.setToolTipText("Cadastrar Usuário");
        jButtonCadastrarUsuario.setBorder(null);
        jButtonCadastrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarUsuarioActionPerformed(evt);
            }
        });

        jButtonCadMaquinas.setBackground(new java.awt.Color(0, 51, 102));
        jButtonCadMaquinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/imac48.png"))); // NOI18N
        jButtonCadMaquinas.setToolTipText("Cadastrar máquina");
        jButtonCadMaquinas.setBorder(null);
        jButtonCadMaquinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMaquinasActionPerformed(evt);
            }
        });

        jButtonBackup.setBackground(new java.awt.Color(0, 51, 102));
        jButtonBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/database-48.png"))); // NOI18N
        jButtonBackup.setToolTipText("Ferramenta de banco de dados");
        jButtonBackup.setBorder(null);
        jButtonBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackupActionPerformed(evt);
            }
        });

        jButtonBloquear.setBackground(new java.awt.Color(0, 51, 102));
        jButtonBloquear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/locked-48.png"))); // NOI18N
        jButtonBloquear.setToolTipText("Bloquear");
        jButtonBloquear.setBorder(null);
        jButtonBloquear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBloquearActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(0, 51, 102));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/close48.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair do sistema");
        jButtonSair.setBorder(null);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabelHora.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHora.setText("jLabel2");

        jLabelData.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelData.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButtonCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonCadMaquinas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCadMaquinas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelData))
                            .addComponent(jLabelHora))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/img/logo_lasys.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(221, 144, 207, 159);
        jPanel2.add(jLabelLogo, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jMenu1.setText("Cadastros");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/users.png"))); // NOI18N
        jMenuItem1.setMnemonic('U');
        jMenuItem1.setText("Usuários");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/computers.png"))); // NOI18N
        jMenuItem2.setMnemonic('M');
        jMenuItem2.setText("Máquinas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/user_add.png"))); // NOI18N
        jMenuItem10.setMnemonic('E');
        jMenuItem10.setText("Entrada de Usuário");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/user_delete.png"))); // NOI18N
        jMenuItem4.setMnemonic('S');
        jMenuItem4.setText("Saida de Usuário");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/clock.png"))); // NOI18N
        jMenuItem11.setMnemonic('M');
        jMenuItem11.setText("Horário Monitoria");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/lock_disabled.png"))); // NOI18N
        jMenuItem5.setMnemonic('B');
        jMenuItem5.setText("Bloquear");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem22.setText("Lista de Equipamentos");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem22);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/exit.png"))); // NOI18N
        jMenuItem3.setMnemonic('S');
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('F');
        jMenu2.setText("Relatórios");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/RelatorioUsuario.png"))); // NOI18N
        jMenuItem7.setText("Frequencia do Dia");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setMnemonic('H');
        jMenuItem8.setText("Histórico de Acesso");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/relatorioHorarioMonitoria.png"))); // NOI18N
        jMenuItem9.setMnemonic('M');
        jMenuItem9.setText("Horário dos Monitores");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/relatorioMaquinas.png"))); // NOI18N
        jMenu5.setText("Máquinas");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/relatorioMaquinas.png"))); // NOI18N
        jMenuItem12.setMnemonic('T');
        jMenuItem12.setText("Todas");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/relatorioMaquinasDefeito.png"))); // NOI18N
        jMenuItem13.setMnemonic('D');
        jMenuItem13.setText("Máquinas c/ Defeito");
        jMenuItem13.setToolTipText("");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ferramentas");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/database.png"))); // NOI18N
        jMenu6.setText("Banco de Dados");

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/database_save.png"))); // NOI18N
        jMenuItem14.setText("Backup");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/database_refresh.png"))); // NOI18N
        jMenuItem6.setText("Restore");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenu4.add(jMenu6);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/kgpg_identity.png"))); // NOI18N
        jMenu12.setText("Senha");

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/key.png"))); // NOI18N
        jMenuItem23.setText("Recuperar Senha");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem23);

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/key_add.png"))); // NOI18N
        jMenuItem24.setText("Alterar Senha");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem24);

        jMenu4.add(jMenu12);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/setings18.png"))); // NOI18N
        jMenuItem18.setText("Configurações");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Utilitários");

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/world_link.png"))); // NOI18N
        jMenu8.setText("Links");

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setText("SIGAA");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem16);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/UFPIico.png"))); // NOI18N
        jMenuItem17.setText("UFPI");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenu7.add(jMenu8);

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/text_align_center.png"))); // NOI18N
        jMenuItem25.setText("Relatório de Monitoria");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem25);

        jMenuBar1.add(jMenu7);

        jMenu3.setText("Ajuda");

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/pdf (2).png"))); // NOI18N
        jMenuItem15.setText("Manual");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1124, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TcadastroUsuarios(0).show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TcadastroMaquinas.main(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new TsaidaUsuário(jLabelData.getText()).show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int selecteOption = JOptionPane.showConfirmDialog(this, "Caso Algum Usuário Tenha Esquecido de Registrar a Saída\nDeseja Registrar Automáticamente?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
        if (selecteOption == JOptionPane.YES_OPTION) {
            registraSaidaAutomatca();            
        }
        
        int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja Realmente Sair do Sistema?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
        if (selectedOption == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Tlogin.main(null);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ThistoricoAcesso.main(null);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new TentradaUsuario(jLabelData.getText(), jLabelHora.getText()).show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new Tfrequencia(jLabelData.getText()).show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        ThorarioMonitoria.main(null);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        try {
            Connection conectaR = new ConectaBanco().conexaoRetorno();
            HashMap parameter = new HashMap();
            JasperPrint jasperPrint;
            jasperPrint = JasperFillManager.fillReport("./ireport/horario_monitoria.jasper", parameter, conectaR);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setTitle("LabSys 1.0 - Horários dos Monitores");///setando o título na barra de titulos
            jasperViewer.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));//setando o icone na barra de titulos
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            // Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        conecta.conexao();
        try {//problema no caminho do relatorio
                Connection conectaR = new ConectaBanco().conexaoRetorno();
                HashMap parameter = new HashMap();
                JasperPrint jasperPrint;
                jasperPrint = JasperFillManager.fillReport("ireport/maquinas_todas.jasper", parameter, conectaR);
                JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                jasperViewer.setTitle("LabSys 1.0 - Relatório de Todas as Máquinas");///setando o título na barra de titulos
                jasperViewer.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));//setando o icone na barra de titulos
                jasperViewer.setVisible(true);
                jasperViewer.toFront();
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatório" + ex);
            }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        try {
            Connection conectaR = new ConectaBanco().conexaoRetorno();
            HashMap parameter = new HashMap();
            JasperPrint jasperPrint;
            jasperPrint = JasperFillManager.fillReport("./ireport/maquinas_com_defeito.jasper", parameter, conectaR);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setTitle("LabSys 1.0 - Relatório de Máquinas com Defeito");///setando o título na barra de titulos
            jasperViewer.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));//setando o icone na barra de titulos
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            // Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jButtonCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarUsuarioActionPerformed
        new TcadastroUsuarios(0).show();
    }//GEN-LAST:event_jButtonCadastrarUsuarioActionPerformed

    private void jButtonCadMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMaquinasActionPerformed
        new TcadastroMaquinas().show();
    }//GEN-LAST:event_jButtonCadMaquinasActionPerformed

    private void jButtonBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackupActionPerformed
    new TopcoesBackup().show();
    //GenerarBackupMySQL();
    }//GEN-LAST:event_jButtonBackupActionPerformed

    private void jButtonBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBloquearActionPerformed
        Tlogin tl = new Tlogin();
        tl.show();
        dispose();
    }//GEN-LAST:event_jButtonBloquearActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        int selecteOption = JOptionPane.showConfirmDialog(this, "Caso Algum Usuário Tenha Esquecido de Registrar a Saída\nDeseja Registrar Automáticamente?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
        if (selecteOption == JOptionPane.YES_OPTION) {
            registraSaidaAutomatca();            
        }
        
        int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja Realmente Sair do Sistema?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
        if (selectedOption == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        new TlistaEquipamentos(jLabelData.getText()).show();
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
      try {
          Runtime.getRuntime().exec("cmd.exe /C start AcroRd32.exe C:\\LabSystem\\ireport\\Ajuda.pdf");
      } catch (IOException ex) {
          JOptionPane.showMessageDialog(null,"ERRO - erro ao tentar abrir o arquivo!"+ ex);
      }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        try{
            Desktop.getDesktop().browse(new URI("http://www.ufpi.br/"));
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed

        try{
            Desktop.getDesktop().browse(new URI("http://sigaa.ufpi.br/"));
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        //GenerarBackupMySQL();
        new Tbackup().show();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(this, "Para que a Restauração do Backup seja Realizada com Sucesso,\n é Necessário que o Arquivo de Backup Esteja em um Diretório do Computador\n e não em uma Unidade Externa como Pen drives, HD Externo e Etc.\n O Arquivo de Backup Está no Computador?", "LabSys 1.0 - Atenção", JOptionPane.YES_NO_OPTION);   
        if (selectedOption == JOptionPane.YES_OPTION) {
            //RestaurarBackupMySQL();
            new TrestauraBackup().show();
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        new RecuperaSenha().show();
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        new TalteraSenha().show();
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        int selecteOption = JOptionPane.showConfirmDialog(this, "Caso Algum Usuário Tenha Esquecido de Registrar a Saída\nDeseja Registrar Automáticamente?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
        if (selecteOption == JOptionPane.YES_OPTION) {
            registraSaidaAutomatca();            
        }
        
        int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja Realmente Sair do Sistema?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
        if (selectedOption == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /C start WINWORD.exe C:\\LabSystem\\relat_mon\\Relatório_Monitoria.docx");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO - erro ao tentar abrir o arquivo!" + ex);
        }
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        new TconfigInicialSistema(2).setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void setIconeForme() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }
    
    void GenerarBackupMySQL(){
        int resp;
        Calendar c=Calendar.getInstance();
        String fecha=String.valueOf(c.get(Calendar.DATE));
        fecha=fecha+"-"+String.valueOf(c.get(Calendar.MONTH));
        fecha=fecha+"-"+String.valueOf(c.get(Calendar.YEAR));     
        resp=RealizarBackupMySQL.showSaveDialog(this);//JFileChooser de nome RealizarBackupMySQL
        if (resp==JFileChooser.APPROVE_OPTION) {//Se o usuario presionar salvar; genera o Backup
            try{
                Runtime runtime = Runtime.getRuntime();
                File backupFile = new File(String.valueOf(RealizarBackupMySQL.getSelectedFile().toString())
                        +"_"+fecha+".sql");
                FileWriter fw = new FileWriter(backupFile);
                Process child = runtime.exec("C:\\xampp\\mysql\\bin\\mysqldump --opt --user=root "
                        + "--databases labsys -R"); 
                InputStreamReader irs = new InputStreamReader(child.getInputStream());
                BufferedReader br = new BufferedReader(irs);

                String line;
                while( (line=br.readLine()) != null ) {
                    fw.write(line + "\n");
                }
                fw.close();
                irs.close();
                br.close();               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERRO ao Realizar o Backup:"+e.getMessage(), "LabSys 1.0",JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "Arquivo Gerado","LabSys 1.0",JOptionPane.INFORMATION_MESSAGE);
        } else if (resp==JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null,"Geração do Backup Cancelada!");
        }
    }
    
    void RestaurarBackupMySQL(){
        int resp;       
        resp=RealizarBackupMySQL.showSaveDialog(this);//JFileChooser de nome RealizarBackupMySQL
        if (resp==JFileChooser.APPROVE_OPTION) {//Se o usuario presiona salvar; será gerado o Backup
            try{
                //Runtime runtime = Runtime.getRuntime();
                File restoreFile = new File(String.valueOf(RealizarBackupMySQL.getSelectedFile().toString()));
                System.out.println(restoreFile);
                String dirMysql = "C:\\xampp\\mysql\\bin"; 
                String comandoMysql = "cmd /c mysql -uroot labsys < "+restoreFile+"";  
                Process process = Runtime.getRuntime().exec(comandoMysql, null, new File(dirMysql));  
                process.waitFor();  
                JOptionPane.showMessageDialog(null, "Backup Restaurado com Sucesso!","LabSys 1.0",JOptionPane.INFORMATION_MESSAGE);  
         } catch (IOException | InterruptedException ex) {  
            JOptionPane.showMessageDialog(null, "Não foi possivel restaurar o banco de dados"); 
         }
            
        } else if (resp==JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null,"Restauração do Banco de Dados Cancelada!");
        }
    }
    
    public void registraSaidaAutomatca(){
        conecta.conexao();
        conecta.executaSQL("select * from controle_acesso where status_controle_acesso ='LOGADO'");
      try {
          conecta.rs.first();
          if(conecta.rs.getString("status_controle_acesso").equals("LOGADO")){
            PreparedStatement pst = conecta.conn.prepareStatement("update controle_acesso set status_controle_acesso = ?, hora_saida = ? where status_controle_acesso ='LOGADO'");
            pst.setString(1, "DESLOGADO");
            pst.setString(2, jLabelHora.getText());
            pst.execute();
            
            if(conecta.rs.getString("cod_maquina").equals("C.P.")){// alteração para permitir que usuário faça uso de sua maquina pessoal "notbook"
                    
            }else{
                    atualizaStatusUsoLivre();//verifica
            }
            conecta.desconecta();
          }
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,"Provávelmente Todos os Usuários Registraram a Saída!\n"+ ex);
      }
    }
    
    public void atualizaStatusUsoLivre(){
         conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_maquina set status_uso = 'L' where status_uso = 'O'");
            pst.execute();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"ERRO - Ao Atualizar Status Maquina para Livre!\n"+ ex);
        }
        conecta.desconecta();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackup;
    private javax.swing.JButton jButtonBloquear;
    private javax.swing.JButton jButtonCadMaquinas;
    private javax.swing.JButton jButtonCadastrarUsuario;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
