/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridge;

/**
 * Esto se puede mejorar con inyección de dependencias que lamentablemente
 * no poseo UnU.
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RasterRenderer rester = new RasterRenderer();        
        VectorRenderer vector = new VectorRenderer();
        
        Circle circle = new Circle(vector, 5);
        circle.draw();
        circle.resize(2);
        circle.draw();
    }
    
}
