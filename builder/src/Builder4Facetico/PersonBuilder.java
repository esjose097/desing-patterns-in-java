/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder4Facetico;

/**
 * Builder de personas.
 *
 * @author jose casal
 */
public class PersonBuilder {

    protected Person person = new Person();

    /**
     * Devuelve una instancia de contructor de personas con direccion
     * @return 
     */
    public PersonAdressBuilder lives() {
        return new PersonAdressBuilder(person);
    }
    /**
     * Devuelve una instancia de contructor de personas con empleo.
     * @return 
     */
    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    /**
     * Regresa una intancia vacía del objeto.
     * @return
     */
    public Person build() {
        return this.person;
    }
}
