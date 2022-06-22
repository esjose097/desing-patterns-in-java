/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitor3;

/**
 * Ejemplo de implementación del patrón de diseño: "Visitor" en su versión:
 * Classic
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
        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(e);
        System.out.println(ep);

        ExpressionCalculator calc = new ExpressionCalculator();
        calc.visit(e);
        System.out.println(ep + " = " + calc.result);

    }

}
