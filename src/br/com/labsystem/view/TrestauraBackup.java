

package br.com.labsystem.view;

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
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author CIDRONIO
 */
public class TrestauraBackup extends javax.swing.JFrame {
    ControleDropbox cd = new ControleDropbox();
     String APP_KEY = "";
     String APP_SECRET = "";
    JFileChooser RealizarBackupMySQL=new JFileChooser();
    public TrestauraBackup() {
        initComponents();
        jTextField1.setText("C:\\LabSystem\\Backup\\"+dataBackup()+".sql");
        APP_KEY = cd.retornaAppKey();
        APP_SECRET = cd.retornaAppSecret();
        /*try {
            //listFilesDropBox();
        } catch (IOException ex) {
            Logger.getLogger(TrestauraBackup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DbxException ex) {
            Logger.getLogger(TrestauraBackup.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    } 
    
    public void listFilesDropBox()  throws FileNotFoundException, IOException, DbxException{
        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
        //LabSys é o nome da pasta do aplicativo no drop box
        //try{
        DbxRequestConfig config = new DbxRequestConfig("LabSys",
            Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
        // Faça com que o usuário faça login e autorize seu aplicativo.
        String authorizeUrl = webAuth.start();
        String c = cd.retornaToken();        
        DbxClient client = new DbxClient(config, c);    
        DbxEntry.WithChildren listing = client.getMetadataWithChildren("/");
        System.out.println("Files in the root path:");
        for (DbxEntry child : listing.children) {
            //System.out.println("	" + child.name + ": " + child.toString());
            jComboBox1.addItem(child.name);
        }
        //}
    }
    
    public void downloadDropbox()  throws FileNotFoundException, IOException, DbxException{
        FileOutputStream outputStream = null;        
        
        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
        //LabSys é o nome da pasta do aplicativo no drop box
        DbxRequestConfig config = new DbxRequestConfig("LabSys",
            Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
        String c = cd.retornaToken();
                
        DbxClient client = new DbxClient(config, c);
        try {
            outputStream = new FileOutputStream(jTextField1.getText()+dataBackup()+".sql");
            DbxEntry.File downloadedFile = client.getFile("/"+(String)jComboBox1.getSelectedItem(), null,//nome do arquivo a ser baixado do dropbox
                outputStream);
           // System.out.println("Metadata: " + downloadedFile.toString());
        } finally {
            outputStream.close();
        }
    }
    
    public String dataBackup(){
        Calendar c=Calendar.getInstance();
        String fecha=String.valueOf(c.get(Calendar.DATE));
        fecha=fecha+"-"+String.valueOf(c.get(Calendar.MONTH));
        fecha=fecha+"-"+String.valueOf(c.get(Calendar.YEAR));  
        return fecha;
    }
    
    void RestaurarBackupMySQL(){
       
        try{
            //Runtime runtime = Runtime.getRuntime();
            File restoreFile = new File(jTextField1.getText());
            System.out.println(restoreFile);
            String dirMysql = "C:\\xampp\\mysql\\bin"; 
            String comandoMysql = "cmd /c mysql -uroot labsys < "+restoreFile+"";  
            Process process = Runtime.getRuntime().exec(comandoMysql, null, new File(dirMysql));  
            process.waitFor();  
            JOptionPane.showMessageDialog(null, "Backup de Arquivo do DropBox Restaurado com Sucesso!","LabSys 1.0",JOptionPane.INFORMATION_MESSAGE);  
        } catch (IOException | InterruptedException ex) {  
           JOptionPane.showMessageDialog(null, "Não foi possivel restaurar o banco de dados"); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione um Diretório", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 102, 102))); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

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
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel1.setText("Atenção! Se você não selecionar um arquivo para restaura o sistemas irá procurar um");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("                 backup no diretório raíz do sistema e irá restaurar.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Restaurar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dropbox", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel3.setText("Escolha o Arquivo a ser Restaurado");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1)
                .addContainerGap())
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Importar Backup do Dropbox");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Importar Backup de um Diretório Local");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(553, 412));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        if(jRadioButton1.isSelected()){
           jComboBox1.setEnabled(true);
           try {
               listFilesDropBox();
           } catch (IOException ex) {
               Logger.getLogger(TrestauraBackup.class.getName()).log(Level.SEVERE, null, ex);
           } catch (DbxException ex) {
               Logger.getLogger(TrestauraBackup.class.getName()).log(Level.SEVERE, null, ex);
           }
       }else{
           jComboBox1.setEnabled(false);
       }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!jRadioButton2.isSelected()){
            try {
                   downloadDropbox();
                   RestaurarBackupMySQL();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane,"ERRO: "+ ex);
                //Logger.getLogger(TrestauraBackup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DbxException ex) {
                JOptionPane.showMessageDialog(rootPane,"ERRO: "+ ex);
                //Logger.getLogger(TrestauraBackup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            restoreDeAquivoLocal();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()){
            jComboBox1.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);       
        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();
            jTextField1.setText(String.valueOf(arquivo));
        } else {
            //JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

   public void restoreDeAquivoLocal(){
       try{
            //Runtime runtime = Runtime.getRuntime();
            File restoreFile = new File(jTextField1.getText());
            System.out.println(restoreFile);
            String dirMysql = "C:\\xampp\\mysql\\bin"; 
            String comandoMysql = "cmd /c mysql -uroot labsys < "+restoreFile+"";  
            Process process = Runtime.getRuntime().exec(comandoMysql, null, new File(dirMysql));  
            process.waitFor();  
            JOptionPane.showMessageDialog(null, "Backup de Arquivo Local Restaurado com Sucesso!","LabSys 1.0",JOptionPane.INFORMATION_MESSAGE);  
        } catch (IOException | InterruptedException ex) {  
           JOptionPane.showMessageDialog(null, "Não foi possivel restaurar o banco de dados"); 
        }
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrestauraBackup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
