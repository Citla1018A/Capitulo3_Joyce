/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3_Joyc.TwoCharacters;

import Capitulo3_Joyc.MyCharacter.MyCharacter;
import java.util.Locale;

/**
 *
 * @author Citlalli
 */
public class TwoCharacters {
    private MyCharacter personaje;
    public TwoCharacters(MyCharacter personaje){
        this.personaje=personaje;
    }
    public MyCharacter getPersonaje(){
        return personaje;
    }
    public void setPersonaje(){
        this.personaje=personaje;
    }
    @Override
    public String toString(){
        return String.format(Locale.UK, null, this.getPersonaje());
       // return String.format("El personaje color %s es de tipo %s con %d ojos y tiene %d vidas en el juego",this.getPersonaje().getColor,this.getPersonaje().getTipo(),this.getPersonaje().getOjos(),this.getPersonaje().getVidas());
      //  return String.format("El personaje color %s es de tipo %s con %d ojos y tiene %d vidas en el juego",this.getPersonaje()., args)
    }

}
