
package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.Criptografia;
import br.com.labsystem.bean.TrataCampoSoLetrasMaiusculas;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CIDRONIO
 */
public class TloginAdimin extends javax.swing.JDialog {
    ConectaBanco conecta = new ConectaBanco();
    Criptografia cripto = new Criptografia();
    public TloginAdimin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTextFieldLogin.setDocument(new TrataCampoSoLetrasMaiusculas());
        setIconeForme();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonConfirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSys 1.0 - Login Admin");

        jPanel1.setLayout(null);

        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLogin);
        jTextFieldLogin.setBounds(110, 50, 180, 20);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(110, 80, 180, 20);

        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/ok.png"))); // NOI18N
        jButtonConfirmar.setText("Ok");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConfirmar);
        jButtonConfirmar.setBounds(110, 110, 70, 25);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/cancel.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 110, 100, 25);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informe seu Login e Senha de Administrador");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 270, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/img/lock.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 50, 50, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(344, 191));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed

    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        conecta.conexao();
        if (!jTextFieldLogin.getText().equals("")) {
            
            conecta.executaSQL("select *from cad_usuario where login_usuario ='" + jTextFieldLogin.getText() + "'");

            try {
                conecta.rs.first();
                if (conecta.rs.getString("permissao_usuario").equals("Administrador") && cripto.descriptografiaBase64Decoder(conecta.rs.getString("senha_usuario")).equals(jPasswordFieldSenha.getText()) && conecta.rs.getString("login_usuario").equals(jTextFieldLogin.getText())) {
                    int selecteOption = JOptionPane.showConfirmDialog(this, "Caso Algum Usuário Tenha Esquecido de Registrar a Saída\nDeseja Registrar Automáticamente?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
                    if (selecteOption == JOptionPane.YES_OPTION) {
                        Tprincipal ext = new Tprincipal();
                        ext.registraSaidaAutomatca();            
                    }

                    int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja Realmente Sair do Sistema?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
                    if (selectedOption == JOptionPane.YES_OPTION) {
                        dispose();
                        System.exit(0);
                    }
                    //System.exit(0);
                    //conecta.desconecta();
                } else {
                    jTextFieldLogin.setText("");
                    jPasswordFieldSenha.setText("");
                    jTextFieldLogin.requestFocus();
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorretos \nou Você não é Administrador do Sistema!");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO - Login Incorreto ou há um \nProblema de Conexão com a Base de Dados\n"+ex);
                conecta.desconecta();
            }
            conecta.desconecta();
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            conecta.conexao();
            if (!jTextFieldLogin.getText().equals("")) {

                conecta.executaSQL("select *from cad_usuario where login_usuario ='" + jTextFieldLogin.getText() + "'");

                try {
                    conecta.rs.first();
                    if (conecta.rs.getString("permissao_usuario").equals("Administrador") && cripto.descriptografiaBase64Decoder(conecta.rs.getString("senha_usuario")).equals(jPasswordFieldSenha.getText()) && conecta.rs.getString("login_usuario").equals(jTextFieldLogin.getText())) {
                        int selecteOption = JOptionPane.showConfirmDialog(this, "Caso Algum Usuário Tenha Esquecido de Registrar a Saída\nDeseja Registrar Automáticamente?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
                        if (selecteOption == JOptionPane.YES_OPTION) {
                            Tprincipal ext = new Tprincipal();
                            ext.registraSaidaAutomatca();            
                        }

                        int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja Realmente Sair do Sistema?", "labSys 1.0", JOptionPane.YES_NO_OPTION);   
                        if (selectedOption == JOptionPane.YES_OPTION) {
                            dispose();
                            System.exit(0);
                        }
                        //System.exit(0);
                        //conecta.desconecta();
                    } else {
                        jTextFieldLogin.setText("");
                        jPasswordFieldSenha.setText("");
                        jTextFieldLogin.requestFocus();
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorretos \nou Você não é Administrador do Sistema!");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO - Login Incorreto ou há um \nProblema de Conexão com a Base de Dados\n" + ex);
                    conecta.desconecta();
                }
                conecta.desconecta();
            }
        }
    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

    private void setIconeForme() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TloginAdimin dialog = new TloginAdimin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
