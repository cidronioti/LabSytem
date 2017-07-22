/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.labsystem.view;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pause
 */
public class TentradaUsuarioTest {
    /**
     * Test of BuscarUsuarioPorNome method, of class TentradaUsuario.
     */
    @Test
    public void testBuscarUsuarioPorNome() {
        System.out.println("BuscarUsuarioPorNome");
        TentradaUsuario instance = new TentradaUsuario();
        instance.BuscarUsuarioPorNome();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarUsuarioPorCodigo method, of class TentradaUsuario.
     */
    @Test
    public void testBuscarUsuarioPorCodigo() {
        System.out.println("BuscarUsuarioPorCodigo");
        TentradaUsuario instance = new TentradaUsuario();
        instance.BuscarUsuarioPorCodigo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LimpaCampos method, of class TentradaUsuario.
     */
    @Test
    public void testLimpaCampos() {
        System.out.println("LimpaCampos");
        TentradaUsuario instance = new TentradaUsuario();
        instance.LimpaCampos();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of preencherTabela method, of class TentradaUsuario.
     */
    @Test
    public void testPreencherTabela() {
        System.out.println("preencherTabela");
        String SQL = "select *from cad_usuario";
        TentradaUsuario instance = new TentradaUsuario();
        instance.preencherTabela(SQL);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mascaras method, of class TentradaUsuario.
     */
    @Test
    public void testMascaras() {
        System.out.println("mascaras");
        TentradaUsuario instance = new TentradaUsuario();
        instance.mascaras();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registraEntrada method, of class TentradaUsuario.
     */
    @Test
    public void testRegistraEntrada() {
        System.out.println("registraEntrada");
        TentradaUsuario instance = new TentradaUsuario();
        instance.registraEntrada();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of atualizaStatusUsoOcupado method, of class TentradaUsuario.
     */
    @Test
    public void testAtualizaStatusUsoOcupado() {
        System.out.println("atualizaStatusUsoOcupado");
        TentradaUsuario instance = new TentradaUsuario();
        instance.atualizaStatusUsoOcupado();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of preencherComboboxMaquina method, of class TentradaUsuario.
     */
    @Test
    public void testPreencherComboboxMaquina() {
        System.out.println("preencherComboboxMaquina");
        TentradaUsuario instance = new TentradaUsuario();
        instance.preencherComboboxMaquina();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
