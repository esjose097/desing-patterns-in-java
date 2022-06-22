/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package visitor4;

/**
 *
 * @author jose casal
 */
public interface ExpressionVisitor extends Visitor {

    void visit(Expression obj);
}
