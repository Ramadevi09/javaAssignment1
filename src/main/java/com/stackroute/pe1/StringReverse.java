package com.stackroute.pe1;



public class StringReverse {
//based on input String reverse the String
    public static String  StrReverse(String s) {
        String reverse = "", result = "";
        //check the string is empty or not
        if (s == " ") {
            result +="error message";
            //return result.trim();
        }
        //check the String is null or not
        else if(s==null){
            result +="null";
            //return result;


        }
        else {
            StringBuffer buffer=new StringBuffer(s);
                //reverse = reverse + s.charAt(i);
                reverse +=buffer.reverse();


            result += reverse;


        }
        return result.trim();
    }

}
