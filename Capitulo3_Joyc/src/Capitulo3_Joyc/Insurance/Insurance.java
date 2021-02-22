/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3_Joyc.Insurance;

/**
 *
 * @author Citlalli
 */
public class Insurance {
    private Integer actual;
    private Integer fechaN;
    
    public Insurance(Integer actual,Integer fechaN){
        this.actual=actual;
        this.fechaN=fechaN;
    }
    public Integer getActual(){
        return this.actual;
    }
    public Integer getFechaN(){
        return this.fechaN;
    }
    public void setActual(Integer actual){
        this.actual=actual;
    }
    public void setFechaN(Integer fechaN){
        this.fechaN=fechaN;
    }
    //La edad cambia 
    public Integer getEdad(){
        return this.getActual()-this.fechaN;
    }
    public Integer Politicaanual(){
        return(this.getEdad()+15)*20;
    }
    //imprimir bonito
    public String toString(){
        return String.format("El calculo de su prima anual de la poliza es: $%d",this.Politicaanual());
    }
}
