/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaprogramacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabio Mendes
 */
public class Datas {
    
    Long diferenca;
    
    public Long CalcularDiferencaData(String d1, String d2){
        //regex
        d1 = d1.replaceAll("(\\d{2})(\\d{2})(\\d{4})", "$1/$2/$3");
        d2 = d2.replaceAll("(\\d{2})(\\d{2})(\\d{4})", "$1/$2/$3");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date inicio = new Date();
        Date fim = new Date();
        try {
            inicio = sdf.parse(d1);
            fim = sdf.parse(d2);
        } catch (ParseException ex) {
            Logger.getLogger(Datas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        diferenca = (fim.getTime() - inicio.getTime()) / (1000*60*60*24);
        
        return diferenca;
    }
}
