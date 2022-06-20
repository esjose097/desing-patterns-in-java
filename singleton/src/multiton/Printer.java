/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiton;

import java.util.HashMap;

/**
 *
 * @author jose casal
 */
public class Printer {
    
    private static int instanceCount = 0;
    private static HashMap<Subsystems,Printer> instances = new HashMap<>();    
    
    private Printer(){        
        this.instanceCount ++;
        System.out.println("A total of: " + instanceCount + " instances created so far.");
    }        
    
    public static Printer get(Subsystems ss){
        if(instances.containsKey(ss))
        {
            return instances.get(ss);
        }
        Printer instance = new Printer();
        instances.put(ss, instance);
        return instance;
    }
}
