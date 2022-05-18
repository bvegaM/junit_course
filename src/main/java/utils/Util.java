package utils;

import enums.SecurityLevel;

public class Util {

    public static SecurityLevel validatePassword(String password){

        if(password == null || password.isEmpty()){
            throw new IllegalArgumentException("Password cannot be empty or null");
        }


        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }
        if (password.matches("[0-9]+")){
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }
        if (password.matches("[a-zA-Z0-9!@#$%^&*()_+]+")){
            return SecurityLevel.STRONG;
        }
        return SecurityLevel.WEAK;
    }
}
