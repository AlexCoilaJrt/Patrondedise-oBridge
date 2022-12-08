/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.bridgeee;

/**
 *
 * @author ALEXCJ
 */
public class Rectangulo extends Forma{
    private double x1, x2, y1, y2;
    public Rectangulo(Dibujo dibujo, double x1, double y1, double x2, double y2){
    super(dibujo);
    this.x1=x1;
    this.x2=x2;
    this.y1=y1;
    this.y2=y2;
    }
    public void dibuja(){
    dibujaRectangulo(x1,y1,x2,y2);
    }
    
}
