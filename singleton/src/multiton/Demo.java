/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiton;

/**
 *
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer main = Printer.get(Subsystems.PRIMARY);
        Printer aux = Printer.get(Subsystems.AUXILIARY);
        Printer aux2 = Printer.get(Subsystems.AUXILIARY);
    }
    
}
