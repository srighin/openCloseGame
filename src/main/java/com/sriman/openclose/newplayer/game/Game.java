package com.sriman.openclose.newplayer.game;

import com.sriman.openclose.newplayer.role.Role;
import com.sriman.openclose.newplayer.player.AIPlayer;
import com.sriman.openclose.newplayer.player.HumanPlayer;
import com.sriman.openclose.newplayer.utils.PossibleAiInput;

import java.util.Scanner;

public class Game extends GameTemplate {

    AIPlayer aiPlayer;
    HumanPlayer humanPlayer;
    boolean playGame = true;

    private Scanner scanner;

    public void startGame(){
        scanner  = new Scanner(System.in);
        System.out.println("Welcome to the game!");
        aiPlayer = new AIPlayer(Role.AS_NOT_PREDICTOR);
        humanPlayer = new HumanPlayer(Role.AS_PREDICTOR);
        humanPlayer.passScanner(scanner);
    }

    public void playGame(){

        while (playGame){
            String humanInput = humanPlayer.play();
            String aiInput = aiPlayer.play();



            if(ResultEvaluator.findWinner(humanInput, aiInput)){
                System.out.println("You WIN!!");
                System.out.println("Do you want to play again?");
                String wantToPlayAgain = scanner.nextLine();
                if (wantToPlayAgain.equalsIgnoreCase("N")){
                    playGame = false;
                }
            } else {
                System.out.println("No winner.");
            }
            humanPlayer.changeRole();
            aiPlayer.changeRole();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void endGame(){
        System.out.println("Ok, bye!");
    }
}
