/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3_Joyc.Sandwich;

/**
 *
 * @author Citlalli
 */
public class Sandwich {
    private String ingredientes;
    private String pan;
    private Double precio;
    public Sandwich(String ingredientes,String pan,Double precio){
        this.ingredientes=ingredientes;
        this.pan=pan;
        this.precio=precio;
    }
    public String getIngredientes(){
        return ingredientes;
    }
    public String getPan(){
        return pan;
    }
    public Double getPrecio(){
        return precio;
    }
    public void setIngredientes(String ingredientes){
        this.ingredientes=ingredientes;
    }
    public void setPan(String pan){
        this.pan=pan;
    }
    public void setPrecio(Double precio){
        this.precio=precio;
    }
    //Imprimir bonito
    public String toString(){
        return String.format("El Sandwich es de %s con pan de %s con precio de %2.f",this.getIngredientes(),this.getPan(),this.getPrecio() );
    }
    
}
