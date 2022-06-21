/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainOfResposibility1;

/**
 *
 * @author jose casal
 */
public class Creature {

    private Game game;
    public String name;
    private int baseAttack, baseDefense;

    public Creature(Game game, String name,
            int baseAttack, int baseDefense) {
        this.game = game;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.name = name;
    }

    int getAttack() {
        Query q = new Query(name, Query.Argument.ATTACK, baseAttack);
        game.queries.fire(q);
        return q.result;
    }

    int getDefense() {
        Query q = new Query(name, Query.Argument.DEFENSE, baseDefense);
        game.queries.fire(q);
        return q.result;
    }

    @Override
    public String toString() // avoid printing Game
    {
        return "Creature{"
                + "name='" + name + '\''
                + ", attack=" + getAttack()
                + // !!!
                ", defense=" + getDefense()
                + '}';
    }

}
