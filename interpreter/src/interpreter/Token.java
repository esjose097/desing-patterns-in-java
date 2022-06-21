/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpreter;

/**
 *
 * @author jose casal
 */
public class Token {
    public enum Type{
        INTEGER,
        PLUS,
        MINUS,
        LPAREN,
        RPAREN
    }
    public Type type;
    public String text; 

    public Token(Type type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return "`"+text+"`";
    }
    
    
}
