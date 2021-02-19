/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.model;

/**
 *
 * @author Fabio Mendes
 */
public class bebidas {
    private String tipo;//Ex.: chá, suco, refrigerante
    private String marca;//Ex.: Mate Leão, DelVale, Pepsi
    private Float ml;//Ex.: 250, 400, 200 (ml)
    private Integer qtd;//Ex.: 10 latas
    private Double preco;//R$
    private Integer id;//Opção para escolha
    
    public Boolean retirarItens (Integer qtdSubtrair){
        if((qtd - qtdSubtrair) >= 0){//há itens para retirar?
            qtd = qtd = qtdSubtrair;
            return true;
        } else {
            return false;
        }
    }//fim de retirar itens
    
    public Double ConsultarPreco(Integer qtdComprar){
        return (preco * qtdComprar);
    }
    
    public Integer getId (){
        return id;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public Float getMl(){
        return ml;
    }
    
    public String getMarca(){
        return tipo;
    }
}
