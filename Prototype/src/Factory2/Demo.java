/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory2;

import org.apache.commons.lang3.SerializationUtils;

/**
 * La diferencia es que este implementa "Serializable por lo cual se puede ahorrar
 * los constructores copia.
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Foo foo = new Foo(42, "life");
        Foo foo2 = SerializationUtils.roundtrip(foo);
        
        foo2.whatever="xyz";
        
        System.out.println(foo);
        System.out.println(foo2);
    }
    
}
