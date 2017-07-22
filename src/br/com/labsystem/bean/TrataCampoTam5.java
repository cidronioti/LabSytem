
package br.com.labsystem.bean;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author CIDRONIO
 */
public class TrataCampoTam5 extends PlainDocument{
    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        int tamanho = (this.getLength() + string.length());
        if(tamanho < 6){
            super.insertString(i, string.toUpperCase(), as); //To change body of generated methods, choose Tools | Templates.
            //super.insertString(i, string, as);
        }
    }
}
