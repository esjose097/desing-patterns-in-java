/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinversion;

import Enums.Relationship;
import Interfaces.RelationshipBrowser;
import java.util.ArrayList;
import org.javatuples.Triplet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Clase que representa relaciones.
 *
 * @author jose casal
 */
public class Relationships implements RelationshipBrowser {
    
    /*Cabe decir que necesitan la Libreria "Triplet" para probar esto ya que simula una tupla
    Link: http://www.java2s.com/Code/Jar/j/Downloadjavatuples12jar.htm*/
    private List<Triplet<Person, Relationship, Person>> relations
            = new ArrayList<>();
    
    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream()
                .filter(x -> Objects.equals(x.getValue0().name, name)
                && x.getValue1() == Relationship.PARENT)
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

}
