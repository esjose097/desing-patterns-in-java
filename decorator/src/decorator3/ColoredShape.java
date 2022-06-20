/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator3;

import java.util.function.Supplier;

/**
 *
 * @author jose casal
 */
public class ColoredShape<T extends Shape> implements Shape {

    private Shape shape;
    private String color;

    public ColoredShape(Supplier<? extends T> ctor, String color) {
        shape = ctor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape + " has the color " + color;
    }

}
