
package br.com.labsystem.bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

/**
 *
 * @author CIDRONIO
 */
public class AtualizaHora{
    public static void start (final JLabel labelHora){       
        Thread atualizaHora = new Thread(new Runnable() {

            @Override
            public void run(){ 
                    try{
                        while (true){
                            Date date = new Date();
                            StringBuffer data = new StringBuffer();
                            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                            labelHora.setText(data.toString() + sdf.format(date));
                            Thread.sleep(1000);
                            labelHora.revalidate();
                        }
                    }catch(InterruptedException ex){
                        ex.printStackTrace();
                    }
            }
        });
        atualizaHora.start();
    }
    
    
    public static void start2 (final JFormattedTextField labelHora){
        Thread atualizaHora = new Thread(new Runnable() {

            @Override
            public void run(){ 
                    try{
                        while (true){
                            Date date = new Date();
                            StringBuffer data = new StringBuffer();
                            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                            labelHora.setText(data.toString() + sdf.format(date));
                            Thread.sleep(1000);
                            labelHora.revalidate();
                        }
                    }catch(InterruptedException ex){
                        ex.printStackTrace();
                    }
            }
        });
        atualizaHora.start();
    }
}
