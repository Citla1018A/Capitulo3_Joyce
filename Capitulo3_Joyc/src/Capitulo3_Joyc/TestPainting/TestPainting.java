/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3_Joyc.TestPainting;

import Capitulo3_Joyc.Painting.Painting;

/**
 *
 * @author Citlalli
 */
public class TestPainting {
    private Painting pintura;
    public TestPainting(Painting pintura){
        this.pintura=pintura;
    }
    public Painting getPintura(){
        return pintura;
    }
    public void setPintura(Painting pintura){
        this.pintura=pintura;
    }
     public String toString(){
        return String.format("La pintura de nombre %s, del artista %s, hecha de %s, a un precio de $%.2f, y una comision de %.2f\n%s\n\n",this.getPintura().getTitulo(),this.getPintura().getArtista(),this.getPintura().getMedio(),this.getPintura().getPrecio(),this.getPintura().Calco(),this.getPintura().Galeria());
       
    }
}
