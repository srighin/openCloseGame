package com.sriman.openclose.newplayer.game;

/**
 * Game follows template pattern. Template support different type of game including open-close game.
 *
 */
public abstract class GameTemplate {

    /**
     * each game has startGame method which initialized the precondition
     */
    public abstract void  startGame();

    /**
     * playGame is the code algorithm for the game. All the main functionality is described here.
     */
    public abstract void playGame();

    /**
     * endGame method with clear all the resources acquired using playing game.
     */
    public abstract void  endGame();

    /**
     * Heart of the game, which describe the steps involve in the game.
     */
    public void play (){
        startGame();
        playGame();
        endGame();
    }
}
