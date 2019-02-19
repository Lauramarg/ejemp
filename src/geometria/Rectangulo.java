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
public class Rectangulo {
    private int ladoY;
    private int ladoX;
    
    private Punto verticeII,verticeSI,verticeSD,verticeID;
    private float perimetro;

    public Rectangulo(Punto verticeII,int ladoX,int ladoY) {
       this.verticeII=verticeII;
       this.verticeID= new Punto(verticeII.getX()+ladoX, verticeII.getY());
       this.verticeSI= new Punto(verticeII.getX(), verticeII.getY()+ladoY);
       this.verticeSD= new Punto(verticeID.getX(), verticeSI.getY());
       
       //POO- Sesion4-Alex
    }

   
    public void desplazar(int x, int y){
        this.ladoX=x;
        this.ladoY=y;
    }
    public void escalar(int porcentaje){
        this.ladoX= this.ladoX*porcentaje/100;
        this.ladoY=this.ladoY*porcentaje/100;
    }
    
    
    
    
}
