/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3_Joyc.TestSandwich;

import Capitulo3_Joyc.Sandwich.Sandwich;

/**
 *
 * @author Citlalli
 */
public class TestSandwich {
    private Sandwich comida;
     public TestSandwich(Sandwich comida){
         this.comida=comida;
     }
     public void setComida(Sandwich comida){
         this.comida=comida;
     }
     public Sandwich getComida(){
         return comida;
     }
}
