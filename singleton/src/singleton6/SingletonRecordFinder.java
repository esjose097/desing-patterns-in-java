/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton6;

import java.util.List;

/**
 *
 * @author jose casal
 */
public class SingletonRecordFinder {
    public int getTotalPopulation(List<String> names){
        int results = 0;
        for(String name : names)
        {
            results += SingletonDataBase.getInstance().getPopulation(name);
        }
        return results;
    }
}
