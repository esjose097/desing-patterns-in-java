package single.responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de guardar notas en un diario.
 * @author jose casal
 */
public class Journal {
  /**
   * Lista para las notas del diario.
   */
  private final List<String> entries = new ArrayList<>();
  
  /**
   * Cantidad de notas en el diario
   */
  private static int count = 0;

  /**
   * Agrega una nueva nota en el diario.
   * @param text <-- Nota a guardar.
   */
  public void addEntry(String text)
  {
    entries.add("" + (++count) + ": " + text);
  }
  
  /**
   * Elimina una nota del diario en base a su index.
   * @param index <-- Index de la nota a eliminar dentro de la lista.
   */
  public void removeEntry(int index)
  {
    entries.remove(index);
  }

  @Override
  public String toString() {
    return String.join(System.lineSeparator(), entries);
  }
}
