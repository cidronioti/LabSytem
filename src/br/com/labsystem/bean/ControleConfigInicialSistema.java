

package br.com.labsystem.bean;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CIDRONIO
 */
public class ControleConfigInicialSistema {
    ConectaBanco conecta = new ConectaBanco();
    //ModeloUsuario modelo = new ModeloUsuario();
    public void salvar(ModeloConfigInicialSistema modelo){
        conecta.conexao();
        try {                    
            PreparedStatement pst = conecta.conn.prepareStatement("insert into configuracao(porta_com,boud_rate,app_key,app_secret,token)values(?,?,?,?,?)");
            pst.setString(1, modelo.getPortCom());
            pst.setString(2, modelo.getBoudRate());
            pst.setString(3, modelo.getAppKey());
            pst.setString(4, modelo.getAppSecret());
            pst.setString(5, modelo.getToken());           
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO - "+ex);
            //Logger.getLogger(ControleUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
    }
}
