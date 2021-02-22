/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3_Joyc;

/**
 *
 * @author Citlalli
 */
class GasPrices {
    private Integer pricePerBarrel;
    public static final Double Bomba=3.5;//Quedan fijas 
    public static final Double Bomba2=4.0;
    
    public GasPrices(Integer barril){
        this.pricePerBarrel=barril;
    }
    public void setGasPrices(){
        this.pricePerBarrel=pricePerBarrel;
    }
    public Integer getGasPrinces(){
        return this.pricePerBarrel;
    }
    public Double princeGalon(){
        return(this.getGasPrinces()*Bomba)/100;
    }
    public Double princeGalon2(){
        return(this.getGasPrinces()*Bomba2)/100;
    }
    //texto Bonito
    public String toString(){
    return String.format("Si el gas es de %d por barril, entonces el precio en la bomba debe estar entre $%.2f y $%.2f",this.getGasPrinces(),this.princeGalon(),this.princeGalon2());
    }
    
    
    
}
