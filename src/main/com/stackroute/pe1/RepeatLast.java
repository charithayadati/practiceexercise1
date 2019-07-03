package com.stackroute.pe1;

import java.util.Scanner;

public class RepeatLast {
    public String repeatLast(String text,int num)
    {
        String finalText=text;
        String repeatText=text.substring((text.length()-num),text.length());
        for(int i=1;i<=num;i++)
        {
            finalText=finalText.concat(repeatText);
        }
        return finalText;
    }

}
