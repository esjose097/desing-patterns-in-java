/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liskovsubstitution;

/**
 * Este es un ejemplo de el tercer principio SOLID
 * Liskov Substitution 
 * @author jose casal
 */
public class LiskovSubstitution {

    static void useIt(Rectangle r)
    {
      int width = r.getWidth();
      r.setHeight(10);
      System.out.println("Expected area of " + (width*10) + ", got " + r.getArea());
    }
  
    public static void main(String[] args) {        
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);
        Rectangle sq = new square();
        sq.setHeight(5);
        sq.setWidth(10);
        useIt(sq);

    }
    
}
