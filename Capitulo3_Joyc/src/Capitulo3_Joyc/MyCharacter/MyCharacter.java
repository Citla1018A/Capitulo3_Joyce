/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3_Joyc.MyCharacter;

/**
 *
 * @author Citlalli
 */
public class MyCharacter {
    private String color;
    private Integer ojos;
    private Integer vidas;
    private String tipo;
    
    public MyCharacter(String color,Integer ojos,Integer vidas,String tipo){
        this.color=color;
        this.ojos=ojos;
        this.vidas=vidas;
        this.tipo=tipo;
              
    }
    public String getColor(){
        return color;
    }
    public Integer getOjos(){
        return ojos;
    }
    public Integer getVidas(){
        return vidas;
    }
    public String getTipo(){
        return tipo;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setOjos(Integer ojos){
        this.ojos=ojos;
    }
    public void setVidas(Integer vidas){
        this.vidas=vidas;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    
}
