/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import dependencyinversion.Person;
import java.util.List;

/**
 *
 * @author jose casal
 */
public interface RelationshipBrowser {
    
    List<Person> findAllChildrenOf(String name);
}
