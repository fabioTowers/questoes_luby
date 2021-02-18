/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaprogramacao;

import java.text.NumberFormat;

/**
 *
 * @author Fabio Mendes
 */
public class Desconto {
    
    String resultado;
    Double dResultado;
    Double dValor;
    Integer dPorcentagem;
    
    public String CalcularValorComDescontoFormatado(String valor, String porcentagem){
        valor = valor.replace("R", "");
        valor = valor.replace("$", "");
        valor = valor.replace(" ", "");
        valor = valor.replace(".", "");
        valor = valor.replace(",", ".");
        porcentagem = porcentagem.replace("%", "");
        porcentagem = porcentagem.replace(" ", "");
        porcentagem = porcentagem.replace(",", ".");
        
        dValor = Double.parseDouble( valor );
        dPorcentagem = Integer.parseInt( porcentagem );
        
        dResultado = dValor - (dValor * (dPorcentagem/100.00));
        System.out.println("dResultado: " + (dPorcentagem/100.00));
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        resultado = nf.format( dResultado );
        return resultado;
    }
}
