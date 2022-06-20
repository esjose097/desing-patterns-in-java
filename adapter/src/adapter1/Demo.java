/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author jose casal
 */
public class Demo {

    
    private final static List<VectorObject> vectorObjects = 
            new ArrayList<>(Arrays.asList(
            new VectorRectangle(1, 1, 10, 10),
                    new VectorRectangle(3, 3, 6, 6)));
    
    public static void drawPoint(Point P){
        System.out.println(".");
    }
    
    public static void draw(){
        for(VectorObject vo : vectorObjects)
        {
            for(Line line : vo)
            {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(Demo::drawPoint);
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
       draw();
    }
    
}
