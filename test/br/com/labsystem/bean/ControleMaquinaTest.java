/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.labsystem.bean;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pause
 */
public class ControleMaquinaTest {
    
   

    /**
     * Test of salvar method, of class ControleMaquina.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        ModeloMaquina modelo = new ModeloMaquina();
        modelo.setCodigo("4567");
        ControleMaquina instance = new ControleMaquina();
        instance.salvar(modelo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of excluirDados method, of class ControleMaquina.
     */
    @Test
    public void testExcluirDados() {
        System.out.println("excluirDados");
        String cod = "4567";
        ControleMaquina instance = new ControleMaquina();
        instance.excluirDados(cod);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
