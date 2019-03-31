package com.sriman.openclose.newplayer.player;

import com.sriman.openclose.newplayer.utils.AIRandomInputGenerator;
import com.sriman.openclose.newplayer.role.Role;

public class AIPlayer extends IPlayer{

    public AIPlayer(Role playingAs) {
        this.playingAs = playingAs;
    }

    public String play(){
        String aiInput;
        if (playingAs.getRole().equalsIgnoreCase(Role.AS_PREDICTOR.getRole())){
            aiInput = AIRandomInputGenerator.getRandomAiInputWithNumber();
        } else {
            aiInput = AIRandomInputGenerator.getRandomAiInputWithoutNumber();
        }
        System.out.println("AI : " + aiInput);
        changeRole();
        return aiInput;
    }


}
