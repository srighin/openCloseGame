package com.sriman.openclose.newplayer.game;

import org.junit.Test;
import static org.junit.Assert.*;

public class ResultEvaluatorTest {


    /**
     * Here human is the predictor and hence the winner
     */
    @Test
    public void test_find_human_as_game_winner() {

        String userInput = "OO3";
        String machineInput = "CO";
        assertTrue(ResultEvaluator.findWinner(userInput, machineInput));
    }

    /**
     * Here AI is the predictor and hence the winner
     */
    @Test
    public void test_find_ai_as_game_winner() {

        String userInput = "CC";
        String machineInput = "CO1";
        assertTrue(ResultEvaluator.findWinner(userInput, machineInput));
    }

    /**
     * Here human is the predictor and hence the looser
     */
    @Test
    public void test_find_human_as_game_looser() {

        String userInput = "OO3";
        String machineInput = "CC";
        assertFalse(ResultEvaluator.findWinner(userInput, machineInput));
    }

    /**
     * Here AI is the predictor and hence the looser
     */
    @Test
    public void test_find_ai_as_game_looser() {

        String userInput = "CC";
        String machineInput = "CO2";
        assertFalse(ResultEvaluator.findWinner(userInput, machineInput));
    }

}