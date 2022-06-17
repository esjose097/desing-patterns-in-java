/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype1;

/**
 * Los constructores copia nos ayudan a realizar una copia del objeto profunda.
 * @author jose casal
 */
public class Employee{
    public String name;
    public Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee other){
        name = other.name;
        address = new Address(other.address);
    }
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + '}';
    }
    

    
    
}
