/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.bridgeee;

/**
 *
 * @author ALEXCJ
 */
public class Circulo extends Forma{
    private double coordenadaX, coordenadaY, coordenadaR;
    public Circulo(Dibujo d, double x, double y, double r){
    super(d);
    coordenadaX=x;
    coordenadaY=y;
    coordenadaR=r;
    }
    public void dibuja(){
    dibujaCirculo(coordenadaX, coordenadaY, coordenadaR);
    }
    
}
