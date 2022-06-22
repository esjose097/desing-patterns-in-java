/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose casal
 */
public class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    protected void propertyChanged(T source,
            String propertyName,
            Object newValue) {
        for (Observer<T> o : observers) {
            o.handle(new PropertyChangedEventArgs<T>(
                    source, propertyName, newValue
            ));
        }
    }

}
