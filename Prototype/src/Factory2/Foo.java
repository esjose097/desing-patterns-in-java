/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

import java.io.Serializable;

/**
 * Si se implementa serializable, no es necesario hacer constructores copia.
 * @author jose casal
 */
public class Foo implements Serializable{
    public int stuff;
    public String whatever;

    public Foo(int stuff, String whatever) {
        this.stuff = stuff;
        this.whatever = whatever;
    }

    @Override
    public String toString() {
        return "Foo{" + "stuff=" + stuff + ", whatever=" + whatever + '}';
    }
    
    
}
