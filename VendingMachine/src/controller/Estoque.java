/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.List;
import vendingmachine.model.*;
/**
 *
 * @author Fabio Mendes
 */
public class Estoque {
    private Double totalVendas;
    
    private Bebidas chaMate;
    private Bebidas sucoDelVale;
    private Bebidas refriPepsi;
    
    //Inicializando o estoque
    public Estoque(){
        //tipo, marca, ml, qtd, preco, id
        
        chaMate = new Bebidas("Chá", "Mate Leão", 200.00, 18, 2.50, 1);
        sucoDelVale = new Bebidas("Suco", "Del Vale", 250.00, 24, 3.20, 2);
        refriPepsi = new Bebidas("Refrigerante", "Pepsi", 300.00, 12, 4.00, 3);
        
        totalVendas = 0.0;
    }
    
    public Boolean validarOpcao(Integer opc){
        if(opc.equals(chaMate.getId())){//A opção foi de chá?
            return true;
        }
        else if(opc.equals(sucoDelVale.getId())){//A opção foi de chá?
            return true;
        }
        else if(opc.equals(refriPepsi.getId())){//A opção de refrigerante?
            return true;
        }
        else{
            return false;
        }
    }//fim de validarOpcao
    
    public Boolean validarQuantidade(Integer qtd, Integer opc){
        switch(opc){//Verifica se é possível atender a quantidade solicitada
            case 1:
                if(chaMate.getQtd() >= qtd)
                    return true;
            break;
            case 2:
                if(sucoDelVale.getQtd() >= qtd)
                    return true;
            break;
            case 3:
                if(refriPepsi.getQtd() >= qtd)
                    return true;
            default:
                return false;
        }//fim do switch
        return false;
    }//fim de validarQuantidade
    
    public Boolean validarPagamento(Double valor_pago, Integer opc, Integer qtd){
        switch(opc){
            case 1:
                if(chaMate.consultarPreco(qtd) <= valor_pago)
                    return true;
            break;
            case 2:
                if(sucoDelVale.consultarPreco(qtd) <= valor_pago)
                    return true;
            break;
            case 3:
                if(refriPepsi.consultarPreco(qtd) <= valor_pago)
                    return true;
            break;
        }
        return false;
    }//fim de validarPagamento()
    
    public Double verificarTroco(Double valor_pago, Integer opc, Integer qtd){
        switch(opc){
            case 1:
                return (valor_pago - chaMate.consultarPreco(qtd));
            case 2:
                return (valor_pago - sucoDelVale.consultarPreco(qtd));
            case 3:
                return (valor_pago - refriPepsi.consultarPreco(qtd));
        }//fim do switch
        return 0.0;
    }//fim de verificarTroco
    
    public void subtrairItem(Integer opc, Integer qtd){
        switch(opc){
            case 1:
                totalVendas = totalVendas + chaMate.consultarPreco(qtd);
                chaMate.retirarItens(qtd);
            break;
            case 2:
                totalVendas = totalVendas + sucoDelVale.consultarPreco(qtd);
                sucoDelVale.retirarItens(qtd);
            break;
            case 3:
                totalVendas = totalVendas + refriPepsi.consultarPreco(qtd);
                refriPepsi.retirarItens(qtd);
            break;
        }//fim do switch
    }//fim de subtrairItem
    
    public List<Bebidas> exibirOpcoes(){
        List<Bebidas> prods = new ArrayList<>();
        prods.add(chaMate);
        prods.add(sucoDelVale);
        prods.add(refriPepsi);
        return prods;
    }
    
    public Double totalVendas(){
        return totalVendas;
    }
}//fim da classe
