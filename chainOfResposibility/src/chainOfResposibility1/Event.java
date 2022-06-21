/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainOfResposibility1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 *
 * @author jose casal
 */
public class Event<TArgs> {
//  private List<Consumer<TArgs>> handlers
//    = new ArrayList<>();

    private int index = 0;
    private Map<Integer, Consumer<TArgs>> handlers = new HashMap<>();

    public int subscribe(Consumer<TArgs> handler) {
        //handlers.add(handler);
        int i = index;
        handlers.put(index++, handler);
        return i;
    }

    public void unsubscribe(int key) {
        handlers.remove(key);
    }

    public void fire(TArgs args) {
        for (Consumer<TArgs> handler : handlers.values()) {
            handler.accept(args);
        }
    }

}
