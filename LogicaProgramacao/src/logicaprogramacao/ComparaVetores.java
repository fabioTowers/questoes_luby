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
public class ComparaVetores {
    
    private int[] resultado = new int[50];
    private int[] auxiliar = new int[50];//armazena os elementos dos dois vetores em um
    private int x=0;//percorre o vetor auxiliar
    private int y=0;//percorre o vetor resultado
    
    public int[] ObterElementosFaltantes(int[] vet1, int[] vet2){
        for(int a=0; a<vet1.length; a++){//Juntando todos os elemento em um vetor (auxiliar)
            auxiliar[x] = vet1[a];
            x++;
        }
        for(int a=0; a<vet2.length; a++){//Juntando todos os elemento em um vetor (auxiliar)
            auxiliar[x] = vet2[a];
            x++;
        }
        int tamanho=0;//Controle do tamanho do vetor auxiliar
        for(int a=0; a<auxiliar.length; a++){//Contando o tamanho do vetor auxiliar (elementos válidos)
            if(auxiliar[a] != 0)
                tamanho++;
        }
        /*O laço for dentro do laço for 
        compara cada elemento com todos os
        outros dentro do vetor auxiliar*/
        for(int a=0; a<tamanho; a++){
            for(int b=0; b<tamanho; b++){
                y++;
                if(auxiliar[a] == auxiliar[b]){//Quando dois elementos são iguais
                    if(a != b){//Se eles são iguais e ñ tem o mesmo índice...
                        break;//... se repete mais de uma vez e não interessa
                    }
                } else {//Eles são diferentes
                    if(b == (tamanho-1)){//Já foi comparado com todos os outros?
                        resultado[y] = auxiliar[a];//Sim, vai pro resultado final
                        y++;
                    }
                }
            }
        }
        return resultado;
    }
}
