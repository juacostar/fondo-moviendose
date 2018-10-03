/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.interfaz;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private int xref;
    private int yref;
    private int ancho;
    private int alto;
    private boolean dir;
    private Chasis chasis;
    private Llanta[] llantas;

    public Carro(int xref, int yref, int ancho, int alto,boolean dir,Chasis chasis, Llanta[] llantas) {
        this.xref = xref;
        this.yref = yref;
        this.ancho = ancho;
        this.alto = alto;
        this.dir=dir;
        this.chasis= new Chasis(xref, yref, ancho, alto);
        this.llantas= new Llanta[2];
        
    }

    public boolean isDir() {
        return dir;
    }

    public void setDir(boolean dir) {
        this.dir = dir;
    }
    

    public int getXref() {
        return xref;
    }

    public void setXref(int xref) {
        this.xref = xref;
    }

    public int getYref() {
        return yref;
    }

    public void setYref(int yref) {
        this.yref = yref;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
    public void mover(){
        if(this.dir){
            this.xref++;
            
        }else{
            this.xref--;
        }
    }
    
    
    
    
}
