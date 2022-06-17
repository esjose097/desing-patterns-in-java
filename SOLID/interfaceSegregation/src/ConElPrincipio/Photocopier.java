/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConElPrincipio;

import Interfaces.Printer;
import Interfaces.Scanner;
import interfacesegregation.Document;

/**
 * Ahora en el caso de una fotocopiadora tambien se puede imprimir y escanear
 * sin la necesidad de implementar Fax.
 * @author jose casal
 */
public class Photocopier implements Printer, Scanner{

    @Override
    public void print(Document d) {
        //Aquí si se podria
    }

    @Override
    public void scan(Document d) {
        //Aquí si se podria
    }
    
}
