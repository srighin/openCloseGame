package com.sriman.openclose.newplayer.player;


import com.sriman.openclose.newplayer.role.Role;

/**
 * IPlayer is base class for all the different type of players
 */
public abstract class IPlayer {

    /**
     * Role is inject as mandatory field for all the player.
     */
    public Role playingAs;

    /**
     * Role changes after each turn. Meaning predictor become non-predictor after each round.
     */
    public void changeRole() {
        if(this.playingAs.getRole().equals(Role.AS_PREDICTOR.getRole())){
            this.playingAs = Role.AS_NOT_PREDICTOR;
        } else {
            this.playingAs = Role.AS_PREDICTOR;
        }
    }

}
