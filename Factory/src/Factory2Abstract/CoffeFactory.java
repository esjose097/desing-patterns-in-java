/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2Abstract;

/**
 *
 * @author jose casal
 */
public class CoffeFactory implements IHotDrinkFactory{

    @Override
    public IHotDrink prepare(int amount) {
        System.out.println("Grind some beans, boil water, pour" + amount +
                "ml, add cream and sugar, enjoy!");
        return new Coffe();
    }
    
    
    
}
