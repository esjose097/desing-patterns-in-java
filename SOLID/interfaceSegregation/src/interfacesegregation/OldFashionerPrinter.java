/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesegregation;

import Interfaces.Machine;

/**
 * Pero si tuvieramos una maquina vieja que no puede escanear ni enviar fax.
 * @author jose casal
 */
public class OldFashionerPrinter implements Machine{
    /*omo se puede apreciar algunos de los métodos de la interfaz quedan no podrian
    realizar su debida acción por lo cual quedarian inutiles, ese es el principio
    de "Interface segregation.*/
    @Override
    public void print(Document d) {
        //Aquí pordia imprimir
    }

    @Override
    public void fax(Document d) {
        //Pero aquí no podria hacer nada
    }

    @Override
    public void scan(Document d) {
        //E igual que aquí.
    }
    
}
