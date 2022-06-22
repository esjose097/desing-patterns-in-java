/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitor2;

/**
 * Ejemplo de implementación del patrón de diseño: "Visitor" en su versión:
 * Reflective.
 *
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1+(2+3)
        AdditionExpression e = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                ));
        StringBuilder sb = new StringBuilder();
        ExpressionPrinter.print(e, sb);
        System.out.println(sb);
    }
}
