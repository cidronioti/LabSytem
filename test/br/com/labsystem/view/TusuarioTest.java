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
public class TusuarioTest {
    /**
     * Test of buscandoDadosUsuario method, of class Tusuario.
     */
    @Test
    public void testBuscandoDadosUsuario() {
        System.out.println("buscandoDadosUsuario");
        String nome = "USER";
        Tusuario instance = new Tusuario();
        instance.buscandoDadosUsuario(nome);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of mascaras method, of class Tusuario.
     */
    @Test
    public void testMascaras() {
        System.out.println("mascaras");
        Tusuario instance = new Tusuario();
        instance.mascaras();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of preencherTabela method, of class Tusuario.
     */
    @Test
    public void testPreencherTabela() {
        System.out.println("preencherTabela");
        String SQL = "select * from cad_maquina where status_funcionamento = 'Funcionado' && status_uso = 'L'";
        Tusuario instance = new Tusuario();
        instance.preencherTabela(SQL);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of preencheCombo method, of class Tusuario.
     */
    @Test
    public void testPreencheCombo() {
        System.out.println("preencheCombo");
        Tusuario instance = new Tusuario();
        instance.preencheCombo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registraEntrada method, of class Tusuario.
     */
    @Test
    public void testRegistraEntrada() {
        System.out.println("registraEntrada");
        Tusuario instance = new Tusuario();
        instance.registraEntrada();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registraSaida method, of class Tusuario.
     */
    @Test
    public void testRegistraSaida() {
        System.out.println("registraSaida");
        Tusuario instance = new Tusuario();
        instance.registraSaida();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verificaHoraEntrada method, of class Tusuario.
     */
    @Test
    public void testVerificaHoraEntrada() {
        System.out.println("verificaHoraEntrada");
        String hora = "00:12:09";
        Tusuario instance = new Tusuario();
        instance.verificaHoraEntrada(hora);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of preencherTabelaHistoricoUsuarioDis method, of class Tusuario.
     */
    @Test
    public void testPreencherTabelaHistoricoUsuarioDis() {
        System.out.println("preencherTabelaHistoricoUsuarioDis");
        String SQL = "select *from controle_acesso where data_acesso = '00:02:03'";
        Tusuario instance = new Tusuario();
        instance.preencherTabelaHistoricoUsuarioDis(SQL);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of atualizaStatusUsoOcupado method, of class Tusuario.
     */
    @Test
    public void testAtualizaStatusUsoOcupado() {
        System.out.println("atualizaStatusUsoOcupado");
        Tusuario instance = new Tusuario();
        instance.atualizaStatusUsoOcupado();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of atualizaStatusUsoLivre method, of class Tusuario.
     */
    @Test
    public void testAtualizaStatusUsoLivre() {
        System.out.println("atualizaStatusUsoLivre");
        Tusuario instance = new Tusuario();
        instance.atualizaStatusUsoLivre();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registraEntrada2 method, of class Tusuario.
     */
    @Test
    public void testRegistraEntrada2() {
        System.out.println("registraEntrada2");
        Tusuario instance = new Tusuario();
        instance.registraEntrada2();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alteraEstadoBotao method, of class Tusuario.
     */
    @Test
    public void testAlteraEstadoBotao() {
        System.out.println("alteraEstadoBotao");
        Tusuario instance = new Tusuario();
        instance.alteraEstadoBotao();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
