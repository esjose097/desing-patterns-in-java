/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor4;

/**
 *
 * @author jose casal
 */
abstract class Expression {
    // optional

    public void accept(Visitor visitor) {
        if (visitor instanceof ExpressionVisitor) {
            ((ExpressionVisitor) visitor).visit(this);
        }
    }

}
