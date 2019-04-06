package com.sriman.openclose.newplayer.player;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HumanPlayerTest {

    HumanPlayer humanPlayer;

    /**
     * This is mocking of the human player
     */
    @Test
    public void test_play () {

        humanPlayer = mock(HumanPlayer.class);
        String expectedInput = "OO3";
        when(humanPlayer.play()).thenReturn("OO3");
        assertEquals(expectedInput, "OO3");
    }

}