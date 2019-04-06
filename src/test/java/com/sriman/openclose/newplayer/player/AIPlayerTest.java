package com.sriman.openclose.newplayer.player;

import com.sriman.openclose.newplayer.role.Role;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AIPlayerTest {

    AIPlayer player;

    @Before
    public void init(){
        player = new AIPlayer(Role.AS_PREDICTOR);
    }

    /**
     * AI playing as predictor
     */
    @Test
    public void test_play_role_as_predictor() {
        String playAsPredictor = player.play();
        assertNotNull(playAsPredictor);
        assertEquals(3, playAsPredictor.length());
    }


    /**
     * AI playing as non predictor
     */
    @Test
    public void test_play_role_as_non_predictor() {
        assertNotNull(player.play());
        assertEquals(2, player.play().length());
    }

}