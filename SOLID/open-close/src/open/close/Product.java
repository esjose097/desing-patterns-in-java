package open.close;

import Enums.Color;
import Enums.Size;

/**
 * Clase que representa un producto.
 * @author jose casal
 */
public class Product {
    private String name;
    private Color color;
    private Size size;
    
    public Product(String name, Color color, Size size){
        this.name = name;
        this.color = color;
        this. size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
      
}
