/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.labsystem.view;

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
public class TsaidaUsuárioIT {

    /**
     * Test of BuscarUsuarioPorNome method, of class TsaidaUsuário.
     */
    @Test
    public void testBuscarUsuarioPorNome() {
        System.out.println("BuscarUsuarioPorNome");
        TsaidaUsuário instance = new TsaidaUsuário();
        instance.BuscarUsuarioPorNome();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarUsuarioPorCodigo method, of class TsaidaUsuário.
     */
    @Test
    public void testBuscarUsuarioPorCodigo() {
        System.out.println("BuscarUsuarioPorCodigo");
        TsaidaUsuário instance = new TsaidaUsuário();
        instance.BuscarUsuarioPorCodigo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LimpaCampos method, of class TsaidaUsuário.
     */
    @Test
    public void testLimpaCampos() {
        System.out.println("LimpaCampos");
        TsaidaUsuário instance = new TsaidaUsuário();
        instance.LimpaCampos();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of preencherTabela method, of class TsaidaUsuário.
     */
    @Test
    public void testPreencherTabela() {
        System.out.println("preencherTabela");
        String SQL = "select *from controle_acesso where data_acesso = '09/05/2017' and status_controle_acesso = 'LOGADO'";
        TsaidaUsuário instance = new TsaidaUsuário();
        instance.preencherTabela(SQL);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mascaras method, of class TsaidaUsuário.
     */
    @Test
    public void testMascaras() {
        System.out.println("mascaras");
        TsaidaUsuário instance = new TsaidaUsuário();
        instance.mascaras();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registraSaida method, of class TsaidaUsuário.
     */
    @Test
    public void testRegistraSaida() {
        System.out.println("registraSaida");
        TsaidaUsuário instance = new TsaidaUsuário();
        instance.registraSaida();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of atualizaStatusUsoLivre method, of class TsaidaUsuário.
     */
    @Test
    public void testAtualizaStatusUsoLivre() {
        System.out.println("atualizaStatusUsoLivre");
        TsaidaUsuário instance = new TsaidaUsuário();
        instance.atualizaStatusUsoLivre();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TsaidaUsuário.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TsaidaUsuário.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
