package com.sriman.openclose.newplayer.game;

import com.sriman.openclose.newplayer.role.Role;
import com.sriman.openclose.newplayer.player.AIPlayer;
import com.sriman.openclose.newplayer.player.HumanPlayer;
import java.util.Scanner;

/**
 * Core of the open close game
 */
public class Game extends GameTemplate {

    AIPlayer aiPlayer;
    HumanPlayer humanPlayer;
    boolean playGame = true;

    private Scanner scanner;

    /**
     * Here initialized the players and assign role to each players
     */
    @Override
    public void startGame(){
        scanner  = new Scanner(System.in);
        System.out.println("Welcome to the game!");
        aiPlayer = new AIPlayer(Role.AS_NOT_PREDICTOR);
        humanPlayer = new HumanPlayer(Role.AS_PREDICTOR);
       // humanPlayer.passScanner(scanner);
    }

    /**
     * playGame is central logic where each player play the round and input of each player is evaluated
     * to fine the winner of the game
     */
    public void playGame(){

        while (playGame){
            String humanInput = humanPlayer.play();
            String aiInput = aiPlayer.play();

            if(ResultEvaluator.findWinner(humanInput, aiInput)){
                if (humanInput.length() > aiInput.length()){
                    System.out.println("You WIN!!");
                } else {
                    System.out.println("AI WIN!!");
                }
                System.out.println("Do you want to play again?");
                String wantToPlayAgain = scanner.nextLine();
                if (wantToPlayAgain.equalsIgnoreCase("N")){
                    playGame = false;
                }
            } else {
                System.out.println("No winner.");
            }
        }

    }

    /**
     * endGame is final method where the user decide not to play further
     */
    public void endGame(){
        System.out.println("Ok, bye!");
    }
}
