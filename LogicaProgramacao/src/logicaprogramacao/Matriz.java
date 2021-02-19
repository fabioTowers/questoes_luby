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
public class Matriz {
    private int[] linhas = new int[2];
    private int[][] matriz = new int[50][2];
    private int x=0;//Linhas
    private int y=0;//Colunas
    
    
    public int[][] TransformarEmMatriz(String numeros){
        
        for(int aux=0; aux<numeros.length(); aux++){
            char num = numeros.charAt(aux);
            if(num != ','){//Senão é uma vírgula é um número
                /*for(int x=0; ?; x++){
                    for(int y=0; y<; y++){
                        matriz[x][y] = Integer.parseInt( String.valueOf(num) );
                    }
                }*/
                if(y>1){//Deve 'pular' para próxima linha
                    x++;
                    y=0;
                    matriz[x][y] = Integer.parseInt( String.valueOf(num) );
                    y++;
                }else{//pode escrever direto
                    matriz[x][y] = Integer.parseInt( String.valueOf(num) );
                    y++;
                }
                //System.out.print(num+"-");
            }
        }
        
        return matriz;
    }
}
