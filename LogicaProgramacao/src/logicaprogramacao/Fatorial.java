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
public class Fatorial {
    private int numero;
    
    public int CalculaFatorial(int num){
        numero = num;
        for(int x=(num-1); x >= 1; x--){
            numero = numero * x;
            System.out.println(numero);
        }
        return numero;
    }
}
