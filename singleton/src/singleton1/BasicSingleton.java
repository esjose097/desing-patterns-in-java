/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton1;

/**
 * Ejemplo básico del patrón de diseño singleton.
 * @author jose casal
 */
public class BasicSingleton {
    private static final BasicSingleton INSTANCE = new BasicSingleton();
    private int value = 0;    
    
    private BasicSingleton(){
        
    }

    public static BasicSingleton getINSTANCE() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }    
}
