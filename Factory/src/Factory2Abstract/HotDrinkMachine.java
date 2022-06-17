/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2Abstract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javafx.util.Pair;
import org.reflections.Reflections;

/**
 *
 * @author jose casal
 */
public class HotDrinkMachine {

    private Map<AvailableDrink, IHotDrinkFactory> factories
            = new HashMap<>();

    private List<Pair<String, IHotDrinkFactory>> namedFactories
            = new ArrayList<>();

    public HotDrinkMachine() throws Exception {
        // option 1: use an enum
        for (AvailableDrink drink : AvailableDrink.values()) {
            String s = drink.toString();
            String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            Class<?> factory = Class.forName("com.activemesa.creational.factories." + factoryName + "Factory");
            factories.put(drink, (IHotDrinkFactory) factory.getDeclaredConstructor().newInstance());
        }

        // option 2: find all implementors of IHotDrinkFactory
        Set<Class<? extends IHotDrinkFactory>> types
                = new Reflections("com.activemesa.creational.factories") // ""
                        .getSubTypesOf(IHotDrinkFactory.class);
        for (Class<? extends IHotDrinkFactory> type : types) {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }

    }

    public IHotDrink makeDrink() throws IOException {
        System.out.println("Available drinks");
        for (int index = 0; index < namedFactories.size(); ++index) {
            Pair<String, IHotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getValue());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i, amount;
            if ((s = reader.readLine()) != null
                    && (i = Integer.parseInt(s)) >= 0
                    && i < namedFactories.size()) {
                System.out.println("Specify amount: ");
                s = reader.readLine();
                if (s != null
                        && (amount = Integer.parseInt(s)) > 0) {
                    return namedFactories.get(i).getValue().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }

    public IHotDrink makeDrink(AvailableDrink drink, int amount) {
        return ((IHotDrinkFactory) factories.get(drink)).prepare(amount);
    }

    public enum AvailableDrink {
        COFFEE, TEA
    }
}
