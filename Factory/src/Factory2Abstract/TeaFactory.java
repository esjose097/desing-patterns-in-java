/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2Abstract;

/**
 *
 * @author jose casal
 */
public class TeaFactory implements IHotDrinkFactory{

    @Override
    public IHotDrink prepare(int amount) {
        System.out.println("Put in tea bag boild water, pour" + amount +
                "ml, add lemon, enjoy!");
        return new Tea();
    }
    
    
    
}
