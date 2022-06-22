/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor3;

/**
 *
 * @author jose casal
 */
abstract class Expression {

    public abstract void accept(ExpressionVisitor visitor);
}
