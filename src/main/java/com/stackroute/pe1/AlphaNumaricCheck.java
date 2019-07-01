package com.stackroute.pe1;

import java.util.Scanner;

public class AlphaNumaricCheck {
    public static String Check(char ch) {
        String result="";

//check character is lowercase
        if ((ch >= 'a' && ch <= 'z'))
            result +="character is smallercase";

//check character is uppercase
        else if ((ch >= 'A' && ch <= 'Z'))
            result +="character is uppercase";
        //check entered character is number
        else if ((ch >= '0' && ch <= '9'))
            result +="you entered number";
        //check entered character is symbol
        else{
            result +=" special symbol";
        }
        return result.trim();

    }


}
