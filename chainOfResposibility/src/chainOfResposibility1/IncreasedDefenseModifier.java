/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainOfResposibility1;

/**
 *
 * @author jose casal
 */
public class IncreasedDefenseModifier extends CreatureModifier {

    public IncreasedDefenseModifier(Game game, Creature creature) {
        super(game, creature);

        game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name)
                    && q.argument == Query.Argument.DEFENSE) {
                q.result += 3;
            }
        });
    }

}
