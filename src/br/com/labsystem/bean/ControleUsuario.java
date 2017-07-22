package br.com.labsystem.bean;

import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CIDRONIO
 */
public class ControleUsuario {
    ConectaBanco conecta = new ConectaBanco();
    ModeloUsuario modelo = new ModeloUsuario();
    public boolean salvar(ModeloUsuario modelo){
        conecta.conexao();
        try {                    
            PreparedStatement pst = conecta.conn.prepareStatement("insert into cad_usuario(cod_usuario,nome_usuario,data_nasc_usuario,permissao_usuario,senha_usuario,tag,curso_usuario,foto_usuario,login_usuario,periodo_ingresso)values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, modelo.getMatricula());
            pst.setString(2, modelo.getNome());
            pst.setString(3, modelo.getDatNasc());
            pst.setString(4, modelo.getPermissao());
            pst.setString(5, modelo.getSenha());
            pst.setString(6, modelo.getTag());
            pst.setString(7, modelo.getCurso());
            pst.setBytes(8, modelo.getImagem());
            pst.setString(9, modelo.getLogin());
            pst.setString(10, modelo.getPeriodoIngresso());
            pst.execute();
            conecta.desconecta();
            return true;
            //JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {          
            JOptionPane.showMessageDialog(null,"ERRO - "+ex);
            //Logger.getLogger(ControleUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
        return false;
    }
    
    
    public boolean excluirUsuario(String mat){        
        Statement st = null;   
        try {
            conecta.conexao();
            st = conecta.conn.createStatement();
            st.executeUpdate("delete from controle_acesso where cod_usuario = '"+mat+"'");
            conecta.desconecta();
        
            conecta.conexao();
            st = conecta.conn.createStatement();
            st.executeUpdate("delete from cad_usuario where cod_usuario = '"+mat+"'");
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            conecta.desconecta();
            return true;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Excluir - "+ex);
           return false;
        }    
        
    }
    
    public boolean validaData(String data){
        SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
        Date hoje = new Date();
        String DataSys = df.format(hoje);
        
        if(!data.equals("  /  /    ")){
            int dia,mes,ano;
            int diaSys,mesSys,anoSys;
            String data1 = data.replace("/", "");
            
            anoSys = Integer.parseInt(DataSys) % 10000;
            mesSys = (Integer.parseInt(DataSys) % 1000000) / 10000;
            
            dia = Integer.parseInt(data1) / 1000000; //14111989
            mes = (Integer.parseInt(data1) % 1000000) / 10000;
            ano = Integer.parseInt(data1) % 10000;
            
            if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1900 || ano > anoSys){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Data Inválida");
                return false;
            }
            else if (mes > mesSys && ano == anoSys ){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Data Inválida");
                return false;
            }else
                return true;
            }
        return false;
    }
    
//    public void calculaIdade(String data){
//        if(!data.equals("  /  /    ")){
//            int diaNasc,mesNasc,anoNasc;
//            int diaSis,mesSis,anoSis;
//            int d = 0,m = 0,a = 0;
//            String dataSis = dataSistema.replace("/", "");
//            String dataNasc = data.replace("/", "");
//        
//            diaSis = Integer.parseInt(dataSis) / 1000000;
//            mesSis = (Integer.parseInt(dataSis) % 1000000) / 10000;
//            anoSis = Integer.parseInt(dataSis) % 10000;
//            
//            diaNasc = Integer.parseInt(dataNasc) / 1000000; //14111989
//            mesNasc = (Integer.parseInt(dataNasc) % 1000000) / 10000;
//            anoNasc = Integer.parseInt(dataNasc) % 10000;
//            
//                if (diaSis > diaNasc) {
//                    d = diaSis - diaNasc;
//                } else {                    
//                    d = (diaSis - diaNasc) + 30;
//                    mesSis -= 1;
//                }
//                if (mesSis > mesNasc) {
//                    m = mesSis - mesNasc;
//                } else {
//                    m = (mesSis - mesNasc) + 12;
//                    anoSis -= 1;
//                }
//                if (m == 12) {
//                    m = 0;
//                    anoSis += 1;
//                }
//                if(d == 30){
//                    d = 0;
//                    m +=1;
//                }
//                a = anoSis - anoNasc;;
//                jLabelIdade.setText(String.valueOf(a + "a" + m + " m" + d + " d"));
//            }
//        
//    }
}
