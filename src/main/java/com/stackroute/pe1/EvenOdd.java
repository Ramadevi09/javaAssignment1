package com.stackroute.pe1;

import java.util.Scanner;

public class EvenOdd {

    public static String EvenOddCheck(int num) {
        String result = "";

        if (num % 2 == 0 && (num > 20 & num < 30)) {
            result += "jerry";
        } else if (num % 2 == 1 && (num > 20 & num < 30)) {
            result += "tom";
        } else {
            result += "not lies in 20to30";
        }
        return result.trim();
    }
}










