package com.sriman.openclose.newplayer.player;

import com.sriman.openclose.newplayer.utils.AIRandomInputGenerator;
import com.sriman.openclose.newplayer.role.Role;

public class AIPlayer {

    private Role playingAs;

    public AIPlayer(Role playingAs) {
        this.playingAs = playingAs;
    }

    public String play(){
        String aiInput = AIRandomInputGenerator.getRandomAiInput();
        System.out.println("AI : " + aiInput);
        return aiInput;
    }

    public void changeRole() {
        if(this.playingAs.getRole().equals(Role.AS_PREDICTOR.getRole())){
            this.playingAs = Role.AS_NOT_PREDICTOR;
        } else {
            this.playingAs = Role.AS_PREDICTOR;
        }
    }
}
