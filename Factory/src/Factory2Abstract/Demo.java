/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory2Abstract;

/**
 * Implementación de del patron Factory pero abstracto, es muy raro utilizar este patron
 * de esta manera, pero queda como ejemplo.
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        IHotDrink tea = machine.makeDrink(HotDrinkMachine.AvailableDrink.TEA, 200);
        tea.consume();

        // interactive
        IHotDrink drink = machine.makeDrink();
        drink.consume();

    }

}
