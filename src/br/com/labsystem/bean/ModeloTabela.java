package br.com.labsystem.bean;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CIDRONIO
 */
public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
    }
    
    public ArrayList getLinha(){
        return linhas;
    }
    
    public void setLinhas(ArrayList dados){
        linhas = dados;
    }
    
    public String[] getColunas(){
        return colunas;
    }
    
    public void setColunas(String[] nomes){
        colunas = nomes;
    }
    
    public int getColumnCount(){
        return colunas.length;
    }

    public int getRowCount(){
        return linhas.size();
    }
    
    public String getColumnName(int nunCol){
        return colunas[nunCol];
    }
    
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinha().get(numLin);
        return linha[numCol];
    }
}
