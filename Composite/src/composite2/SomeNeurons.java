/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package composite2;

/**
 *
 * @author jose casal
 */
public interface SomeNeurons extends Iterable<Neuron> {

    default void connectTo(SomeNeurons other) {
        if (this == other) {
            return;
        }

        for (Neuron from : this) {
            for (Neuron to : other) {
                from.out.add(to);
                to.in.add(from);
            }
        }
    }
}
