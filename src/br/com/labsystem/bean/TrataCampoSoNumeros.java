package br.com.labsystem.bean;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author CIDRONIO
 */
public class TrataCampoSoNumeros extends PlainDocument{//permite que seja digitados apenas numeros nos campos

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        super.insertString(i, string.replaceAll("[aA-zZ]", ""), as); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
