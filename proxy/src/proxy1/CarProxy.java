/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy1;

/**
 *
 * @author jose casal
 */
public class CarProxy extends Car {

    private Driver driver;

    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (driver.age >= 17) {
            super.drive();
        } else {
            System.out.println("Driver too young");
        }
    }

}
