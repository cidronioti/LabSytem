
package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.ControleUsuario;
import br.com.labsystem.bean.ManipularImagem;
import br.com.labsystem.bean.TrataCampoSoLetrasMaiusculas;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Manoel
 */
public class TalteraPeloUsuario extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    ControleUsuario Controle = new ControleUsuario();
    
     BufferedImage imagem;
     
    public TalteraPeloUsuario(String matri) {
        String n = matri;
        initComponents();
        preencherFormePeloUsuario(n);
        setIconeForme();
        mascaras();
        soLetrasMaiusculas();
        jTextFieldFoto.setVisible(false);
    }

    public TalteraPeloUsuario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldCurso = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldDataNasc = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelfoto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPeriodoIngresso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jTextFieldFoto = new javax.swing.JTextField();
        jButtonAlterar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSys 1.0 - Atualizar Dados");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usuário"));

        jTextFieldCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setEnabled(false);

        jLabel2.setText("Nome");

        jLabel3.setText("Data Nascimento");

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

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/atualizar_1.png"))); // NOI18N
        jButtonAlterar.setText("Atualizar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPeriodoIngresso)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldDataNasc))
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(177, 177, 177))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSair))
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30))
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1))
                    .addComponent(jLabelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldPeriodoIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButtonSair)
                            .addComponent(jTextFieldFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(547, 290));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldDataNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataNascFocusLost
        if(Controle.validaData(jFormattedTextFieldDataNasc.getText())){

        }else{
            //Controle.validaData();
            jFormattedTextFieldDataNasc.setText("");
            //jFormattedTextFieldDataNasc.requestFocus();
        }

    }//GEN-LAST:event_jFormattedTextFieldDataNascFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FotoVi();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       if(!jTextFieldCodigo.getText().equals("")){
           alterarPeloUsuario();
       }else{
            JOptionPane.showMessageDialog(rootPane, "Hácampos vazios!");
       }
    }//GEN-LAST:event_jButtonAlterarActionPerformed
    public  void alterarPeloUsuario(){
       conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_usuario set nome_usuario = ?, data_nasc_usuario = ?, curso_usuario = ?, periodo_ingresso = ?, login_usuario = ?, foto_usuario = ? where cod_usuario = ?");
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jFormattedTextFieldDataNasc.getText());
            pst.setString(3, jTextFieldCurso.getText());
            pst.setString(4, jTextFieldPeriodoIngresso.getText());
            pst.setString(5, jTextFieldLogin.getText());
            pst.setString(6, jTextFieldFoto.getText());
            pst.setString(7, jTextFieldCodigo.getText());
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!");
             
            conecta.desconecta();
            dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Alterar Dados!\n Erro" +ex);
        }
        
    }
    
    public  void preencherFormePeloUsuario(String matri){
        conecta.conexao();
        conecta.executaSQL("select *from cad_usuario where cod_usuario = '"+matri+"'");
        try {
            conecta.rs.first();
            jTextFieldCodigo.setText(conecta.rs.getString("cod_usuario"));
            jTextFieldNome.setText(conecta.rs.getString("nome_usuario"));
            jFormattedTextFieldDataNasc.setText(conecta.rs.getString("data_nasc_usuario"));
            jTextFieldCurso.setText(conecta.rs.getString("curso_usuario"));
            jTextFieldLogin.setText(conecta.rs.getString("login_usuario"));
            jTextFieldPeriodoIngresso.setText(conecta.rs.getString("periodo_ingresso"));
            ManipularImagem.exibiImagemLabel(conecta.rs.getBytes("foto_usuario"), jLabelfoto);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Matricula de Usuário não Encontrado!"+ ex);
        }
        conecta.desconecta();
     }
    
    private void setIconeForme() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/labsystem/icons/icon_prin.png")));
    }
    
    public void FotoVi(){ //metodo insere imagem no labelfoto do cadastro de usuarios     
        
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
//        javax.swing.JFileChooser seletor = 
//	new javax.swing.JFileChooser();      
//        int acao = seletor.showOpenDialog(this);     
//        java.io.File f = seletor.getSelectedFile();
//       
//        caminho = f.getPath();
//        jTextFieldFoto.setText(caminho);
//    
//        javax.swing.ImageIcon i = 
//	new javax.swing.ImageIcon(caminho);
//     
//        Image imag = i.getImage().getScaledInstance(jLabelfoto.getWidth(), jLabelfoto.getHeight(), Image.SCALE_SMOOTH);
//        jLabelfoto.setIcon(new ImageIcon(imag));//Labefoto recebendo imagem ajustada ao seu tamanho
    }
    
    public  void mascaras(){
        try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##/##/####");
            jFormattedTextFieldDataNasc.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }        
    }
    
    public  void soLetrasMaiusculas(){       
        jTextFieldNome.setDocument(new TrataCampoSoLetrasMaiusculas());
        jTextFieldLogin.setDocument(new TrataCampoSoLetrasMaiusculas());
        jTextFieldCurso.setDocument(new TrataCampoSoLetrasMaiusculas());       
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TalteraPeloUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelfoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldFoto;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeriodoIngresso;
    // End of variables declaration//GEN-END:variables
}
