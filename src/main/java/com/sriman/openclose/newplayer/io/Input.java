package com.sriman.openclose.newplayer.io;

import java.util.Scanner;

public enum Input {

    INPUT;

    private Scanner scanner;

    Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput(){
        return scanner.nextLine();
    }

}
