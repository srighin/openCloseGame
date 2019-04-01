package com.sriman.openclose.newplayer.role;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoleTest {

    /**
     * Check for the valid role to the players
     */
    @Test
    public void test_role_success() {
        assertEquals(Role.AS_PREDICTOR.getRole(), "predictor");
        assertEquals(Role.AS_NOT_PREDICTOR.getRole(), "non Predictor");
    }

    /**
     * Check for the valid role to the players
     */
    @Test
    public void test_role_failure() {
        assertNotEquals(Role.AS_PREDICTOR.getRole(), "non predictor");
        assertNotEquals(Role.AS_NOT_PREDICTOR.getRole(), "Predictor");
    }
}