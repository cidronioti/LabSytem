
package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.Criptografia;
import br.com.labsystem.bean.TrataCampoSoLetrasMaiusculas;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Manoel
 */
public class RecuperaSenha extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    Criptografia cripto = new Criptografia();
    public RecuperaSenha() {
        initComponents();
        setIconeForme();
        jTextFieldBusca.setDocument(new TrataCampoSoLetrasMaiusculas());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonNome = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextFieldBusca = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1SenhaRecuperada = new javax.swing.JTextField();
        jButtonRecuperarSenha = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSystem 1.0 - Recuperar Senha");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(jRadioButtonNome);
        jRadioButtonNome.setSelected(true);
        jRadioButtonNome.setText("Nome");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Num. Matricula");

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/visualizar.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldBusca)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButtonNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonNome)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel1.setText("Matricula");

        jTextFieldMatricula.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMatricula.setEnabled(false);

        jLabel2.setText("Nome");

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setEnabled(false);

        jLabel3.setText("Senha Recuperada");

        jButtonRecuperarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/key.png"))); // NOI18N
        jButtonRecuperarSenha.setText("Recuperar Senha");
        jButtonRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecuperarSenhaActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1SenhaRecuperada)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRecuperarSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1SenhaRecuperada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRecuperarSenha)
                    .addComponent(jButtonSair))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(331, 275));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if(jTextFieldBusca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Não há Nada Informado no Campo de Busca!");
        }
        else if(jRadioButtonNome.isSelected()){
            BuscarUsuarioPorNome();            
        }else{
            BuscarUsuarioPorCodigo();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecuperarSenhaActionPerformed
        if(!jTextFieldMatricula.getText().equals("")){
            recuperaSenha();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Os campos Matricula e Nome estão vazios!");
        }
    }//GEN-LAST:event_jButtonRecuperarSenhaActionPerformed

    
    public void BuscarUsuarioPorNome(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where nome_usuario like '%"+jTextFieldBusca.getText()+"%'");
        try {
            conecta.rs.first();
            jTextFieldMatricula.setText(conecta.rs.getString("cod_usuario"));
            jTextFieldNome.setText(conecta.rs.getString("nome_usuario"));
            
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
            jTextFieldMatricula.setText(conecta.rs.getString("cod_usuario"));
            jTextFieldNome.setText(conecta.rs.getString("nome_usuario"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Matricula de Usuário não Encontrado!"+ ex);
        }
        conecta.desconecta();
    }
    
    public  void recuperaSenha(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where cod_usuario = '"+jTextFieldMatricula.getText()+"'and nome_usuario ='"+jTextFieldNome.getText()+"'");
        try {
            conecta.rs.first();
            jTextField1SenhaRecuperada.setText(cripto.descriptografiaBase64Decoder(conecta.rs.getString("senha_usuario")));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO - "+ ex);
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
                new RecuperaSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonRecuperarSenha;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JTextField jTextField1SenhaRecuperada;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
