package com.stackroute.pe1;

import java.util.Scanner;

public class DigitsSum {

    public static String digitsum(String number) {


            int sum = 0;

            String string = "";
           //split the string number based on space
            String[] array = number.split(" ");

            int arr[] = new int[array.length];
            try {

                for (int i = 0; i < array.length; i++) {
                    //parse the String into number
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


