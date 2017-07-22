package br.com.labsystem.bean;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CIDRONIO
 */
public class CriaBanco {
    

    public  void criaBanco() {
        //Passo 01. 1: criar o banco!
        //verifica se existe o arquivo:
        final String DIRETORIO_BACKUP = "G:\\Nova pasta\\LabSystem\\script_bd\\labsys.sql";
        File arq = new File(DIRETORIO_BACKUP);

        //Verifica se o arquivo existe
        if (arq.exists()) {
            // se arquivo existir
            try {
                //Carrega driver do MySQL
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Erro - "+ex);
            }
            //testando se o banxo existe
            Connection conn;
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testeCriaBanco", "root", "root");

                //se existe o database sistema não faz nada!
                JOptionPane.showMessageDialog(null, "Contate o Administrador para primeiro deletar o banco!");

            } catch (SQLException ex) {

                //se não existe o database sistema ele cria
                try {
                    conn = DriverManager.getConnection("jdbc:mysql://localhost?user=root&password=root");

                    //Crio um Statement
                    Statement stmt = conn.createStatement();
                    System.out.println("Começo");
                    //Toda operação que não for consulta, use executeUpdate, só assim
                    //você poderá alterar algo no banco de dados

                    int i = stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS testeCriaBanco");
                    JOptionPane.showMessageDialog(null, "Banco Criado comsucesso!");// Se criar uma nova base de dados, o retorno será 1
                    System.out.println("Final");
                } catch (SQLException ex1) {
                    JOptionPane.showMessageDialog(null, "Não foi possível criar obanco de dados!" + ex1);

                }
                try {
                    //chamando um aquivo .bat com o código de restauração

                    Runtime.getRuntime().exec("cmd.exe /c start labsys.bat");

                } catch (IOException ex2) {
                    JOptionPane.showMessageDialog(null, "Não foi possívelrestaurar o banco... Tente novammente!");
                }
                System.exit(0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Procedimento não realizado!Arquivo de backup inexistente!");
        }
    }//FALATA CRIAR O ARQUIVO .bat DA UMA OLHADA NO PDF PRA VER COMO FAZ
}

