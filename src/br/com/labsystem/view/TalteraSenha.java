
package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.Criptografia;
import br.com.labsystem.bean.TrataCampoSoLetrasMaiusculas;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Manoel
 */
public class TalteraSenha extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    Criptografia cripto = new Criptografia();
    public TalteraSenha() {
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
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldSenhaAntiga = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldNovaSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldRepetirNovaSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSys 1.0 - Alterar Senha");
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
                .addContainerGap(19, Short.MAX_VALUE))
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

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setEnabled(false);

        jLabel2.setText("Nome");

        jLabel3.setText("Senha Antiga");

        jLabel4.setText("Nova Senha");

        jLabel5.setText("Confirmar Nova Senha");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/key_add.png"))); // NOI18N
        jButton1.setText("Alterar Senha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/exit.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNome))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(48, 48, 48)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jPasswordFieldSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jPasswordFieldNovaSenha)))
                        .addComponent(jLabel5)
                        .addComponent(jPasswordFieldRepetirNovaSenha)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldRepetirNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(365, 335));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!jTextFieldMatricula.getText().isEmpty() || jPasswordFieldNovaSenha.getText().isEmpty() || jPasswordFieldRepetirNovaSenha.getText().isEmpty() || jPasswordFieldSenhaAntiga.getText().isEmpty()){
            alteraSenha();
        }else{
            JOptionPane.showMessageDialog(null,"Preencha os Campos Vazios!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    
    private void setIconeForme() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }
    public void alteraSenha(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where cod_usuario = '"+jTextFieldMatricula.getText()+"'");
        try {
            conecta.rs.first();
            if(cripto.criptografiaBase64Encoder(jPasswordFieldSenhaAntiga.getText()).equals(conecta.rs.getString("senha_usuario"))){
                if(jPasswordFieldNovaSenha.getText().equals(jPasswordFieldRepetirNovaSenha.getText())){
                    try {
                    PreparedStatement pst = conecta.conn.prepareStatement("update cad_usuario set senha_usuario = ?  where cod_usuario ='"+jTextFieldMatricula.getText()+"'");
                    pst.setString(1, cripto.criptografiaBase64Encoder(jPasswordFieldNovaSenha.getText()));          
                    pst.execute();
                    limpaCampos();
                JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!");       
                conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Alterar Dados!\n Erro" +ex);
        }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "ERRO - Os Campos Nova Senha e Confirmar Nova Senha não Conferem!");
                    jPasswordFieldNovaSenha.setText("");
                    jPasswordFieldRepetirNovaSenha.setText("");
                    jPasswordFieldNovaSenha.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "ERRO - Senha Antiga Incorreta!");
                jPasswordFieldSenhaAntiga.setText("");
                jPasswordFieldSenhaAntiga.requestFocus();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ERRO - Ao Alterar Senha!");
        }
    }
    
    public void limpaCampos(){
        JTextField[] jt = {jTextFieldBusca,jTextFieldMatricula,jTextFieldNome};
        JPasswordField[] jp = {jPasswordFieldNovaSenha,jPasswordFieldRepetirNovaSenha,jPasswordFieldSenhaAntiga};
        
        for(int i = 0; i < 3; i++){
            jt[i].setText("");
            jp[i].setText("");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TalteraSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldNovaSenha;
    private javax.swing.JPasswordField jPasswordFieldRepetirNovaSenha;
    private javax.swing.JPasswordField jPasswordFieldSenhaAntiga;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
