package com.sriman.openclose.newplayer.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class AIRandomInputGeneratorTest {

    /**
     * Check for the AIInput when AI acts like predictor. The input contains open hand count
     * since the input is random, checking the size of input proof the concept
     */
    @Test
    public void test_random_ai_input_generator_with_number() {
        assertNotNull(AIRandomInputGenerator.getRandomAiInputWithNumber().length());
        assertEquals(AIRandomInputGenerator.getRandomAiInputWithNumber().length(), 3);
    }

    /**
     * Check for the AIInput when AI acts like non predictor. The input do not contains open hand count
     * since the input is random, checking the size of input proof the concept
     */
    @Test
    public void test_random_ai_input_generator_without_number() {
        assertNotNull(AIRandomInputGenerator.getRandomAiInputWithoutNumber().length());
        assertEquals(AIRandomInputGenerator.getRandomAiInputWithoutNumber().length(), 2);
    }

}