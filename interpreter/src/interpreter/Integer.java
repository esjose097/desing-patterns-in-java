/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpreter;

/**
 *
 * @author jose casal
 */
public class Integer implements Element{

    private int value;

    public Integer(int value) {
        this.value = value;
    }
    
    @Override
    public int eval() {
        return value;
    }
    
}
