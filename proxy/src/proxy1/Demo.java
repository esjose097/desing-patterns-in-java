/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxy1;

/**
 * Ejemplo de la implementación del patrón: "Proxy" en su versión "Protection"
 *
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drivable car = new CarProxy(new Driver(12)); // 22
        car.drive();
    }

}
