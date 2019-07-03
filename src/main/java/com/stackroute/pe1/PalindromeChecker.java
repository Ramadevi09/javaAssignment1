package com.stackroute.pe1;

import java.util.Scanner;

public class PalindromeChecker {
    //check whether the number is palindrom or not
    public static String palindromCheck(int number) {
        int reminder = 0, reverse = 0, temp, sum = 0;
        String result = "";
        temp = number;
        while (number != 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;

            if (reminder % 2 == 0) {
                sum = sum + reminder;
            }

            number = number / 10;
        }


        if (reverse == temp) {
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

