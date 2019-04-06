package com.sriman.openclose.newplayer.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class PossibleAiInputTest {

    /**
     * Check for the AIInput incase of Success scenario
     */
    @Test
    public void test_ai_input_success() {
        assertEquals(PossibleAiInput.CC.getAiInput(), "CC");
        assertEquals(PossibleAiInput.OO.getAiInput(), "OO");
        assertEquals(PossibleAiInput.OC.getAiInput(), "OC");
        assertEquals(PossibleAiInput.CO.getAiInput(), "CO");


    }

    /**
     * Check for the AIInput incase of failure scenario
     */
    @Test
    public void test_ai_input_failure() {
        assertNotEquals(PossibleAiInput.OO.getAiInput(), "DD");
        assertNotEquals(PossibleAiInput.CC.getAiInput(), "OO");
        assertNotEquals(PossibleAiInput.OC.getAiInput(), "CO");
    }

    /**
     * Check for the find AI input by code in success scenario
     */
    @Test
    public void test_find_ai_input_by_code_success() {
        assertEquals(PossibleAiInput.findByUserInput("OO"), PossibleAiInput.OO);
        assertEquals(PossibleAiInput.findByUserInput("CC"), PossibleAiInput.CC);
        assertEquals(PossibleAiInput.findByUserInput("OC"), PossibleAiInput.OC);
        assertEquals(PossibleAiInput.findByUserInput("CO"), PossibleAiInput.CO);

    }

    /**
     * Check for the find AI input by code in failure scenario
     */
    @Test
    public void test_find_ai_input_by_code_failure() {
        assertNotEquals(PossibleAiInput.findByUserInput("OO"), PossibleAiInput.CC);
        assertNotEquals(PossibleAiInput.findByUserInput("CC"), PossibleAiInput.OO);
        assertNotEquals(PossibleAiInput.findByUserInput("OC"), PossibleAiInput.CO);
        assertNotEquals(PossibleAiInput.findByUserInput("CO"), PossibleAiInput.OC);

    }

    /**
     * Check for the find AI input count by code in success scenario
     */
    @Test
    public void test_find_ai_input_count_by_code_success() {
        assertEquals(PossibleAiInput.findByUserInput("OO").getOpenHands(), 2);
        assertEquals(PossibleAiInput.findByUserInput("CC").getOpenHands(), 0);
        assertEquals(PossibleAiInput.findByUserInput("OC").getOpenHands(), 1);
        assertEquals(PossibleAiInput.findByUserInput("CO").getOpenHands(), 1);

    }
    /**
     * Check for the find AI input count by code in failure scenario
     */
    @Test
    public void test_find_ai_input_count_by_code_failure() {
        assertNotEquals(PossibleAiInput.findByUserInput("OO").getOpenHands(), 1);
        assertNotEquals(PossibleAiInput.findByUserInput("CC").getOpenHands(), 3);
        assertNotEquals(PossibleAiInput.findByUserInput("OC").getOpenHands(), 2);
        assertNotEquals(PossibleAiInput.findByUserInput("CO").getOpenHands(), 2);
    }
}