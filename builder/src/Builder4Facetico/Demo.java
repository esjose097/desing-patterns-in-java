/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Builder4Facetico;

/**
 * Una implementación del patrón de diseño Builder pero en una versión
 * Multifacetica es decir distintos builders trabajando juntos para crear la
 * instancia de un objeto.
 *
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        //Observe como podemos agregar todos los atributos sin ningun tipo de problema
        Person person = pb
                .lives()
                .at("123 London Road")
                .in("London")
                .withPostCode("SW12BC")
                .works()
                .at("Fabrikam")
                .asA("Engineer")
                .earning(123000)
                .build();
        System.out.println(person);
    }

}
