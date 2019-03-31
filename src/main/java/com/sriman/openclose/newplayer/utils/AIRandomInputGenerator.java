package com.sriman.openclose.newplayer.utils;

import java.util.Random;

public class AIRandomInputGenerator {

    public static String getRandomAiInputWithNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(PossibleAiInput.values().length);
        return PossibleAiInput.values()[randomNumber].getAiInput()+getRandomInteger();
    }

    public static String getRandomAiInputWithoutNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(PossibleAiInput.values().length);
        return PossibleAiInput.values()[randomNumber].getAiInput();
    }

    public static int getRandomInteger(){
        return ((int) (Math.random()*(4 - 0))) + 0;
    }


}


