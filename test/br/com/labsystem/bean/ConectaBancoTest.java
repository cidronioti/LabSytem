
package br.com.labsystem.bean;

import org.junit.Test;

/**
 *
 * @author CIDRONIO
 */
public class ConectaBancoTest {
    
    

    /**
     * Test of conexao method, of class ConectaBanco.
     */
    @Test
    public void testConexao() {//comportamento esperado
        System.out.println("conexao");
        ConectaBanco instance = new ConectaBanco();
        instance.conexao();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of conexaoRetorno method, of class ConectaBanco.
     */
    /*@Test
    public void testConexaoRetorno() throws Exception{
        System.out.println("conexaoRetorno");
        ConectaBanco instance = new ConectaBanco();
        System.setProperty("jdbc.Drivers", "org.mysql.Drive");
        Connection expResult = DriverManager.getConnection("jdbc:mysql://localhost:3306/labsys", "root", "14111989");
        Connection result = instance.conexaoRetorno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of executaSQL method, of class ConectaBanco.
     */
    @Test
    public void testExecutaSQL() {//comportamento esperado
        System.out.println("executaSQL");
        ConectaBanco instance = new ConectaBanco();
        instance.conexao();
        String sql = "SELECT * FROM cad_usuario";
        instance.executaSQL(sql);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of desconecta method, of class ConectaBanco.
     */
    @Test
    public void testDesconecta() {//comportamento esperado
        System.out.println("desconecta");
        ConectaBanco instance = new ConectaBanco();
        instance.conexao();
        instance.desconecta();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
