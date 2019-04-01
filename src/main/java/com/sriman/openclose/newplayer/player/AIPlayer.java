package com.sriman.openclose.newplayer.player;

import com.sriman.openclose.newplayer.utils.AIRandomInputGenerator;
import com.sriman.openclose.newplayer.role.Role;

import static com.sriman.openclose.newplayer.constant.Constants.AI;

/**
 * Machine class which play with Human
 * The prediction is completely random without any pre-jurisdiction.
 */
public class AIPlayer extends IPlayer{

    /**
     * Constructor set the initial role for the machine(AI) in the game
     * @param playingAs
     */
    public AIPlayer(Role playingAs) {
        this.playingAs = playingAs;
    }

    /**
     * the method play, will generate random input for bi-directional game flow.
     * @return AI input
     */
    public String play(){
        String aiInput;
        if (playingAs.getRole().equalsIgnoreCase(Role.AS_PREDICTOR.getRole())){
            aiInput = AIRandomInputGenerator.getRandomAiInputWithNumber();
        } else {
            aiInput = AIRandomInputGenerator.getRandomAiInputWithoutNumber();
        }
        System.out.println(AI + aiInput);
        changeRole();
        return aiInput;
    }


}
