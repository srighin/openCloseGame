package com.sriman.openclose.newplayer.utils;

public enum PossibleAiInput {

    OO("OO",2),
    OC("OC", 1),
    CO("CO", 1),
    CC("CC", 0);

    String aiInput;
    int openHands;

    PossibleAiInput(String aiInput, int openHands) {
        this.aiInput = aiInput;
        this.openHands = openHands;
    }

    public static PossibleAiInput findByUserInput (String abbr){
        for(PossibleAiInput possibleAiInput : values()){
            if( possibleAiInput.getAiInput().equals(abbr)){
                return possibleAiInput;
            }
        }
        return null;
    }

    public String getAiInput(){
        return aiInput;
    }

    public int getOpenHands() {
        return openHands;
    }
}
