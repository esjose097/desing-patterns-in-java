/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator4;

/**
 * Ejemplo de implementación de la fusión de los patrones de diseño: "Adapter" y
 * "Decorator"
 *
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder();
        msb.append("hello").appendLine(" world");
        System.out.println(msb.concat("and this too"));

    }

}
