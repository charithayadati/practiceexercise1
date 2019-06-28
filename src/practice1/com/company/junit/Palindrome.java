package com.company.junit;

import java.util.Scanner;

public class Palindrome {

    public String isPalindrome(int number) {
        boolean result = false;
        int evenSum = 0;

        int temp = number, sum = 0, remainder;
        while (number != 0) {
            remainder = number % 10;
            sum = sum * 10 + remainder;
            if (remainder % 2 == 0) {
                evenSum = evenSum + remainder;
            }
            number = number / 10;
        }
        if (sum == temp) {
            result = true;
            return "Is a Palindrome and sum of even numbers is less than 25";
        }
        return "Is not a Palindrome";
    }
}


