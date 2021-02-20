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
public class Bebidas {
    private String tipo;//Ex.: chá, suco, refrigerante
    private String marca;//Ex.: Mate Leão, DelVale, Pepsi
    private Double ml;//Ex.: 250, 400, 200 (ml)
    private Integer qtd;//Ex.: 10 latas
    private Double preco;//R$
    private Integer id;//Opção para escolha
    
    public Bebidas(String tipo, String marca, Double ml, Integer qtd, Double preco, Integer id){
        this.tipo = tipo;
        this.marca = marca;
        this.ml = ml;
        this.qtd = qtd;
        this.preco = preco;
        this.id = id;
    }
    
    public Boolean retirarItens (Integer qtdSubtrair){
        if((qtd - qtdSubtrair) >= 0){//há itens para retirar?
            qtd = qtd - qtdSubtrair;
            return true;
        } else {
            return false;
        }
    }//fim de retirar itens
    
    public Double consultarPreco(Integer qtdComprar){
        return (preco * qtdComprar);
    }
    
    public Integer getId (){
        return id;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public Double getMl(){
        return ml;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public Integer getQtd(){
        return qtd;
    }
}
