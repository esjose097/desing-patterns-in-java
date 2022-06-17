/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder2;

/**
 * Builder del patron de diseño Builder
 * Clase encargada de hacer elementos html
 * @author jose casal
 */
public class HtmlBuilder {
    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;       
    }
    /**
     * Método encargado de agregar un elemento html a un padre.
     * @param childName <-- Nombre del elemento tipo "p" o "li", etc.
     * @param childText <-- Contenido que quiere que vaya dentro de las etiquetas.
     * @return 
     */
    public HtmlBuilder addChild(String childName, String childText){
        
        HtmlElement e = new HtmlElement(childName, childText);        
        this.root.elements.add(e);
        return this;
    }
    /**
     * Método encargado de reiniciar el "root" como nuevo.
     */
    public void clear(){
        this.root = new HtmlElement();
        this.root.name = this.rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }
    
    
    
    
    
    
}
