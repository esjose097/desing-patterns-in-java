/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author jose casal
 */
public abstract class Shape {
    protected Renderer renderer;
    public Shape(Renderer renderer){
        this.renderer = renderer;
    }
    
    public abstract void draw();
    public abstract void resize(float factor);
}
