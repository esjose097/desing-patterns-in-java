/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dependencyinversion;

/**
 * Ejemplo de la implementación del 5to principio SOLID: Dependency inversion
 * Este trata de que los modulos de alto nivel no deben depender de los módulos
 * de bajo nivel.
 * @author jose casal
 */
public class DependencyInversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        // Modulo de bajo nivel       
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);

    }

}
