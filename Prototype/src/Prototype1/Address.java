/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype1;

/**
 *
 * @author jose casal
 */
public class Address {
    public String streetAdress, city, country;

    public Address(String streetAdress, String city, String country) {
        this.streetAdress = streetAdress;
        this.city = city;
        this.country = country;
    }
    /**
     * Esto es un contructor copia.
     * @param other 
     */
    public Address(Address other){
        this(other.streetAdress, other.city, other.country);
    }

    @Override
    public String toString() {
        return "Adress{" + "streetAdress=" + streetAdress + ", city=" + city + ", country=" + country + '}';
    }

    
}
