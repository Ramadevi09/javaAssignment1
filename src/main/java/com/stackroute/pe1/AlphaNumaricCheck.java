package com.stackroute.pe1;

import java.util.Scanner;

public class AlphaNumaricCheck {
    public static String Check(char ch) {
        String result="";


        if ((ch >= 'a' && ch <= 'z'))
            result +="character is smallercase";

        else if ((ch >= 'A' && ch <= 'Z'))
            result +="character is uppercase";
        else if ((ch >= '0' && ch <= '9'))
            result +="you entered number";
        else{
            result +=" special symbol";
        }
        return result.trim();

    }


}
