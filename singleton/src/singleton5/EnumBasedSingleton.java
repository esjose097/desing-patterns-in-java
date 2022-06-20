/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package singleton5;

/**
 * Esta variación puede ser utilizada siempre y cuando no se necesite de ningun
 * estado para hacer la persistencia.
 * @author jose casal
 */
public enum EnumBasedSingleton {
    INSTANCE;
    
    EnumBasedSingleton(){
        value = 42;
    }
    
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
}
