/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton3;

/**
 * Una variación diferente del singleton.
 * @author jose casal
 */
public class LazySingleton {
    private static LazySingleton instance;

    public LazySingleton() {
    }

    /*Esta variación simplemente se diferencia por primero comprobar que se esta enviando
    un objeto con datos y no un nulo.
    */
    public static synchronized LazySingleton getInstance(){
        if(instance == null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }
}
