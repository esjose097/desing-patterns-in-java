/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder4Facetico;

/**
 *
 * @author jose casal
 */
public class PersonAdressBuilder extends PersonBuilder{

    public PersonAdressBuilder(Person person) {
        this.person = person;
    }
    /**
     * Crea una instancia de Person con el astreedAdress asignado
     * @param street <-- Calle de la persona
     * @return instancia de la misma clase.
     */
    public PersonAdressBuilder at(String street){
        person.streedAdress = street;
        return this;
    }
    
    /**
     * Crea una instancia de Person con el postCode asignado
     * @param code <-- codigo postal
     * @return instancia de la la misma clase
     */
    public PersonAdressBuilder withPostCode(String code){
        person.postCode = code;
        return this;
    }    
    /**
     * Crea una instancia de Person con el City asignado
     * @param city <-- CIudad
     * @return instancia de la misma clase
     */
    public PersonAdressBuilder in(String city){
        person.city = city;
        return this;
    }    
    
}
