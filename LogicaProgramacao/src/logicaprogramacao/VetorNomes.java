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
public class VetorNomes {
    
    String[] saida= new String[50];
    
    public String[] BuscarPessoa(String[] vetor, String nome){
        int x=0;
        for(int aux=0; aux<vetor.length; aux++){
            if( vetor[aux].contains( nome ) ){
                saida[x] = vetor[aux];
                x++;
            }
        }
        
        return saida;
    }
}
