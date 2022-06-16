/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author jose casal
 */
public interface Filter <T>{
    
    Stream<T> filter(List<T> items, Specification<T> spec);
}
