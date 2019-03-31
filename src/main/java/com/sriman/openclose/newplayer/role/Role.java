package com.sriman.openclose.newplayer.role;

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
