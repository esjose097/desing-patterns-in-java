/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy2;

/**
 *
 * @author jose casal
 */
public class Creature {

    private Property<Integer> agility = new Property<>(10);

    public void setAgility(Integer value) {
        // we cannot do agility = value, sadly
        agility.setValue(value);
    }

    public Integer getAgility() {
        return agility.getValue();
    }

}
