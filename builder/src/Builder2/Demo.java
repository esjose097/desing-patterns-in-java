/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Builder2;

/**
 * Implementación del patrón de diseño: "Builder"
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Primero creamos el elemento padre que en este caso es una lista.
        HtmlBuilder builder = new HtmlBuilder("ul");
        //Le agregamos elementos hijos dentro de la lista.
        builder
                .addChild("li", "hello")
                .addChild("li", "world");        
        //Y lo corremos.
        System.out.println(builder);        
    }
    
}
