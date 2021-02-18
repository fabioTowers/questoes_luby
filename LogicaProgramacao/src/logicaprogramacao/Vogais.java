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
public class Vogais {
    Integer qtdVogais=0;
    
    public Integer CalcularVogais(String frase){
        frase = frase.toLowerCase();
        for(int aux=0; aux < frase.length(); aux++){
            char letra = frase.charAt(aux);
            if( letra == 'a' ||
                letra == 'e' ||
                letra == 'i' ||
                letra == 'o' ||
                letra == 'u'){
                qtdVogais++;
            }
        }
        
        return qtdVogais;
    }
}
