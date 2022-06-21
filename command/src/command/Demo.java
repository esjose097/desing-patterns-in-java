/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package command;

import java.util.List;

/**
 * Este es un ejemplo de implementación del patrón de diseño "Command". 
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println();
        
        /*Aquí tuve un pequeño problema de dependencias, no recuerdo cual es la dependencia que se utiliza para el
        List.of, no la encontré pero a ver si otro dia la encuentro jaja, igual pueden solo instancear
        la lista y agregarle dos "bankAccountCommand" pero soy un flojo*/
        List<BankAccountCommand> commands = 
                List.of( new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1000));
        
        for(BankAccountCommand c : commands)
        {
            c.call();
            System.out.println(ba);
        }
    }
    
}
