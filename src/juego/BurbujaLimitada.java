/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import geometria.Circulo;

/**
 *
 * @author Estudiante
 */
public class BurbujaLimitada extends Burbuja {
    private final int limiteDesplazamiento;
    private int cantidadDesplazamiento;

    public BurbujaLimitada(int limiteDesplazamiento, Circulo region, int velocidadMax) {
        super(region, velocidadMax);
        this.limiteDesplazamiento = limiteDesplazamiento;
        this.cantidadDesplazamiento=0;
    }

    
    public int getCantidadDesplazamiento() {
        return cantidadDesplazamiento;
    }
    
    public boolean isParada(){
        return getVelocidadActual()==0 || cantidadDesplazamiento>= limiteDesplazamiento;
    }
    
}
