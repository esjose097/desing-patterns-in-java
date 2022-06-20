/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator2;

/**
 * Ejemplo de implementación de la versión dinamica del patrón de diseño
 * "Decorador".
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape myCircle = new TransparentShape(new ColoredShape(new Circle(5), "green"), 50);
        System.out.println(myCircle.info());

    }

}
