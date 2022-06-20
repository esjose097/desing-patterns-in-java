/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton4;

/**
 * Una variación del patrón de diseño "Singleton"
 * @author jose casal
 */
public class InnerStaticSingleton {

    public InnerStaticSingleton() {
    }
        
    public InnerStaticSingleton getInstance(){
        return Impl.INSTANCE;
    }
    /*Esta variación corrije problemas de sincronización y garantiza de manera efectiva
    cada vez que se inicialice la instancias que solo se obtentra una de la misma.*/
    private static class Impl{
        private static final InnerStaticSingleton INSTANCE =
                new InnerStaticSingleton();
    }        
}
