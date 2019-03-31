package com.sriman.openclose.newplayer.player;


import com.sriman.openclose.newplayer.role.Role;

public abstract class IPlayer {

    public Role playingAs;

    public void changeRole() {
        if(this.playingAs.getRole().equals(Role.AS_PREDICTOR.getRole())){
            this.playingAs = Role.AS_NOT_PREDICTOR;
        } else {
            this.playingAs = Role.AS_PREDICTOR;
        }
    }

}
