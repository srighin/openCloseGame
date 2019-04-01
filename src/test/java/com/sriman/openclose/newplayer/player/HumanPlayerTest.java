package com.sriman.openclose.newplayer.player;


import com.sriman.openclose.newplayer.role.Role;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class HumanPlayerTest {

    HumanPlayer humanPlayer;

    @Before
    public void init(){
        humanPlayer = new HumanPlayer(Role.AS_PREDICTOR);
    }


    @Test
    public void shouldTakeUserInput() {

        String data = "OO3";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            Scanner scanner = new Scanner(System.in);
            when(scanner.nextLine()).thenReturn("OO1");

            String inputFromHuman = humanPlayer.play();
            assertEquals(3, inputFromHuman.length());
        } finally {
            System.setIn(stdin);
        }
    }

}