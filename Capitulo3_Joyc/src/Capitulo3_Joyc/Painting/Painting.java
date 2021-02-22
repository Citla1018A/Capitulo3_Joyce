/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3_Joyc.Painting;

/**
 *
 * @author Citlalli
 */
public class Painting {
    private String titulo;
    private String artista;
    private String medio;
    private Double precio;
    private Double comision;
    public Painting(){
        this.artista="desconocido";
        this.comision=0.0;
        this.medio="desconocido";
        this.precio=0.0;
        this.titulo="desconocido";
    }
    public Painting(String titulo, String artista,String medio,Double precio){
        this.artista=artista;
        this.medio=medio;
        this.precio=precio;
        this.titulo=titulo;
    }
    public void setArtista(){
        this.artista=artista;
    }
    public void setTitulo(){
        this.titulo=titulo;
    }
    public void setMedio(){
        this.medio=medio;
    }
    public void setPrecio(){
        this.precio=precio;
    }
    public void setComision(){
        this.comision=comision;
    }
    public String getArtista(){
        return artista;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getMedio(){
        return medio;
    }
    public Double getPrecio(){
        return precio;
    }
    public Double getComision(){
        return comision;
    }
    public Double Calco(){
        return(this.getPrecio()*20)/100;
    }
    public String Galeria(){
        return "La galeria tiene comision del 20% del precio";
    }
    
}
