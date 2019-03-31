package com.sriman.openclose.newplayer.player;

import com.sriman.openclose.newplayer.role.Role;
import com.sriman.openclose.newplayer.validator.HumanInputValidator;
import java.util.Scanner;

/**
 * HumanPlayer class which play with Machine
 * The prediction is user's evaluation
 */
public class HumanPlayer extends IPlayer {

    // This is passed from the Game class
    private Scanner scanner;

    /**
     * Constructor set the initial role for the user in the game
     * @param playingAs
     */
    public HumanPlayer(Role playingAs) {
        this.playingAs = playingAs;
    }

    /**
     * the method play, will generate random input for bi-directional game flow.
     * @return human input
     */
    public String play(){
        if (this.playingAs.getRole().equals(Role.AS_PREDICTOR.getRole())){
            System.out.println("You are the predictor, what is your input?");
        } else {
            System.out.println("AI is the predictor, what is your input?");
        }

        String userInput = scanner.nextLine();
        while (! HumanInputValidator.validateInput(playingAs, userInput)){
            System.out.println("Please provide valid Input");
            userInput = scanner.nextLine();
        }
        changeRole();
        return userInput;
    }

    /**
     * scanner is passed using setter injection from Game class
     * @param scanner
     */
    public void passScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
