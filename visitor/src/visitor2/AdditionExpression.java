/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor2;

/**
 *
 * @author jose casal
 */
public class AdditionExpression extends Expression{

    public Expression left, right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
