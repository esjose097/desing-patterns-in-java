/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer1;

/**
 *
 * @author jose casal
 */
public class Person extends Observable<Person> {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age == age) {
            return;
        }
        this.age = age;
        propertyChanged(this, "age", age);
    }

}
