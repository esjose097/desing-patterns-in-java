/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package open.close;

import Interfaces.Filter;
import Interfaces.Specification;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author jose casal
 */
public class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return  items.stream().filter(p -> spec.isSatisfied(p));
    }
    
}
