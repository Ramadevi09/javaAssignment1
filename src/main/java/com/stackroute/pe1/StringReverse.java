package com.stackroute.pe1;



public class StringReverse {

    public static String  StrReverse(String s) {
        String reverse = "", result = "";
        if (s == " ") {
            result +="error message";
            return result.trim();
        }
        else if(s==null){
            result +="null";
            return result;


        }
        else {

            for (int i = s.length() - 1; i >= 0; i--) {
                reverse = reverse + s.charAt(i);

            }
            result += reverse;

            return result.trim();
        }
    }

}
