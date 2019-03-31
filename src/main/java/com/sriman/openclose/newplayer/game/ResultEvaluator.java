package com.sriman.openclose.newplayer.game;

import com.sriman.openclose.newplayer.utils.PossibleAiInput;

/**
 * ResultEvaluator class is used to evaluate if the prediction is matching with actual value
 */
public class ResultEvaluator {

    /**
     * The findWinner will evaluate who is the winner of the game.
     * @param userInput
     * @param aiInput
     * @return
     */
    public static boolean findWinner(String userInput, String aiInput){

        int userPrediction = -1;
        int aiPredication = -1;

        PossibleAiInput user = PossibleAiInput.findByUserInput(userInput.substring(0,2));
        PossibleAiInput ai = PossibleAiInput.findByUserInput(aiInput.substring(0,2));

        int totalOpenHandInActual = user.getOpenHands() + ai.getOpenHands();

        if (userInput.length() > aiInput.length()){
            userPrediction = Integer.parseInt(userInput.substring(2));
        } else  if (userInput.length() < aiInput.length()){
            aiPredication = Integer.parseInt(aiInput.substring(2));
        }

        if (totalOpenHandInActual == userPrediction || totalOpenHandInActual == aiPredication){
            return true;
        }
        return false;
    }
}
