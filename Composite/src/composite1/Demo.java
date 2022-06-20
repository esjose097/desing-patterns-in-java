/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite1;

/**
 * Ejemplo de implementación del patrón composite.
 *
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GraphicObject drawing = new GraphicObject();
        drawing.setName("My drawing");

        drawing.children.add(new Square("red"));
        drawing.children.add(new Circle("Yellow"));

        GraphicObject group = new GraphicObject();
        group.children.add(new Square("blue"));
        group.children.add(new Circle("blue"));
        
        drawing.children.add(group);
        
        System.out.println(drawing);
    }

}
