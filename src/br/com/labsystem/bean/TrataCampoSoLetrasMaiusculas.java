
package br.com.labsystem.bean;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author CIDRONIO
 */
public class TrataCampoSoLetrasMaiusculas extends PlainDocument{
    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
//        int tamanho = (this.getLength() + string.length());//pegando o tamanho da String do texTfield
//        if(tamanho < 4){//impedindo que seja digitado mais q 3 caracteres 
        super.insertString(i, string.toUpperCase(), as);//EXIBE NO TEXTFIELD SO LETRAS MAIUSCULAS 
//        }else{}
    }
}
