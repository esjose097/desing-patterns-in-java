/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator1;

/**
 * Ejemplo de implementación del patrón de diseño "decorador".
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MagicString s = new MagicString("hello");
        System.out.println(s + " has "
                + s.getNumberOfVowels() + " vowels");
    }

}
