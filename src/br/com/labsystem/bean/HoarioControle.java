package br.com.labsystem.bean;

import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class HoarioControle {
    ConectaBanco conecta = new ConectaBanco();
    
    public void salvarH(HorarioModelo modelo){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into cad_horario(hora_inicio, hora_fim, n_seg, n_ter, n_qua, n_qui, n_sex, n_sab)values(?,?,?,?,?,?,?,?)");
            pst.setString(1, modelo.getHoraInicio());
            pst.setString(2, modelo.getHoraFim());
            pst.setString(3, modelo.getSeg());
            pst.setString(4, modelo.getTer());
            pst.setString(5, modelo.getQua());
            pst.setString(6, modelo.getQui());
            pst.setString(7, modelo.getSex());
            pst.setString(8, modelo.getSab());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Horário Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO - "+ex);
        }
        conecta.desconecta();
    }
   
    public void excluirHorario(String horaInicio){
         Statement st = null;   
        try {
            conecta.conexao();
            st = conecta.conn.createStatement();
            st.executeUpdate("delete from cad_horario where hora_inicio = '"+horaInicio+"'");
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir - "+ex);
        }
    }
    
    public boolean validaHora(String hora){///ta com problema quando a hora inicio é invalida entra em uma especie de loop infinito        
            System.out.println("ENTROU NO ELSE");
            String[] h = new String[3];        
            h = hora.split(":");
            
            if (Integer.parseInt(h[0]) < 1 || Integer.parseInt(h[0]) > 24) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Hora inválida!");
                return false;
            } else if (Integer.parseInt(h[1]) < 0 || Integer.parseInt(h[1]) > 59) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Minuto Inválido!");
                return false;
            } else if (Integer.parseInt(h[2]) < 0 || Integer.parseInt(h[2]) > 59) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Segundo Inválido!");
                return false;
            } else {
                return true;
            }
        } 
}
