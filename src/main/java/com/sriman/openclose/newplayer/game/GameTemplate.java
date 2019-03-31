package com.sriman.openclose.newplayer.game;

public abstract class GameTemplate {

    public abstract void  startGame();
    public abstract void playGame();
    public abstract void  endGame();

    public void play (){
        startGame();
        playGame();
        endGame();
    }
}
