/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;
import controller.Controlador;
import views.TelaInicial;
/**
 *
 * @author Fabio Mendes
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Controlador control = new Controlador();
        //control.exibirProdutos();
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
    }
    
}
