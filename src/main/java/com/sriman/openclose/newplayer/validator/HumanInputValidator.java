package com.sriman.openclose.newplayer.validator;

import com.sriman.openclose.newplayer.role.Role;
import static com.sriman.openclose.newplayer.constant.Constants.NON_PREDICATE_EXP;
import static com.sriman.openclose.newplayer.constant.Constants.PREDICATE_EXP;

public class HumanInputValidator {



    public static boolean validateInput (Role role, String userInput){

            if (role.getRole().equalsIgnoreCase(Role.AS_PREDICTOR.getRole())) {
                return userInput.matches(PREDICATE_EXP);
            } else {
                return userInput.matches(NON_PREDICATE_EXP);
            }
    }

}
