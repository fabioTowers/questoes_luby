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
public class Primos {
    Integer qtdPrimos=0;
    
    public Integer ContarNumerosPrimos(Integer arg){
        
        int x=3, y=2;
        
        if(arg < 2)//caso de exceção 1
            return 0;
        else if(arg == 2){//caso de exceção 2
            return 1;
        }else{//Casos normais
            qtdPrimos++;
            while(x <= arg){//while 1: começa em 3 e vai até o número passado
                while(y <= (x-1)){//while 2: inicia em 2 e vai até x-1
                    if( (x % y) != 0 ){//A divisão não deu zero: x ainda pode ser primo
                        if( y == (x-1) ){//Já foram feitas todas as verificações
                            qtdPrimos++;
                            y = 2;
                            x++;
                            break;
                        } else {//Ainda não foram feitas todas as verificações
                            y++;
                        }
                    } else {//A divisão deu zero: x não é primo
                        y = 2;
                        x++;
                        break;
                    }
                }//fim do while 2
            }//fim do while 1
        }// fim de casos normais
        
        
        return qtdPrimos;
    }
}
