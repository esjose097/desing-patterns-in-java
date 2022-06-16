/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package open.close;

import Enums.Color;
import Enums.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Este es un programa para mostrar una aplicación de segundo principio SOLID
 * Open - Close es decir abierto a extensiones de comportamiento, cerrado a cambios.
 * @author jose casal
 */
public class OpenClose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = new ArrayList();
        products.add(apple);
        products.add(tree);
        products.add(house);
        
/*--------------Ejemplo 1-------------------------------------------------------
        El primer ejemplo si bien si cumple con la necesidad se necesitaria estar agregando
        cada vez mas métodos dentro de la clase para expandir el comportamiento.*/
        ProductFilter pf = new ProductFilter();
        System.out.println("Green products (old):");
        pf.filterByColor(products, Color.GREEN)
          .forEach(p -> System.out.println(" - " + p.getName() + " is green"));
/*--------------Ejemplo 2-------------------------------------------------------
        el segundo ejemplo realiza una extensión de comportamiento sin la necesidad
        de cambiar el código, simplemente jugando con interfaces y herencia.*/
    BetterFilter bf = new BetterFilter();
    System.out.println("Green products (new):");
    bf.filter(products, new ColorSpecification(Color.GREEN))
      .forEach(p -> System.out.println(" - " + p.getName() + " is green"));

    System.out.println("Large products:");
    bf.filter(products, new SizeSpecification(Size.LARGE))
      .forEach(p -> System.out.println(" - " + p.getName() + " is large"));

    System.out.println("Large blue items:");
    bf.filter(products,
      new AndSpecification<>(
        new ColorSpecification(Color.BLUE),
        new SizeSpecification(Size.LARGE)
      ))
      .forEach(p -> System.out.println(" - " + p.getName() + " is large and blue"));
    }
    
}
