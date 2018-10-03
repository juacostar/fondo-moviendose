/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.interfaz;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer {
    private GraphicsContext lapiz;
    private Chasis chasis;
    private Llanta[] llantas;
    private Carro carro;
    private Nube[] nubes;

    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.llantas= new Llanta[2];
        this.carro=new Carro(30,120,70,20,true,chasis,llantas);
        this.nubes= new Nube[8];
        for(int i=0;i<nubes.length;i++){
            this.nubes[i]=new Nube(150*i, 10, 40, 20);
            
        }
    }
    
       
    
    public void handle(long now){
        lapiz.clearRect(0, 0, 300, 300);
        lapiz.strokeRect(this.carro.getXref(), this.carro.getYref(), this.carro.getAncho(), this.carro.getAlto());
        lapiz.strokeOval(this.carro.getXref(), this.carro.getYref()+this.carro.getAlto(), 10, 10);
        lapiz.strokeOval(this.carro.getXref()+60, this.carro.getYref()+this.carro.getAlto(), 10, 10);
        lapiz.setFill(Color.GRAY);
        lapiz.fillOval(20, 135, 10, 10);
        lapiz.setFill(Color.WHITE);
        lapiz.fillOval(20, 135, 10, 10);
       
        
        for(int j=0;j<nubes.length;j++){
            lapiz.strokeRect(this.nubes[j].getX(), this.nubes[j].getY(), this.nubes[j].getAncho(), this.nubes[j].getAlto());
            this.nubes[j].mover();
        }
        lapiz.strokeText("Puntaje: 0", 200, 10);
        
    }
}
