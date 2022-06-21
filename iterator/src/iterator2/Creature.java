/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 *
 * @author jose casal
 */
public class Creature implements Iterable<Integer> {

    private int[] stats = new int[3];

    private final int str = 0;

    public int getStrength() {
        return stats[str];
    }

    public void setStrength(int value) {
        stats[str] = value;
    }

    public int getAgility() {
        return stats[1];
    }

    public void setAgility(int value) {
        stats[1] = value;
    }

    public int getIntelligence() {
        return stats[2];
    }

    public void setIntelligence(int value) {
        stats[2] = value;
    }

    public int sum() {
        return IntStream.of(stats).sum();
    }

    public int max() {
        return IntStream.of(stats).max().getAsInt();
    }

    public double average() {
        return IntStream.of(stats).average().getAsDouble();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for (int x : stats) {
            action.accept(x);
        }
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Arrays.spliterator(stats);
    }

    @Override
    public Iterator<Integer> iterator() {
        return IntStream.of(stats).iterator();
    }

}
