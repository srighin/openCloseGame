package com.sriman.openclose.newplayer.validator;

import com.sriman.openclose.newplayer.role.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanInputValidatorTest {

    /**
     * Check for the Human input and validate if the value entered is valid
     *
     */
    @Test
    public void test_user_input_is_valid() {
        assertTrue(HumanInputValidator.validateInput(Role.AS_PREDICTOR, "OO3"));
        assertTrue(HumanInputValidator.validateInput(Role.AS_NOT_PREDICTOR, "OO"));
    }

    /**
     * Check for the Human input and validate if the value entered is not valid
     *
     */
    @Test
    public void test_user_input_is_not_valid() {
        assertFalse(HumanInputValidator.validateInput(Role.AS_PREDICTOR, "OO"));
        assertFalse(HumanInputValidator.validateInput(Role.AS_NOT_PREDICTOR, "OO3"));
    }
}