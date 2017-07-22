
package br.com.labsystem.bean;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CIDRONIO
 */
public class ControleUsuarioTest {
   

    /**
     * Test of salvar method, of class ControleUsuario.
     */
    @Test
    public void testSalvar() {//repondeu como esperado
        System.out.println("salvar");
        ModeloUsuario modelo = new ModeloUsuario();
        ControleUsuario instance = new ControleUsuario();
        modelo.setMatricula("1323123");
        boolean expResult = false;
        //boolean result = instance.salvar(modelo);
        assertEquals(true, instance.salvar(modelo));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of excluirUsuario method, of class ControleUsuario.
     */
    @Test
    public void testExcluirUsuario() {//repondeu como esperado
        System.out.println("excluirUsuario");
        String mat = "";
        ControleUsuario instance = new ControleUsuario();
        boolean expResult = false;
        boolean result = instance.excluirUsuario(mat);
        assertEquals(true, instance.excluirUsuario("1323123"));
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of validaData method, of class ControleUsuario.
     */
    @Test
    public void testValidaData() {
        System.out.println("validaData");
        String data = "";
        ControleUsuario instance = new ControleUsuario();
        boolean expResult = false;
        //boolean result = instance.validaData(data);
        assertEquals(true, instance.validaData("14/11/1989"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
