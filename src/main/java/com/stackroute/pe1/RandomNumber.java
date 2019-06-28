package com.stackroute.pe1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static String guessMethod(int guess,int target){
        Random random=new Random();
        int number=random.nextInt(50);


        String string="";
        if(target > guess){
            string = "Number guessed is less than the original number";
            return string;
        }else if (target == guess){
            string = "Number guessed matches original number";
            return string;
        }else if(target < guess){
            string = "Number guessed is more than the original number";
            return string;
        }
        else{
            string="Error";
        }
        return string;
    }
}




