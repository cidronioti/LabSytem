package br.com.labsystem.view;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.bean.ControleEquipamentos;
import br.com.labsystem.bean.ModeloEquipamentos;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author CIDRONIO
 */
public class TlistaEquipamentos extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    ControleEquipamentos controle = new ControleEquipamentos();
    ModeloEquipamentos modelo = new ModeloEquipamentos();
    public TlistaEquipamentos(String data) {
        initComponents();
        setIconeForme();
        buscaLista();
        try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##/##/####");
            jFormattedTextFieldData.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }
        jFormattedTextFieldData.setText(data);
    }

    public TlistaEquipamentos() {
        initComponents();
        
        try {// Mascara PARA O CAMPO DATA DO FORMULARIO
            MaskFormatter form = new MaskFormatter("##/##/####");
            jFormattedTextFieldData.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro:"+ ex);
        }
    }
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerNobreaks = new javax.swing.JSpinner();
        jSpinnerCabosVga = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerMonitores = new javax.swing.JSpinner();
        jSpinnerGabinetes = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerAdaptadores = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerEstabilizadores = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerCarteiras = new javax.swing.JSpinner();
        jSpinnerTeclados = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerMouses = new javax.swing.JSpinner();
        jSpinnerCabosRede = new javax.swing.JSpinner();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LabSys 1.0 - Lista de Equipamentos");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Teclados");

        jLabel9.setText("Cabos VGA");

        jLabel3.setText("Mouses");

        jLabel5.setText("Nobreaks");

        jLabel2.setText("Gabinetes");

        jLabel10.setText("Estabilizadores");

        jLabel1.setText("Monitores");

        jLabel7.setText("Adaptadores");

        jLabel6.setText("Carteiras");

        jLabel8.setText("Cabos de Rede");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSpinnerMonitores)
                                .addComponent(jSpinnerCarteiras)
                                .addComponent(jSpinnerNobreaks)
                                .addComponent(jSpinnerTeclados)
                                .addComponent(jSpinnerMouses)
                                .addComponent(jSpinnerAdaptadores)
                                .addComponent(jSpinnerCabosRede)
                                .addComponent(jSpinnerCabosVga)
                                .addComponent(jSpinnerEstabilizadores, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSpinnerGabinetes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinnerMonitores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerGabinetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinnerMouses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerTeclados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jSpinnerNobreaks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jSpinnerCarteiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jSpinnerAdaptadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinnerCabosRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jSpinnerCabosVga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jSpinnerEstabilizadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/labsystem/icons/exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel11.setText("Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSair))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonSair))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(311, 452));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    public void salvar(){
        try{
            modelo.setData(jFormattedTextFieldData.getText());
            modelo.setMonitores((int)jSpinnerMonitores.getValue());
            modelo.setGabinetes((int) jSpinnerGabinetes.getValue());
            modelo.setMouses((int)jSpinnerMouses.getValue());
            modelo.setTeclados((int)jSpinnerTeclados.getValue());
            modelo.setNobreaks((int)jSpinnerNobreaks.getValue());
            modelo.setCarteiras((int)jSpinnerCarteiras.getValue());
            modelo.setAdaptadores((int)jSpinnerAdaptadores.getValue());
            modelo.setCaboRede((int)jSpinnerCabosRede.getValue());
            modelo.setCaboVga((int)jSpinnerCabosVga.getValue());
            modelo.setEstabilizadores((int)jSpinnerEstabilizadores.getValue());
            controle.salvar(modelo);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"ERRO - "+ ex);
        }
    }
    
     public  void alterar(){
       conecta.conexao();
        try {
            // TODO add your handling code here:
            PreparedStatement pst = conecta.conn.prepareStatement("update cad_lista_equipamentos set data = ?, monitores = ?, gabinetes = ?, mouses = ?, teclados = ?, nobreaks = ?, carteiras = ?, adaptadores = ?, cabos_rede = ?, cabos_vga = ?, estabilizadores = ?");
            pst.setString(1, jFormattedTextFieldData.getText());
            pst.setInt(2, (int)jSpinnerMonitores.getValue());
            pst.setInt(3, (int)jSpinnerGabinetes.getValue());
            pst.setInt(4, (int)jSpinnerMouses.getValue());
            pst.setInt(5, (int)jSpinnerTeclados.getValue());
            pst.setInt(6, (int)jSpinnerNobreaks.getValue());
            pst.setInt(7, (int)jSpinnerCarteiras.getValue());
            pst.setInt(8, (int)jSpinnerAdaptadores.getValue());
            pst.setInt(9, (int)jSpinnerCabosRede.getValue());
            pst.setInt(10, (int)jSpinnerCabosVga.getValue());
            pst.setInt(11, (int)jSpinnerEstabilizadores.getValue());           
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!"); 
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Alterar Dados!\n Erro" +ex);
        }
        
    }
    
    public void buscaLista(){
        conecta.conexao();
        conecta.executaSQL("select *from cad_lista_equipamentos");
        try {
            conecta.rs.last();
            jFormattedTextFieldData.setText(conecta.rs.getString("data"));
            jSpinnerMonitores.setValue(conecta.rs.getInt("monitores"));
            jSpinnerGabinetes.setValue(conecta.rs.getInt("gabinetes"));
            jSpinnerMouses.setValue(conecta.rs.getInt("mouses"));
            jSpinnerTeclados.setValue(conecta.rs.getInt("teclados"));
            jSpinnerNobreaks.setValue(conecta.rs.getInt("nobreaks"));
            jSpinnerCarteiras.setValue(conecta.rs.getInt("carteiras"));
            jSpinnerAdaptadores.setValue(conecta.rs.getInt("adaptadores"));
            jSpinnerCabosRede.setValue(conecta.rs.getInt("cabos_rede"));
            jSpinnerCabosVga.setValue(conecta.rs.getInt("cabos_vga"));
            jSpinnerEstabilizadores.setValue(conecta.rs.getInt("estabilizadores"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO - erro ao buscar dados"+ ex);
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
                new TlistaEquipamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinnerAdaptadores;
    private javax.swing.JSpinner jSpinnerCabosRede;
    private javax.swing.JSpinner jSpinnerCabosVga;
    private javax.swing.JSpinner jSpinnerCarteiras;
    private javax.swing.JSpinner jSpinnerEstabilizadores;
    private javax.swing.JSpinner jSpinnerGabinetes;
    private javax.swing.JSpinner jSpinnerMonitores;
    private javax.swing.JSpinner jSpinnerMouses;
    private javax.swing.JSpinner jSpinnerNobreaks;
    private javax.swing.JSpinner jSpinnerTeclados;
    // End of variables declaration//GEN-END:variables
}
