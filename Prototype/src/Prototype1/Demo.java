/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prototype1;

/**
 * Implementación del patron de diseño "Prototype" este es util cuando necesitamos realizar
 * copias de objetos pero necesitamos copias profundas y no superficiales.
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee john = new Employee("John", new Address("123","London", "uk"));
        
        Employee chris = new Employee(john);
        
        chris.name="Chris";
        System.out.println(john);
        System.out.println(chris);
    }
    
}
