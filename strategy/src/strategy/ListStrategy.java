/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package strategy;

/**
 *
 * @author jose casal
 */
public interface ListStrategy {

    default void start(StringBuilder sb) {
    }

    void addListItem(StringBuilder stringBuilder, String item);

    default void end(StringBuilder sb) {
    }

}
