package com.stackroute.pe1;

import java.util.Scanner;

public class checkTheChar {

    public String sample(char var) { //checks whether the character is a vowel or consonant or digit or special symbol
        if (Character.isUpperCase(var)) {
            return "Uppercase letter";
        } else if (Character.isLowerCase(var)) {
            return "Lowercase letter";
        } else if (Character.isDigit(var)) {
            return "Is a Digit";
        } else {
            return "Is a Special symbol";
        }

    }

}