package com.sriman.openclose.newplayer.utils;

/**
 * The class PossibleAiInput restrict the possible combination of input User/Human or AI can select
 *
 */
public enum PossibleAiInput {

    OO("OO",2),
    OC("OC", 1),
    CO("CO", 1),
    CC("CC", 0);

    String aiInput;
    int openHands;

    /**
     * Enum constructor
     * @param aiInput
     * @param openHands
     */
    PossibleAiInput(String aiInput, int openHands) {
        this.aiInput = aiInput;
        this.openHands = openHands;
    }

    /**
     * Used to get the Valid input Enum Object by providing the String
     * @param userInput
     * @return
     */
    public static PossibleAiInput findByUserInput (String userInput){
        for(PossibleAiInput possibleAiInput : values()){
            if( possibleAiInput.getAiInput().equals(userInput)){
                return possibleAiInput;
            }
        }
        return null;
    }

    /**
     * Used to get AI input
     * @return
     */
    public String getAiInput(){
        return aiInput;
    }

    /**
     * Used to get the number of Open hand with respect to AI input
     * @return
     */
    public int getOpenHands() {
        return openHands;
    }
}
