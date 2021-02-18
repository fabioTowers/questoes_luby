/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaprogramacao;

/**
 *
 * @author Fabio Mendes
 */
public class Premio {
    
    Double resultado;
    
    public Double CalcularPremio(Double valor, String tipo, Double fator){
        if(valor > 0){
        if( fator == null ){
            switch(tipo){
                case "basic":
                    resultado = valor * 1;
                break;
                case "vip":
                    resultado = valor * 1.2;
                break;
                case "premium":
                    resultado = valor * 1.5;
                break;
                case "deluxe":
                    resultado = valor * 1.8;
                break;
                case "special":
                    resultado = valor * 2;
                break;
                default:
                    resultado = valor;
                break;
            }//fim do switch
        } else {
            resultado = valor * fator;
        }
        }//fim do primeiro if
        else{
            resultado = 1.0;
        }
        return resultado;
    }
}
