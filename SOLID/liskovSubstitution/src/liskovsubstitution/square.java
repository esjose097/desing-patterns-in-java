/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liskovsubstitution;

/**
 *
 * @author jose casal
 */
public class square extends Rectangle{

    public square(){}
    
    public square(int size) {        
        width = height = size;
    }
    
    @Override
    public void setWidth(int width) {
      super.setWidth(width);
      super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
      super.setHeight(height);
      super.setWidth(height);    
    }
    
    
}
