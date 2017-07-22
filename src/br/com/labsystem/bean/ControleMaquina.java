
package br.com.labsystem.bean;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CIDRONIO
 */
public class ControleMaquina {
    ConectaBanco conecta = new ConectaBanco();
    public void salvar(ModeloMaquina modelo){
        conecta.conexao();
        try {                    
            PreparedStatement pst = conecta.conn.prepareStatement("insert into cad_maquina(cod_maquina,marca_maquina,modelo_maquina,num_ident_maquina,so_maquina,processador_maquina,hd_maquina,memoria_ram_maquina,meomoria_dedicada,monitor_maquina,status_funcionamento,status_uso,obs)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, modelo.getCodigo());
            pst.setString(2, modelo.getMarca());
            pst.setString(3, modelo.getModelo());
            pst.setInt(4, modelo.getNum_identfic());
            pst.setString(5, modelo.getSo());
            pst.setString(6, modelo.getProcessador());
            pst.setString(7, modelo.getHd());
            pst.setString(8, modelo.getMemoriaRam());
            pst.setString(9, modelo.getMemoriaDedicada());
            pst.setString(10, modelo.getMonitor());
            pst.setString(11, modelo.getStatusFuncionamento());
            pst.setString(12, modelo.getStatusUso());
            pst.setString(13, modelo.getObs());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO - "+ex);
        }
        conecta.desconecta();
    }
    
    public void excluirDados(String cod){
         Statement st = null;   
        try {
            conecta.conexao();
            st = conecta.conn.createStatement();
            st.executeUpdate("delete from controle_acesso where cod_maquina='"+cod+"'");
            conecta.desconecta();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Excluido com sucesso"+ex);
        }
        try {
            conecta.conexao();
            st = conecta.conn.createStatement();
            st.executeUpdate("delete from cad_maquina where cod_maquina='"+cod+"'");
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Excluido com sucesso"+ex);
        }
    }
}
