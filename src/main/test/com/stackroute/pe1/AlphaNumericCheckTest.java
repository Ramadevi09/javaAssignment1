package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphaNumericCheckTest {
    AlphaNumericCheck alphaNumaricCheck;
    @Before
    public void setUp(){
        System.out.println("Before");
        alphaNumaricCheck=new AlphaNumericCheck();

    }
    @After
    public void tearDown(){
        System.out.println("After");
        alphaNumaricCheck=null;
    }
    @Test
    public void checkingGivenCharaterIsSmallerCase(){
        String result= AlphaNumericCheck.Check('a');
        assertEquals("character is smallercase",result);
    }
    @Test
    public void checkingGivenCharaterIsUpperCase(){
        String result= AlphaNumericCheck.Check('A');
        assertEquals("character is uppercase",result);
    }
    @Test
    public void checkingGivenCharaterIsSymbol(){
        String result= AlphaNumericCheck.Check('@');
        assertEquals("special symbol",result);
    }
    @Test
    public void checkingGivenCharaterIsNumber(){
        String result= AlphaNumericCheck.Check('9');
        assertEquals("you entered number",result);
    }



}