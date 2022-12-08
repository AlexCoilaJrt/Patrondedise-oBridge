/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu.bridgeee;

/**
 *
 * @author ALEXCJ
 */
public class BRIDGEEE {

    public static void main(String[] args) {
        Rectangulo rectangulo=new Rectangulo(new DibujandoPunteado(),1,1,2,2);
        rectangulo.dibuja();
        Circulo circulo=new Circulo(new DibujandoNormal(),2,2,3);
        circulo.dibuja();
    }
}
