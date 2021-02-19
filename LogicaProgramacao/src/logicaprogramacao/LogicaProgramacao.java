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
        
        Pares par = new Pares();
        int[] vet={1,2,3,4,5};
        int[] saida = par.ObterElementosPares(vet);
        System.out.print( "Elemento pares do vetor: ");
        for(int aux=0; aux<saida.length; aux++){
            if(saida[aux] != 0)
                System.out.print( saida[aux]+"," );
            else
                break;
        }
        System.out.print( "\n");
        
        VetorNomes vn = new VetorNomes();
        String[] vetor = new String[]{
            "John Doe",
            "Jane Doe",
            "Alice Jones",
            "Bobby Louis",
            "Lisa Romero"
        };
        String[] resultado;
        resultado = vn.BuscarPessoa(vetor, "Doe");
        System.out.print("Nomes no vetor: ");
        for(int aux=0; aux<resultado.length; aux++){
            if( resultado[aux] != null )
                System.out.print(resultado[aux] + ", ");
        }
        System.out.println();
        
        Matriz mt = new Matriz();
        String vetorNumeros = "1,2,3,4,5,6";
        int[][] matriz = new int[50][2];
        matriz = mt.TransformarEmMatriz(vetorNumeros);
        System.out.println("Numeros na matriz:");
        for(int a=0; a<50; a++){
            for(int b=0; b<=1; b++){
                if( matriz[a][b] != 0){
                    System.out.print("\t"+matriz[a][b]+", ");
                    if(b==1)
                        System.out.println();
                }
                else
                    break;
            }//fim do for de b
        }//fim do for de a
        
        
        
    }//fim do main
    
}//fim da classe
