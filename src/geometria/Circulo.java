/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author Estudiante
 */
public class Circulo {
    private final static Punto CENTRODEFECTO= new Punto();
    private final static int RADIO_DEFECTO=5;
    private Punto centro;
    private int radio;
    private double perimetro;

    public Punto getCentro() {
        return new Punto (centro);
    }

    public int getRadio() {
        return radio;
    }

   


    public Circulo(Punto centro, int radio) {
        this.centro = new Punto(centro);
        this.radio = radio;  
    }
    public Circulo(){  
        this(CENTRODEFECTO, RADIO_DEFECTO);
    }
    
    public Circulo(Circulo c){
        this(c.centro,c.radio);
    }
    
    public double getPerimetro(){
        return 2*Math.PI*radio;
    }
    
    public void desplazar(int x, int y){
       centro.desplazar(x, y);
    }
    public void desplazar(Punto c){
        c=centro;
    }
    
    public void escalar(int porcentaje){
        this.radio=this.radio*(porcentaje/100);
    }
    
    public String mostrar(){
        return "La cordenada son: ("+centro+")("+ radio;
    }
    
}
