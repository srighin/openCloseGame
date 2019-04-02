package com.sriman.openclose.newplayer.io;

import java.util.Scanner;

public enum Input {

    INPUT("Keyboard");

    private String inputType;
    private Scanner scanner;

    Input(String inputType) {
        this.inputType = inputType;
        this.scanner = new Scanner(System.in);
    }

    public String getInputType(String inputType) {
        return this.inputType;
    }

    public String getUserInput(){
        return scanner.nextLine();
    }

}
