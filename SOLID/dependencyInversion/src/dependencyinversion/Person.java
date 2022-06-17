/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinversion;

/**
 * Representa una persona
 * @author jose casal
 */
public class Person {
    //Lo deje publico porque como lo usare despues me daba weba estar llamando al get todo el tiempo.
    public String name;

    public Person(String name) {
        this.name = name;
    }       
}
