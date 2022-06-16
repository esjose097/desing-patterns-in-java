/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package single.responsibility;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;

/**
 * Clase encargada de la persistencia de datos.
 * @author jose casal
 */
public class Persistence {
    
    /**
     * Este método se encarga de persistir un Journal.
     * @param journal <-- Diario a guardar
     * @param filename <-- Ruta del archivo.
     * @param overwrite <-- Booleano que indica si se desea sobreescribir el archivo en caso de que exista.
     * @throws Exception 
     */
    public void saveToFile(Journal journal, String filename, boolean overwrite) throws Exception{
    if (overwrite || new File(filename).exists())
    {
      try (PrintStream out = new PrintStream(filename)) 
      {
        out.println(journal.toString());
      }        
    }
  }
    /**
     * Este método no hace nada nomas es de ejemplo para mostrar un poco mas de la responsabilidad de esta clase
     * @param journal
     * @param filename 
     */
    public void load(Journal journal, String filename) {}
    
    /**
     * Este método no hace nada nomas es de ejemplo para mostrar un poco mas de la responsabilidad de esta clase
     * @param journal
     * @param url 
     */
    public void load(Journal journal, URL url) {}
}
