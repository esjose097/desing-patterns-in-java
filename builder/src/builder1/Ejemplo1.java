/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder1;

/**
 * Ejemplo 1 de la implementación del patrón de diseño "Builder"
 * O es mas bien el concepto del patrón.
 * @author jose casal
 */
public class Ejemplo1 {
    
    public static void main(String[] args) {
        /*Imaginemos que tenemos una rest API donde se deberan enviar mensajes
        como respuesta en formato de HTML5 por lo cual el System.out.println"
        simulara la respuesta*/
        
        String  hello = "hello";
        /*Teoricamente tendriamos que realizar algo así cada vez que queremos
        devolver una respuesta lo cual no es muy productivo si la cantidad de 
        respuestas o peticiones a devolver es muy amplea.*/        
        System.out.println("<p>"+hello+"</p>");
        
        /*Supongamos que nos envian una lista de palabras a devolver*/
        String [] words = {"hello","world"};
        /*Aquí entra el builder el string builder permite crear cadenas
        pieza por pieza y eso es lo que lo diferencia del patron Factory*/
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        /*Creamos un for para agregar las etiquetas y poder empezar a convertirlas en
        etiquetas HTML5*/
        for(String word : words)
        {   //Agregamos la etiqueta a la palabra correspondiente
            sb.append(String.format("  <li>%s</li>\n", word));            
        }
        //Cerramos la lista.
        sb.append("</ul>");
        //Realizamos la impresion
        System.out.println(sb);
        
        
    }    
}
