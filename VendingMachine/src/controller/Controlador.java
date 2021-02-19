/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Fabio Mendes
 */
public class Controlador {
    private Integer opcao;//Digitada pelo usuário
    private Integer quantidade;//Digitada pelo usuário
    private Integer valorPago;//Digitada pelo usuário
    private Double troco;//Calculado
    
    Estoque est = new Estoque();
    
    public String comprar(Integer opc, Integer qtd, Double valorPago){
        if(est.validarOpcao(opc)){
            if(est.validarQuantidade(qtd, opc)){
                if(est.validarPagamento(valorPago, opc, qtd)){
                    //Tudo certo para efetuar a venda:
                    est.subtrairItem(opc, qtd);
                    //est.verificarTroco(valorPago, opc, qtd);
                    return Double.toString(est.verificarTroco(valorPago, opc, qtd));
                }
                else{//O valor de pagamento é inválido
                    //Exibir uma mensagem de erro relacionada ao valor pago
                    return "ERRO: Verifique o valor de pagamento, o valor informado é incompatível.";
                }
            }
            else{//A quantidade é inválida
                //Deve exibir uma mensagem de erro relacionada a quantidade
                return "ERRO: Verifique a quantidade, o valor informado é inválido.";
            }
        }
        else{//A Opção por algum motivo é inválida
            //Deve exibir uma mensagem de erro relacionada a opção
            return "ERRO: Verifique a opção, o valor informado é inválido.";
        }
    }
}
