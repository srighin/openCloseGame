package com.sriman.openclose.newplayer.player;

import com.sriman.openclose.newplayer.role.Role;
import com.sriman.openclose.newplayer.validator.HumanInputValidator;

import java.util.Scanner;

public class HumanPlayer extends IPlayer {

    private Scanner scanner;

    public HumanPlayer(Role playingAs) {
        this.playingAs = playingAs;
    }

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

    public void passScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
