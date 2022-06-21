package interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejemplo de implementación del patrón de diseño: Interpreter".
 * @author jose casal
 */
public class Demo {

    static List<Token> lex(String input) {
        ArrayList<Token> results = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '+':
                    results.add(new Token(Token.Type.PLUS, "+"));
                    break;
                case '-':
                    results.add(new Token(Token.Type.MINUS, "-"));
                    break;
                case '(':
                    results.add(new Token(Token.Type.LPAREN, "("));
                    break;
                case ')':
                    results.add(new Token(Token.Type.RPAREN, ")"));
                    break;
                default:
                    StringBuilder sb = new StringBuilder("" + input.charAt(i));
                    for (int j = i + 1; j < input.length(); j++) {
                        if (Character.isDigit(input.charAt(j))) {
                            sb.append(input.charAt(j));
                            i++;
                        } else {
                            results.add(new Token(Token.Type.INTEGER, sb.toString()));
                        }
                    }
                    break;
            }
        }
        return results;
    }
    
    static Element parse(List<Token> tokens){
        BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false;
        
        for(int i = 0; i < tokens.size(); i++)
        {
            Token token = tokens.get(i);
            
            switch(token.type)
            {
                case INTEGER:
                    Integer integer = new Integer(java.lang.Integer.parseInt(token.toString()));
                    if(!haveLHS)
                    {
                        result.left = integer;
                        haveLHS = true;                        
                    }
                    else
                    {
                        result.right = integer;
                    }
                    break;
                case PLUS:
                    result.type = BinaryOperation.Type.ADDITION;
                    break;
                    
                case MINUS:
                    result.type = BinaryOperation.Type.SUBTRACTION;
                    break;
                case LPAREN:                    
                    for(int j = 0; j< tokens.size(); j++)
                    {
                        if(tokens.get(j).type == Token.Type.RPAREN)
                        {
                            break;
                        }
                        List<Token> subexpression = tokens.stream()
                                .skip(i+1)
                                .limit(j-i-1)
                                .collect(Collectors.toList());
                        Element element = parse(subexpression);
                        if(!haveLHS)
                        {
                            result.left = element;
                            haveLHS = true;
                        }
                        else{
                            result.right = element;
                            i = j;
                            break;
                        }
                    }                                 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "(13+4)-(12+1)";
        List<Token> tokens = lex(input);
        System.out.println(tokens.stream().map(t -> t.toString()).collect(Collectors.joining("\t")));
        
        Element parsed = parse(tokens);
        System.out.println(input + " = " + parsed.eval());
    }

}
