package br.com.labsystem.bean;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CIDRONIO
 */
public class ControleEquipamentos {
    ConectaBanco conecta = new ConectaBanco();
    public void salvar(ModeloEquipamentos modelo){
        conecta.conexao();
        try {                    
            PreparedStatement pst = conecta.conn.prepareStatement("insert into cad_lista_equipamentos(data,monitores,gabinetes,mouses,teclados,nobreaks,carteiras,adaptadores,cabos_rede,cabos_vga,estabilizadores)values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, modelo.getData());
            pst.setInt(2, modelo.getMonitores());
            pst.setInt(3, modelo.getGabinetes());
            pst.setInt(4, modelo.getMouses());
            pst.setInt(5, modelo.getTeclados());
            pst.setInt(6, modelo.getNobreaks());
            pst.setInt(7, modelo.getCarteiras());
            pst.setInt(8, modelo.getAdaptadores());
            pst.setInt(9, modelo.getCaboRede());
            pst.setInt(10, modelo.getCaboVga());
            pst.setInt(11, modelo.getEstabilizadores());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO - "+ex);
        }
        conecta.desconecta();
    }
}
