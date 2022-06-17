/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesegregation;

import Interfaces.Machine;

/**
 * Ahora tenemos una maquina moderna que puede realizar todas las acciones.
 * @author jose casal
 */
public class MultiFuncionPrinter implements Machine{

    @Override
    public void print(Document d) {
        //Aquí imprime
    }

    @Override
    public void fax(Document d) {
        //Aquí realiza un fax
    }

    @Override
    public void scan(Document d) {
        //Aquí hace un escaneo
    }
    
}
