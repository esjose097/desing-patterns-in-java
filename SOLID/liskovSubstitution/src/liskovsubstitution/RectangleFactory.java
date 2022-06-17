/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liskovsubstitution;

/**
 * Esta es una manera mas optima de solucionar el problema.
 * @author jose casal
 */
public class RectangleFactory {
    
    public static Rectangle newSquare(int side)
      {
        return new Rectangle(side, side);
      }

      public static Rectangle newRectangle(int width, int height)
      {
        return new Rectangle(width, height);
      }    
}
