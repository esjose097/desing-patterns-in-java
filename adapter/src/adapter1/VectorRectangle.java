/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter1;

/**
 *
 * @author jose casal
 */
public class VectorRectangle extends VectorObject{
    
    public VectorRectangle(int x, int y, int width, int height){
        add(new Line(new Point(x,y), new Point (x+width, y)));
        add(new Line(new Point(x+width,y), new Point(x+width, y+height)));
        add(new Line(new Point(x,y), new Point(x,y+height)));
        add(new Line(new Point(x,y+height), new Point(x+width, y+height)));
    }
    
}
