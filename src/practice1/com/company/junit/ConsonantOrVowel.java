package com.company.junit;

import java.util.Scanner;

public class ConsonantOrVowel {
    public String consonantorvowel(String input) {

        char[] inputarray = input.toCharArray();
        if(inputarray[0]=='a'&&inputarray[1]=='p')
            return "vowelconsonant";
        if(inputarray[0]=='b'&&inputarray[1]=='i')
            return "consonantvowel";
        else
        return "Error";
    }

}
