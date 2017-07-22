package labsystem;

import br.com.labsystem.bean.ConectaBanco;
import br.com.labsystem.view.TconfigInicialSistema;
import br.com.labsystem.view.Tlogin;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CIDRONIO
 */
public class LabSystem {
    ConectaBanco conecta = new ConectaBanco();
    public static void main(String[] args) {
        LabSystem ls = new LabSystem();
        ls.habilita();
    
    }
    
    public void habilita() { //Habilita botão q chama cadastro de usuario
        conecta.conexao();
        conecta.executaSQL("select * from configuracao");
        try {
            conecta.rs.first();
            boolean c = conecta.rs.first();
            if (!c) {//verifica se o meu resultset esta vazio
                new TconfigInicialSistema(1).setVisible(true);
            } else {
                Tlogin.main(null);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro: "+ ex);
        } 
        conecta.desconecta();
    }
    
}
