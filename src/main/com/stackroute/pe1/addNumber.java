package com.stackroute.pe1;

import java.util.Scanner;
import java.lang.Character;

public class addNumber {
    public int sum(int[] numbers) { //Adds the numbers in the array
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {

            result = result + numbers[i];

        }
        return result;


    }
}
