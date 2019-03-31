package com.sriman.openclose.newplayer.utils;

import java.util.Random;

public class AIRandomInputGenerator {

    public static String getRandomAiInput(){
        Random random = new Random();
        int randomNumber = random.nextInt(PossibleAiInput.values().length);
        return PossibleAiInput.values()[randomNumber].getAiInput();
    }
}


