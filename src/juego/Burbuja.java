/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import geometria.Circulo;
import geometria.Punto;

/**
 *
 * @author Estudiante
 */
public class Burbuja {
    private Circulo region;
    private final int velocidadMax;
    private int velocidadActual;
    private boolean explotada;

    public Burbuja(Circulo region, int velocidadMax) {
        this.region = region;
        this.velocidadMax = velocidadMax;
        this.velocidadActual=0;
        this.explotada=false;
    }

    public Circulo getRegion() {
        return  new Circulo(region);
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public boolean isExplotada() {
        return explotada;
    }
    
    public void situar(Punto posicion){
        region.desplazar(posicion);
    }
    
    public void ascender(){
        region.desplazar(0,velocidadActual);
        if(velocidadActual<velocidadMax){
            ++velocidadActual;
        }
        
    }
    public void chocar(){
        this.velocidadActual=0;
    }
    
    
}
