package com.stackroute.pe1;

import java.util.Scanner;

public class StringRepeat {
    String repeat1 = "";
//repeat the string based on n value
    public static String repeat(int n, String str) {
        int i = 0;
        String repeat1 = "", result = "";
        //check if the string is empty or not
        if (str == " ") {
            result += "error message";
            return result.trim();
        }
        //check if the string is null or not
        else if (str == null) {
            result += "null";
            return result;


        } else {

            for (i = 0; i <= str.length() - 1; i++) {
                //char ch=str.charAt(i);
                String sub = str.substring(str.length() - n);
                repeat1 = str + sub.repeat(n);
            }
            result += repeat1;


            return result.trim();
        }

    }
}