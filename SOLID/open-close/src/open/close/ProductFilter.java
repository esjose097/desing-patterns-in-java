/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package open.close;

import Enums.Color;
import Enums.Size;
import java.util.List;
import java.util.stream.Stream;
import static javafx.scene.paint.Color.color;

/**
 * Clase encargada de filtrar productos.
 * @author jose casal
 */
public class ProductFilter {
    
    /**
     * Este es un buen ejemplo de como un código puede seguir el principio
     * Open - close puesto que esta abierto a extensiones de comportamiento
     * y cerrado a cambios siempre y cuando se tengan 2 criterios el problema
     * que si por ejemplo tuvieramos 7 criterios habría 7 métodos.
     */
    
    /**
     * Método encargado de filtrar productos por color.
     * @param list <-- Lista a filtrar.
     * @param color <-- Color
     * @return  Lista filtrada.
     */
    public Stream<Product> filterByColor(List<Product> list, Color color){
        return list.stream().filter(p -> p.getColor() == color);
    }
    
    /**
     * Método encargado de filtrar productos por tamaño.
     * @param list <-- Lista a filtrar
     * @param size <-- Tamaño
     * @return Lista filtrada
     */
    public Stream<Product> filterBySize(List<Product> list, Size size){
        return list.stream().filter(p -> p.getSize() == size);
    }    
    
    /**
     * Método encargado de filtrar productos por color y tamaño.
     * @param list <-- Lista a filtrar
     * @param size <-- Tamaño
     * @param color <-- Color
     * @return Lista filtrada
     */
    public Stream<Product> filterBySizeAndColor(List<Product> list, Size size, Color color){
        return list.stream().filter(p -> p.getSize() == size && p.getColor() == color);
    }    
}
