package com.sriman.openclose.newplayer.role;

/**
 * The class restrict two role in the Open close Game
 * Predictor : can predict the open hand
 * Non Predictor : input open close option input
 */
public enum Role {

    AS_PREDICTOR("predictor"),
    AS_NOT_PREDICTOR("non Predictor");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
