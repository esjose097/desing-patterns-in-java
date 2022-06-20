/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton6;

import com.google.common.collect.Iterables;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Teoricamente este es un ejemplo mas real del uso de singleton.
 *
 * @author jose casal
 */
public class SingletonDataBase {

    private Dictionary<String, Integer> capitals = new Hashtable<>();
    private static int instanceCount = 0;

    public static int getCount() {
        return instanceCount;
    }

    private SingletonDataBase() {
        instanceCount++;
        System.out.println("Initializing database");
        try {
            File f = new File(
                    SingletonDataBase.class.getProtectionDomain().getCodeSource()
                            .getLocation().getPath());
            Path fullPath = Paths.get(f.getPath(), "capitals.txt");

            List<String> lines = Files.readAllLines(fullPath);

            Iterables.partition(lines, 2).forEach(kv -> capitals.put(kv.get(0).trim(),
                    Integer.parseInt(kv.get(1))));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final SingletonDataBase INSTANCE = new SingletonDataBase();

    public static SingletonDataBase getInstance() {
        return INSTANCE;
    }
    
    public int getPopulation(String name){
        return capitals.get(name);
    }
}
