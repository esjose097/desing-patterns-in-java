/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpreter;

/**
 *
 * @author jose casal
 */
public class BinaryOperation implements Element{

    public Type type;
    public Element left, right;
    
    public enum Type{
        ADDITION,
        SUBTRACTION
    }
    
    @Override
    public int eval() {
        switch(type)
        {
            case ADDITION:
                return left.eval() + right.eval();
                
            case SUBTRACTION:
                return left.eval() - right.eval();
            
            default:
                return 0;
        }
    }
    
}
