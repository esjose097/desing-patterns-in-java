/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import interfacesegregation.Document;

/**
 * Imaginemos que esta interfaz esta hecha para una maquina moderna.
 * @author jose casal
 */
public interface Machine {
    
    void print(Document d);
    
    void fax(Document d);
    
    void scan(Document d);
}
