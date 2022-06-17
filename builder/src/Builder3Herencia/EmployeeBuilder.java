/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder3Herencia;

/**
 * Builder de empleados que simplemente es un objeto "Person" con el atributo
 * emple no nulo.
 * @author jose casal
 */
public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{
    
    public EmployeeBuilder worksAs(String position){
        person.position = position;
        return this;
    }
    
    @Override
    protected EmployeeBuilder self(){
        return this;
    }
}
