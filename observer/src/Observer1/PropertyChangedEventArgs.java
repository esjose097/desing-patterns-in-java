package Observer1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jose casal
 */
public class PropertyChangedEventArgs<T> {

    public T source;
    public String propertyName;
    public Object newValue;

    public PropertyChangedEventArgs(T source, String propertyName,
            Object newValue) {
        this.source = source;
        this.propertyName = propertyName;
        this.newValue = newValue;
    }
}
