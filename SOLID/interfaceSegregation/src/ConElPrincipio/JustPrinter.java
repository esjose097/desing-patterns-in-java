/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConElPrincipio;

import Interfaces.Printer;
import interfacesegregation.Document;

/**
 * Ahora tenemos una impresora vieja que solo puede imprimir.
 * @author jose casal
 */
public class JustPrinter implements Printer{

    @Override
    public void print(Document d) {
        //Podria realizar su acción sin necesidad de los demas métodos que no se utilizan.
    }
    
}
