/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Builder3Herencia;

/**
 * Implementación del patrón de diseño "Builder" con herencia y genericos.
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    EmployeeBuilder eb = new EmployeeBuilder()
      .withName("José")
      .worksAs("Fullstack developer");
    System.out.println(eb.build());

    }
    
}
