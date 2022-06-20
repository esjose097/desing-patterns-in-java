package composite1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Ejemplo de implemenatación del patrón composite
 * @author jose casal
 */
public class GraphicObject {
    protected String name = "Group";
    public String color;
    public List<GraphicObject> children = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private void print(StringBuilder stringBuilder, int depth){
        stringBuilder.append(String.join("",Collections.nCopies(depth,"*")))
                .append(depth > 0 ? " " : "")
                .append((color == null|| color.isEmpty()) ? "" : color + " ")
                .append(getName())
                .append(System.lineSeparator());
        for(GraphicObject child : children)
        {
            child.print(stringBuilder, depth+1);
        }
    }

    public GraphicObject() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb,0);
        return sb.toString();
        
    }   
}
