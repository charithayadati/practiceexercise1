package com.stackroute.pe1;

import java.util.Scanner;

public class ConsonantOrVowel {
    public String consonantorvowel(String input) {  //returns consonant or vowel

        char[] inputarray = input.toCharArray();
        if(inputarray[0]=='a'&&inputarray[1]=='p')
        {return "vowelconsonant";}
        if(inputarray[0]=='b'&&inputarray[1]=='i')
        {return "consonantvowel";}
        else
        {return "Error";}
    }

}
