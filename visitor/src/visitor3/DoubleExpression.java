/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor3;

/**
 *
 * @author jose casal
 */
public class DoubleExpression extends Expression {

    public double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }

}
