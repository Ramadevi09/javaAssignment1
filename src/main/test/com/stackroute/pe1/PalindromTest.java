package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromTest {
    Palindrom palindrom;
    @Before
    public void setUp(){
        System.out.println("Before");
         palindrom=new Palindrom();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        palindrom=null;


    }
    @Test
    public void CheckgivenIntegerisPalindromAndShouldReturnPalindrom(){
        String result=Palindrom.palindromCheck(121);
        assertEquals("palindrom sum of even numbers is lessthan 25",result);
    }
    @Test
    public void CheckgivenIntegerisNotPalindromAndShouldReturnMessage(){
        String result=Palindrom.palindromCheck(123);
        assertEquals("not palindrom",result);
    }
    @Test
    public void CheckgivenIntegerisPalindromAndShouldAndSumIsGraterthan25(){
        String result=Palindrom.palindromCheck(12888821);
        assertEquals("palindrom and sum of even numbers is graterthan 25",result);
    }


}