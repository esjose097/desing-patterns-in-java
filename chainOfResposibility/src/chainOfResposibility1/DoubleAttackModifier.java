/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainOfResposibility1;

/**
 *
 * @author jose casal
 */
public class DoubleAttackModifier extends CreatureModifier implements AutoCloseable {

    private int token;

    public DoubleAttackModifier(Game game, Creature creature) {
        super(game, creature);

        token = game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name)
                    && q.argument == Query.Argument.ATTACK) {
                q.result *= 2;
            }
        });
    }

    @Override // commented out exception
    public void close() /*throws Exception*/ {
        game.queries.unsubscribe(token);
    }

}
