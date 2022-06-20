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
public class Test {
   
    @Test
    public void singletonPopulationTest(){
        SingletonRecordFinder rf = new SingletonRecordFinder();
        List<String> names = List.of("seoul", "Mexico City");
        int tp = rf.getTotalPopulation(names);
        assertEquals(1750000+1740000, tp);
    }
}
