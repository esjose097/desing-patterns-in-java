/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observer2;

/**
 * Ejemplo de implementación del patrón de diseño: "Observer".
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person();
        Event<PropertyChangedEventArgs>.Subscription sub
                = person.propertyChanged.addHandler(x -> {
                    System.out.println("Person's "
                            + x.propertyName + " has changed");
                });
        person.setAge(17);
        person.setAge(18);
        sub.close();
        person.setAge(19);

    }

}
