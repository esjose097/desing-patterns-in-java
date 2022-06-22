/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer2;

/**
 *
 * @author jose casal
 */
public class Person {

    public Event<PropertyChangedEventArgs> propertyChanged = new Event<>();

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age == age) {
            return;
        }

        boolean oldCanVote = getCanVote();

        this.age = age;
        propertyChanged.fire(new PropertyChangedEventArgs(
                this, "age"
        ));

        if (oldCanVote != getCanVote()) {
            propertyChanged.fire(new PropertyChangedEventArgs(
                    this, "canVote"
            ));
        }
    }

    public boolean getCanVote() {
        return age >= 18;
    }

}
