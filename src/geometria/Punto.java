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
public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        this(0,0);
    }
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Punto(Punto p){
        /*this.x = p.x;
        this.y = p.y;*/
        this(p.x,p.y);
    }
    
    //Los atributos se pueden consultar y modificar
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void desplazar(int x1, int y1){
        this.x += x1;
        this.y += y1;
    }
    
    public void imprimir(){
        System.out.println("("+x+","+y+")");
    }
    
    public double distancia(Punto p2){
        double dist;
        dist = Math.sqrt(Math.pow(this.x - p2.x,2)+ Math.pow(this.y - p2.y, 2));
        return dist;
    }
    
    public void desplazar(Direccion dir){
        switch(dir){
            case ARRIBA:
                this.y++;
                break;
            case ABAJO:
                this.y--;
                break;
            case DERECHA:
                this.x++;
                break;
            case IZQUIERDA:
                this.x--;
                break;
        }
    }
    
    public Punto mayorDistancia(Punto... puntos){
        Punto mayor = this;
        Punto origen = new Punto();
        double mdist = origen.distancia(this);
        double dist;
        
        for(Punto pt:puntos){
            dist = origen.distancia(pt);
            if(dist > mdist){
                mdist = dist;
                mayor = pt;
            }
        }
        
        
        return mayor;
    }
    
}
