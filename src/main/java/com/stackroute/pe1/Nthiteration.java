package com.stackroute.pe1;

public class Nthiteration {
    public static String Check(int num) {
        String result = "";
        if (num < 0) {
            result += "number should be positive";
            return result;
        } else if (num == 0) {
            result += "error";
            return result;

        } else {

            for (int i = 0; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    result += i;
                }


            }
            return result;
        }
    }
}



