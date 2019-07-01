package com.stackroute.pe1;

import java.util.Scanner;

public class Palindrom {
    //check whether the number is palindrom or not
    public static String palindromCheck(int num) {
        int rem = 0, rev = 0, temp, sum = 0;
        String result = "";
        temp = num;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            //condition for
            if (rem % 2 == 0)
                sum = sum + rem;

            num = num / 10;
        }


        if (rev == temp) {
            if (sum > 25) {
                result += "palindrom and sum of even numbers is graterthan 25";
            } else {
                result += "palindrom and sum of even numbers is lessthan 25";
            }


        } else {
            result += "not palindrom";
        }
        return result.trim();
    }
}

