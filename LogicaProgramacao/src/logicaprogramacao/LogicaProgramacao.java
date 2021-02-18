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
public class LogicaProgramacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatorial ft = new Fatorial();
        System.out.println("Fatorial de 5: " + ft.CalculaFatorial(5));
        
        Premio p = new Premio();
        System.out.println("Premio vip de 100: " + p.CalcularPremio(100.0, "vip", null));
        System.out.println("Premio basic de 100 fator 3: " + p.CalcularPremio(100.0, "basic", 3.0));
        
        Primos primos = new Primos();
        System.out.println("Quantidade de primos até 10: " + primos.ContarNumerosPrimos(10));
        
        Vogais vg = new Vogais();
        System.out.println("Ha " + vg.CalcularVogais("Luby Software") + " vogais na frase 'Luby Software'");
        
        Desconto d = new Desconto();
        System.out.println("R$ 6.800,00 descontado de 30%: " + d.CalcularValorComDescontoFormatado("R$ 6.800,00", "30%"));
        
        Datas dt = new Datas();
        System.out.println("Diferença entre as datas: "+dt.CalcularDiferencaData("10122020", "25122020") + " dias.");
    }
    
}
