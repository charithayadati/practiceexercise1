package com.company.junit;

import java.util.Scanner;
import java.lang.Character;

public class addNumber {
    public int sum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {

            result = result + numbers[i];

        }
        return result;


    }
}
