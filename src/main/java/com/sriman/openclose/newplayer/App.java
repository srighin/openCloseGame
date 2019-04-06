package com.sriman.openclose.newplayer;

import com.sriman.openclose.newplayer.game.Game;
import com.sriman.openclose.newplayer.game.GameTemplate;

public class App {

    public static void main(String[] args) {
        GameTemplate game = new Game();
        game.play();
    }
}
