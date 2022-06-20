/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton1;

/**
 *
 * @author jose casal
 */
public class Demo {

    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getINSTANCE();
        singleton.setValue(9);
        System.out.println(singleton.getValue());
    }
    
}
