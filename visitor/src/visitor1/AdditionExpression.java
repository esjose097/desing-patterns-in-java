/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor1;

/**
 *
 * @author jose casal
 */
public class AdditionExpression extends Expression {

    private Expression left, right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void print(StringBuilder sb) {
        sb.append("(");
        left.print(sb);
        sb.append("+");
        right.print(sb);
        sb.append(")");
    }

}
