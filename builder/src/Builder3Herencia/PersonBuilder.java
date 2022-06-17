/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder3Herencia;

/**
 * Builder de personas.
 * @author jose casal
 */
public class PersonBuilder<SELF extends PersonBuilder <SELF>> {
    protected Person person = new Person();
    
    /**
     * Crea instancias de personas con nombre
     * @param name <-- Nombre de la persona
     * @return  <-- Una instancia del mismo PersonBuilder
     */
    public SELF withName(String name){
        this.person.name = name;
        return self();
    }
    /**
     * Este método devuelve una instancia de la misma clase pero casteada,
     * no es necesario pero ayuda a no escribir código extra.
     * @return 
     */
    protected SELF self(){
        return (SELF) this;
    }
    /**
     * Crea una instancia de persona vacía.
     * @return Persona
     */
    public Person build(){
        return person;
    }
}
