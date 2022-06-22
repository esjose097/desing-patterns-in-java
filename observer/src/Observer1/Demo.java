/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observer1;

/**
 * Ejemplo de implementación del patrón de diseño "Observer".
 * @author jose casal
 */
public class Demo implements Observer<Person> {

    public Demo() {
        Person person = new Person();
        person.subscribe(this);
        for (int i = 20; i < 24; ++i) {
            person.setAge(i);
        }
    }

    public static void main(String[] args) {
        new Demo();
    }

    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println("Person's " + args.propertyName
                + " has been changed to " + args.newValue);
    }

}
