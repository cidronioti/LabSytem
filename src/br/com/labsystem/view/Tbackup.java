
package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.ControleDropbox;
import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxClient;
import com.dropbox.core.DbxEntry;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuthNoRedirect;
import com.dropbox.core.DbxWriteMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author CIDRONIO
 */
public class Tbackup extends javax.swing.JFrame {
    ControleDropbox cd = new ControleDropbox();
    ConectaBanco conecta = new ConectaBanco();
    JFileChooser RealizarBackupMySQL = new JFileChooser();
    String arquivo;
    private String APP_KEY = "";
    private String APP_SECRET = "";

    public Tbackup() {
        initComponents();
        jTextField1.setText("C:\\LabSystem\\Backup\\" + dataBackup() + ".sql");
        APP_KEY = cd.retornaAppKey();
        APP_SECRET = cd.retornaAppSecret();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione um Diretório", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 102, 102))); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField1.setText("C:\\LabSystem\\Backup");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Atenção! Se você não selecionar um diretório seu backup será salvo no diretório raíz do sistema.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBox1.setText("Enviar Cópia de Segurança para o Dropbox");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("Backup");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(617, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int resp;
        resp = RealizarBackupMySQL.showSaveDialog(this);//JFileChooser de nome RealizarBackupMySQL

        if (resp == JFileChooser.APPROVE_OPTION) {//Se o usuario presionar salvar; genera o Backup
            arquivo = String.valueOf(RealizarBackupMySQL.getSelectedFile().toString())
                    + "_" + dataBackup() + ".sql";
            jTextField1.setText(arquivo);
        } else if (resp == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Geração do Backup Cancelada!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!jCheckBox1.isSelected()) {

            geraBackup(jTextField1.getText());
        } else {
            //jLabelImgCarregando.setVisible(true);
            jTextArea1.append("Carregando...\n");
            geraBackup(jTextField1.getText());
            try {
                dropBoxUpload(jTextField1.getText());
            } catch (IOException ex) {
                Logger.getLogger(Tbackup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DbxException ex) {
                Logger.getLogger(Tbackup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void geraBackup(String arquivo) {
        System.out.println("nome arquivo: " + arquivo);
        //jLabelImgCarregando.setVisible(true);
        try {

            Runtime runtime = Runtime.getRuntime();
            File backupFile = new File(arquivo);
            FileWriter fw = new FileWriter(backupFile);
            Process child = runtime.exec("C:\\xampp\\mysql\\bin\\mysqldump --opt --user=root "
                    + "--databases labsys -R");
            InputStreamReader irs = new InputStreamReader(child.getInputStream());
            BufferedReader br = new BufferedReader(irs);

            String line;
            while ((line = br.readLine()) != null) {
                fw.write(line + "\n");
            }
            fw.close();
            irs.close();
            br.close();
            JOptionPane.showMessageDialog(rootPane, "Backup realizado com Sucesso!\n" + "Local : " + arquivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO ao Realizar o Backup:" + e.getMessage(), "LabSys 1.0", JOptionPane.ERROR_MESSAGE);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tbackup.class.getName()).log(Level.SEVERE, null, ex);
        }
        //jLabelImgCarregando.setVisible(false);
        //JOptionPane.showMessageDialog(null, "Arquivo Gerado","LabSys 1.0",JOptionPane.INFORMATION_MESSAGE);    
    }

    public void dropBoxUpload(String arqui) throws FileNotFoundException, IOException, DbxException {

        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
        //LabSys é o nome da pasta do aplicativo no drop box
        DbxRequestConfig config = new DbxRequestConfig("LabSys",
                Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);

        try {
            //verifica a conexão com a internet tentando acessar o site do google.
            java.net.URL verificaConn = new java.net.URL("http://www.google.com.br");
            java.net.URLConnection conn = verificaConn.openConnection();
            java.net.HttpURLConnection httpConn = (java.net.HttpURLConnection) conn;
            httpConn.connect();
            int result = httpConn.getResponseCode();
            
            if (result == 200) {
                
                // Faça com que o usuário faça login e autorize seu aplicativo.
                String authorizeUrl = webAuth.start();
                jTextArea1.append("1. Go to: " + authorizeUrl + "\n");
                jTextArea1.append("2. Click \"Allow\" (you might have to log in first)" + "\n");
                jTextArea1.append("3. Copy the authorization code." + "\n");
        //System.out.println("1. Go to: " + authorizeUrl);
                //System.out.println("2. Click \"Allow\" (you might have to log in first)");
                //System.out.println("3. Copy the authorization code.");
                //String code = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

                // Isso falhará se o usuário inserir um código de autorização inválido.
                String c = cd.retornaToken();
        //DbxAuthFinish authFinish = webAuth.finish(code);
                //String accessToken = authFinish.accessToken;

                DbxClient client = new DbxClient(config, c);

                jTextArea1.append("Conta vinculada: " + client.getAccountInfo().displayName + "\n");
        //System.out.println("Linked account: " + client.getAccountInfo().displayName);

                File inputFile = new File(arqui);//caminho e nome do arquivo a ser upado
                FileInputStream inputStream = new FileInputStream(inputFile);
                try {
                    DbxEntry.File uploadedFile = client.uploadFile("/" + dataBackup() + ".sql",//nome que arquivo ficará no drop box
                            DbxWriteMode.add(), inputFile.length(), inputStream);

            //uploadedFile.isFile()
                    jTextArea1.append("Uploaded: " + uploadedFile.toString() + "\n");
                    persisteNameBackup(dataBackup() + ".sql");
                    //System.out.println("Uploaded: " + uploadedFile.toString());
                    JOptionPane.showMessageDialog(rootPane, "Backup realizado com Sucesso no DropBox!");
                } finally {
                    //JOptionPane.showMessageDialog(rootPane, "Erro ao realizado backup no DropBox!");
                    inputStream.close();

                }

                DbxEntry.WithChildren listing = client.getMetadataWithChildren("/");
                jTextArea1.append("Arquivos existentes no DropBox:" + "\n");
                //System.out.println("Files in the root path:");
                for (DbxEntry child : listing.children) {
                    jTextArea1.append("	" + child.name + ": " + child.toString() + "\n");
                    //System.out.println("	" + child.name + ": " + child.toString());
                }
                /*
                 }else{
                 JOptionPane.showMessageDialog(rootPane, "Erro ao realizado backup no DropBox!");
                 }*/
                //   System.out.println("Conectado");
            }
        } catch (java.net.MalformedURLException url) {
            JOptionPane.showMessageDialog(rootPane, "Verifique sua conexão com a Internet!\nE tente novamente...");
        } catch (java.io.IOException ioex) {
            JOptionPane.showMessageDialog(rootPane, "Verifique sua conexão com a Internet!\nE tente novamente...");
        }

    }

    public String dataBackup() {
        Calendar c = Calendar.getInstance();
        String fecha = String.valueOf(c.get(Calendar.DATE));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.MONTH));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.YEAR));
        return fecha;
    }

    public void persisteNameBackup(String nomeBk) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into cad_backup(nome_backup)values(?)");
            pst.setString(1, nomeBk);
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO - " + ex);
            //Logger.getLogger(ControleUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tbackup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
