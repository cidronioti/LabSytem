
package br.com.labsystem.bean;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author CIDRONIO
 */
public class ConectaBanco {

    public Statement stm;
    public ResultSet rs;
    private final String driver = "org.mysql.Drive";
    private String caminho = "jdbc:mysql://localhost:3306/labsys";
    private String usuario = "root";
    private String senha = "";
    public Connection conn;

    public void conexao() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!\n Erro:" + ex.getMessage());
        }
    }  
    public Connection conexaoRetorno() {/// usar para relatórios

        try {
            System.setProperty("jdbc.Drivers", driver); // drive de conexão do netbeans 
            conn = DriverManager.getConnection(caminho, usuario, senha); //responsavel por realizar a conexão
            // JOptionPane.showMessageDialog(null,"Conectado com sucesso");
            return conn;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Errode conexão\n Erro" + ex.getMessage());
        }
        return conn;
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro de ExecultaSQL!\n Erro:" + ex.getMessage());
        }
    }
            
    public void desconecta(){
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "deconectado com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao fexar conexao!\n Erro:" + ex.getMessage());
        }
    }

    /*public void conexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
