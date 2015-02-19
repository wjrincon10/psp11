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
public class CalcularDatos {
    public double VS;
    public double S;
    public double M;
    public double L;
    public double VL;
    
    private double CantDatos;
    private double MediaDato;
    private double Variance;
    private LinkedList<Double> inputDataX;
    private LinkedList<Double> inputDataY;
    private LinkedList<Double> Loc;
    private LinkedList<Double> LnX;
    
    
    public void setInputData(int cant,LinkedList<Double> inputX,LinkedList<Double> inputY)
    {
        this.CantDatos= cant;
        this.inputDataX = inputX;
        this.inputDataY = inputY;
    }
    
    public void InicializarData(){
        this.CalcularLoc();
        this.CalcularLn();       
    }
    
    public void CalcularSize(){
        double lnVS=0;
        double lnS=0;
        double lnM=0;
        double lnL=0;
        double lnVL=0;
        
        this.MediaDato = Calcular.CalcularMedia(this.LnX);
        this.Variance = Calcular.CalcularVarianza(this.LnX, this.MediaDato);
        
        lnVS = this.MediaDato - (2*Math.sqrt(this.Variance));
        lnS = this.MediaDato - this.Variance;
        lnM = this.MediaDato;
        lnL = this.MediaDato + this.Variance;
        lnVL = this.MediaDato + (2*Math.sqrt(this.Variance));
        
        
        this.VS = Math.pow(Math.E, lnVS);
        this.S = Math.pow(Math.E, lnS);
        this.M = Math.pow(Math.E, lnM);
        this.L = Math.pow(Math.E, lnL);
        this.VL = Math.pow(Math.E, lnVL);
        
    }
    
    private void CalcularLoc(){
        Loc = new LinkedList<Double>();
          
        for(int i=0; i< this.CantDatos; i++) {
             this.Loc.add(this.inputDataX.get(i) / this.inputDataY.get(i));            
        }
     }
    
    private void CalcularLn(){
         LnX = new LinkedList<Double>();
        
         for (Double lista1 : this.Loc) {
            LnX.add(Math.log(lista1));
        }
    }
}
