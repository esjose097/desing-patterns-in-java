/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator2;

import io.reactivex.observable.Observable;
import io.reactivex.observable.Observer;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author jose casal
 */
public class EventBroker extends Observable<Integer> {

    private List<Observer<? super Integer>> observers = new ArrayList<>();

    @Override
    protected void subscribeActual(Observer<? super Integer> observer) {
        observers.add(observer);
    }

    public void publish(int n) {
        for (Observer<? super Integer> o : observers) {
            o.onNext(n);
        }
    }

}
