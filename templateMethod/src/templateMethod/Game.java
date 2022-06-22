/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templateMethod;

/**
 *
 * @author jose casal
 */
public abstract class Game {
    protected int currentPlayer;
    protected final int numberOfPlayer;

    public Game(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }
    
    public void run(){
        start();
        while(!haveWinner())
        {
            takeTurn();
            System.out.println("Player: "+ getWinningPlayer() + " wins");
        }
    }
    
    protected abstract int getWinningPlayer();
    protected abstract void takeTurn();
    protected abstract boolean haveWinner();
    protected abstract void start();
}
