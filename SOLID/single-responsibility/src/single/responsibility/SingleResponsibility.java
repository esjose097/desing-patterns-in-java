package single.responsibility;

/**
 * Este es solo un programa para mostrar un ejemplo de como funciona o se aplica
 * el principio SOLID : "Single responsibility".
 * 
 * Teniendo una debida división de clases y responsabilidades.
 * @author jose casal
 */
public class SingleResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "c:\\temp\\journal.txt";
        p.saveToFile(j, filename, true);

        // windows!
        Runtime.getRuntime().exec("notepad.exe " + filename);

    }
    
}
