/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor4;

/**
 *
 * @author jose casal
 */
public class ExpressionPrinter implements DoubleExpressionVisitor, AdditionExpressionVisitor {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(DoubleExpression obj) {
        sb.append(obj.value);
    }

    @Override
    public void visit(AdditionExpression obj) {
        sb.append('(');
        obj.left.accept(this);
        sb.append('+');
        obj.right.accept(this);
        sb.append(')');
    }

    @Override
    public String toString() {
        return sb.toString();
    }

}
