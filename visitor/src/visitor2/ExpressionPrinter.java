/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor2;

/**
 *
 * @author jose casal
 */
public class ExpressionPrinter {

    public static void print(Expression e, StringBuilder sb) {
        if (e.getClass() == DoubleExpression.class) {
            sb.append(((DoubleExpression) e).value);
        } else if (e.getClass() == AdditionExpression.class) {
            AdditionExpression ae = (AdditionExpression) e;
            sb.append("(");
            print(ae.left, sb);
            sb.append("+");
            print(ae.right, sb);
            sb.append(")");
        }
    }

}
