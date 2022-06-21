package chainOfResposibility1;

/**
 * Ejemplo de implementación del patrón de diseño "Chain of resposibiliy(COR)" en su
 * versión: "Broker Chain". <-- Esta es una fusión de los patrones: COR + Observer y Mediator + Mementor.
 * @author jose casal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game();
        Creature goblin = new Creature(game,
                "Strong Goblin", 2, 2);

        System.out.println(goblin);

        // modifiers can be piled up
        IncreasedDefenseModifier icm = new IncreasedDefenseModifier(game, goblin);

        try ( DoubleAttackModifier dam
                = new DoubleAttackModifier(game, goblin)) {
            System.out.println(goblin);
        }

        System.out.println(goblin);

    }

}
