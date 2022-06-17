/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jose casal
 */
public class HtmlElement {
    //Los dejo publicos para evitarme los setters and getters ya que es solo explicativo.
    public String name;
    public  String text;
    public  ArrayList<HtmlElement> elements = new ArrayList<>();
    
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String toStringImpl(int indent){
    StringBuilder sb = new StringBuilder();
    String i = String.join("", Collections.nCopies(indent * indentSize, " "));
    sb.append(String.format("%s<%s>%s", i, name, newLine));
    if (text != null && !text.isEmpty())
    {
      sb.append(String.join("", Collections.nCopies(indentSize*(indent+1), " ")))
        .append(text)
        .append(newLine);
    }

    for (HtmlElement e : elements)
      sb.append(e.toStringImpl(indent + 1));

    sb.append(String.format("%s</%s>%s", i, name, newLine));
    return sb.toString();        
    }
    
    @Override
    public String toString() {
        return toStringImpl(0);
    }
    
    
}
