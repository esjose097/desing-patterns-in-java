/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Observer1;

/**
 *
 * @author jose casal
 */
public interface Observer<T> {

    void handle(PropertyChangedEventArgs<T> args);
}
