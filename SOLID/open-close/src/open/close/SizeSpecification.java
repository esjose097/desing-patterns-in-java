/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package open.close;

import Enums.Size;
import Interfaces.Specification;

/**
 *
 * @author jose casal
 */
public class SizeSpecification implements Specification<Product> {
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }
    
    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == this.size;
    }
    
}
