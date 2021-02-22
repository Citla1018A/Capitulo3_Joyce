/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3_Joyc;

import Capitulo3_Joyc.Insurance.Insurance;
import Capitulo3_Joyc.MyCharacter.MyCharacter;
import Capitulo3_Joyc.Painting.Painting;
import Capitulo3_Joyc.Sandwich.Sandwich;
import Capitulo3_Joyc.TestPainting.TestPainting;

/**
 *
 * @author Citlalli
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("GasPrices:");
        GasPrices gasPrices = new GasPrices(10);
        System.out.println(""+gasPrices.toString());
        System.out.println("Insurance:");
        Insurance insurance = new Insurance(10,20);
        System.out.println(""+insurance.toString());
        System.out.println("Sandwich:");
        Sandwich sandwich = new Sandwich("tocino","trigo",20.40);
    //    System.out.println(""+Sandwich.);
        System.out.println("TestSandwich");
        System.out.println("Galeria");
        Painting painting = new Painting("Oso","Citlalli","Acuarela",10000.0);
        System.out.println(""+painting.getComision());
        System.out.println(""+painting.Galeria());
        System.out.println("TestPainting");
        TestPainting testPainting = new TestPainting(painting);
        System.out.println(""+testPainting.toString());
        System.out.println("MyCharacter");
//        MyCharacter myCharacter = new MyCharacter();
       // System.out.println(""+MyCharacter.);
        
       
    }
}
