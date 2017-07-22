
package br.com.labsystem.bean;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author CIDRONIO
 */
public class TrataCampoSoLetrasMaiusculasCodTam7 extends PlainDocument{
    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        int tamanho = (this.getLength() + string.length());//pegando o tamanho da String do texTfield
        if(tamanho < 11){//impedindo que seja digitado mais q 3 caracteres 
                super.insertString(i, string.toUpperCase(), as);//EXIBE NO TEXTFIELD SO LETRAS MAIUSCULAS
            }
            
            else{
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
