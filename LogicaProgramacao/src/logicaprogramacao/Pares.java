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
public class Pares {
    private int[] saida = new int[50];
    
    
    public int[] ObterElementosPares(int[] vet){
        int x=0;
        for(int aux=0; aux<vet.length; aux++){
            if( (vet[aux]%2)==0 ){
                saida[x] = vet[aux];
                x++;
            }
        }
        return saida;
    }
}
