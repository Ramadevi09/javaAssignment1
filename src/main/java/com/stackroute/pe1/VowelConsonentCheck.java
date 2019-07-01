package com.stackroute.pe1;

public class VowelConsonentCheck {
    //in the given String check what are vowels & consonents
    public static String vowelConsonentCheck(String s) {
        String result = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                result += "vowels";

            else if (s.charAt(i) >= '0' & s.charAt(i) <= '9')
                result += "numbers";


            else
                result += "consonants";


        }
        return result.trim();
    }
}

