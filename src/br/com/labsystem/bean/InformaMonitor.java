package br.com.labsystem.bean;

import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author Aluno
 */
public class InformaMonitor {
    static ConectaBanco concta = new ConectaBanco();
    
    public void diaSemana(){
        Calendar c = Calendar.getInstance(); 
        //System.out.println("Data/Hora atual: "+c.getTime()); 
        String data = String.valueOf(c.getTime());
        String diaSemana[] = new String[3]; 
        diaSemana = data.split(" ");
        //System.out.println("diaS = "+semana[0]);
        
        
        
    }
    
     public static String start (final JLabel labelHora){
         concta.conexao();
         concta.executaSQL("select *from cad_horario");
         
        Thread atualizaHora = new Thread(new Runnable() {
            
            @Override
            public void run(){ 
                    try{
                        concta.rs.first();
                        while (true){// sabado = saturday, monday = segunda, terça = Tuesday, quarta = Wednesday, quinta = Thursday, sexta = Friday
                            Calendar c = Calendar.getInstance(); 
                            //System.out.println("Data/Hora atual: "+c.getTime()); 
                            String data = String.valueOf(c.getTime());
                            String diaSemana[] = new String[3]; 
                            diaSemana = data.split(" ");
                            String monitor;
                            
                            if(diaSemana[0] == "Mon" && diaSemana[3] == "08:00:00"){//segunda
                                //if(concta.rs.getString("hora_inicio");
                            }else if(diaSemana[0] == "Tue"){//terça
                                
                            }else if(diaSemana[0] == "Wed"){//quarta
                            
                            }else if(diaSemana[0] == "Thu"){
                            
                            }else if(diaSemana[0] == "Fri"){
                            
                            }else if(diaSemana[0] == "Sat"){
                            
                            }else{
                                //não faz nada
                            }
                            Thread.sleep(1000);
                            System.out.println("diaS = "+diaSemana[0]);
                            System.out.println("hora : "+diaSemana[3]);
                        }
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
            }
        });
        atualizaHora.start();
        return null;
    }
    public static void main(String[] args) {
        start(null);
    }
}
