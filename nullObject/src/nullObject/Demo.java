/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nullObject;

import java.lang.reflect.Proxy;

/**
 * Ejemplo de implementación del patrón de diseño: "Null Object" en su versión
 * dínamica.
 * @author jose casal
 */
public class Demo {

    @SuppressWarnings("unchecked")
    public static <T> T noOp(Class<T> itf) {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[]{itf},
                (proxy, method, args)
                -> {
            if (method.getReturnType().equals(Void.TYPE)) {
                return null;
            } else {
                return method.getReturnType().getConstructor().newInstance();
            }
        });
    }
    public static void main(String[] args) {
        //ConsoleLog log = new ConsoleLog();
        //Log log = null;
        NullLog log = new NullLog();
        BankAccount ba = new BankAccount(log);
        ba.deposit(100);
        ba.withdraw(200);
    }
}
