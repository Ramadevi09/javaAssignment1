package com.stackroute.pe1;

import java.util.Scanner;

public class DigitsSum {

    public static String digitsum(String number) {


            int sum = 0;

            String string = "";
            String[] array = number.split(" ");
            int arr[] = new int[array.length];
            try {
                for (int i = 0; i < array.length; i++) {
                    arr[i] = Integer.parseInt(array[i]);

                }
            } catch (Exception exception) {
                string = "Error";
                return string;
            }
            for (int i = 0; i < array.length; i++) {
                sum = arr[i] + sum;

            }
            string = "" + sum;
            return (string);
        }


    }


