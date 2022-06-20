/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author jose casal
 */
public class RasterRenderer implements Renderer{

    @Override
    public void renderCirle(float radius) {
        System.out.println("Drawing pixels for a circle of radius: "+radius);
    }
    
}
