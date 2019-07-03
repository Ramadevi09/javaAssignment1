package com.stackroute.pe1;

import java.util.Scanner;

public class EvenOdd {
//check the given number is even or odd
    public static String EvenOddCheck(int num) {
        String result = "";
        char c=' ';

        if (num % 2 == 0 && (num > 20 & num < 30)) {
            result += "jerry";
        } else if (num % 2 == 1 && (num > 20 & num < 30)) {
            result += "tom";
        } else if(num==c) {
            result += "enter number";
        }
        else{
            result += "not lies in 20to30";
        }
        return result.trim();
    }
}










