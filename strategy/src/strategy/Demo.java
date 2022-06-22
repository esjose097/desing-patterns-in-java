/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;

import java.util.List;

/**
 * Ejemplo de implementación del patrón de diseño: "Strategy" en su versión
 * dínamica.
 * @author jose casal
 */
public class Demo {
    public static void main(String[] args) {
        TextProcessor<MarkdownListStrategy> tp = new TextProcessor<>(
                MarkdownListStrategy::new);
        
        /*Una vez mas problemas de dependencias sigo sin recordar cual era el Jar 
        para el list.of() pero se puede solucionar instanciando una lista y agragandole los datos por separado
        pero soy un flojo jajaja.*/
        tp.appendList(List.of("liberte", "egalite", "fraternite"));
        System.out.println(tp);

        TextProcessor<HtmlListStrategy> tp2 = new TextProcessor<>(HtmlListStrategy::new);
        tp2.appendList(List.of("inheritance", "encapsulation", "polymorphism"));
        System.out.println(tp2);

    }

}
