package com.company.junit;

import java.util.Random;
import java.util.Scanner;

public class Guessnumber {
    public String check(int guessedNum) {

        int ran = 39;

        String result = null;
        if (guessedNum == ran) {

            result = "Number Guessed matches the original number";
        } else if (guessedNum > ran) {
            result = "Number Guessed is more than original Number";
        } else {
            result = "Number Guessed is less than original Number";
        }
        return result;
    }
}