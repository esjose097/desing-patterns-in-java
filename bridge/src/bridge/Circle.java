/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author jose casal
 */
public class Circle extends Shape{

    public float radius;
    
    public Circle(Renderer renderer){
        super(renderer);
    }
    
    public Circle(Renderer renderer, float radius){
        super(renderer);
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        renderer.renderCirle(radius);
    }

    @Override
    public void resize(float factor) {
        radius *= factor;
    }
    
}
