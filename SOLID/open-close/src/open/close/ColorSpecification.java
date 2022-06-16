/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package open.close;

import Enums.Color;
import Interfaces.Specification;

/**
 *
 * @author jose casal
 */
public class ColorSpecification implements Specification<Product> {
    private Color color;
    
    public ColorSpecification(Color color){
        this.color = color;
    }
    /**
     * Comprobamos si los colores coinciden
     * @param item
     * @return 
     */
    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == this.color;
    }
    
}
