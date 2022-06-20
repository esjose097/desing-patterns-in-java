/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton2;

/**
 * Una variación del singleton pero con bloques estaticos
 *
 * @author jose casal
 */
public class staticBlockSingleton {

    private static staticBlockSingleton instance;

    private staticBlockSingleton() {
    }

    public static staticBlockSingleton getInstance() {
        return instance;
    }
    
    /**
     * La unica diferencia entre esta variación y la basica es que esta tiene un bloque
     * estatico donde se ejecutan las cosas de así de esta manera puede lanzar excepciones en caso de fallo.
     */
    static {
        try 
        {
            instance = new staticBlockSingleton();
        } 
        catch (Exception e) {
            System.err.println("Failed to created singleton!");
        }
    }
}
