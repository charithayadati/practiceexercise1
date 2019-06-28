package com.company.junit;

import java.util.Scanner;

public class printNumber {
    public String printRepeated(int number) {
        if (number > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    stringBuilder = stringBuilder.append(i);
                    stringBuilder = stringBuilder.append(" ");
                }
            }
            return stringBuilder.toString().trim();
        } else {
            return null;
        }
    }
}
