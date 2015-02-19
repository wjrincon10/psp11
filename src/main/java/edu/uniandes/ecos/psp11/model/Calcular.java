/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp11.model;

import java.util.LinkedList;

/**
 *
 * @author Administrador
 */
public class Calcular {
     public static double CalcularMedia(LinkedList<Double> lista)
    {
        int cant =0;
        double acum =0;
                
        for (Double lista1 : lista) {
            acum = acum + lista1;
            cant++;
        }
          
        return acum /cant;
    }
    
     
    public static double CalcularLN(Double valor){
        return  Math.log(valor);
    }
    
    public static double CalcularVarianza(LinkedList<Double> lista, double avg){
         double acum =0;
         int cant =0;
                
        for (Double lista1 : lista) {
            acum =  acum + Math.pow(lista1 - avg, 2);
             cant++;
        }
          
        return acum / (cant-1) ;
    }
    
    public static double CalcularDesvStandar(Double variance){
        return Math.sqrt(variance);
    }
}