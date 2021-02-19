/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Fabio Mendes
 */
public class TabelaBebidas extends AbstractTableModel{
    private List<Bebidas> prods = new ArrayList<>();
    private String[] colunas = {"Opção", "Tipo", "Marca", "ml", "Qtd.", "Preço"};
    
    @Override
    public int getRowCount() {//Quantidade de Linhas
        return prods.size();
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }

    @Override
    public int getColumnCount() {//Quantidade de Colunas
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {//Pegar valores de uma célula
        switch(coluna){
            case 0:
                return prods.get(linha).getId();
            case 1:
                return prods.get(linha).getTipo();
            case 2:
                return prods.get(linha).getMarca();
            case 3:
                return prods.get(linha).getMl();
            case 4:
                return prods.get(linha).getQtd();
            case 5:
                return prods.get(linha).consultarPreco(1);
        }
        return null;
    }
    
    public void adicionarDadosTabela(List<Bebidas> bebidas){
        this.prods = bebidas;
    }
}
