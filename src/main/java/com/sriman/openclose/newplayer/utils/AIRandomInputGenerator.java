package com.sriman.openclose.newplayer.utils;

import java.util.Random;

/**
 * class AIRandomInputGenerator will generate random AI input
 * whether acting as predictor or non predictor.
 */
public class AIRandomInputGenerator {

    /**
     * Append random number to the random possible open close hand
     * @return AI input as predictor
     */
    public static String getRandomAiInputWithNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(PossibleAiInput.values().length);
        return PossibleAiInput.values()[randomNumber].getAiInput()+getRandomInteger();
    }

    /**
     * random possible open close hand
     * @return AI input as non predictor
     */
    public static String getRandomAiInputWithoutNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(PossibleAiInput.values().length);
        return PossibleAiInput.values()[randomNumber].getAiInput();
    }

    /**
     * Random Number generator which produce number between 0 till 4
     * @return random number
     */
    public static int getRandomInteger(){
        return ((int) (Math.random()*(4 - 0))) + 0;
    }


}


