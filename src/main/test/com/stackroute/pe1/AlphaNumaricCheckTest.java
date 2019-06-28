package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphaNumaricCheckTest {
    AlphaNumaricCheck alphaNumaricCheck;
    @Before
    public void setUp(){
        System.out.println("Before");
        alphaNumaricCheck=new AlphaNumaricCheck();

    }
    @After
    public void tearDown(){
        System.out.println("After");
        alphaNumaricCheck=null;
    }
    @Test
    public void checkingGivenCharaterIsSmallerCase(){
        String result=AlphaNumaricCheck.Check('a');
        assertEquals("character is smallercase",result);
    }
    @Test
    public void checkingGivenCharaterIsUpperCase(){
        String result=AlphaNumaricCheck.Check('A');
        assertEquals("character is uppercase",result);
    }
    @Test
    public void checkingGivenCharaterIsSymbol(){
        String result=AlphaNumaricCheck.Check('@');
        assertEquals("special symbol",result);
    }
    @Test
    public void checkingGivenCharaterIsNumber(){
        String result=AlphaNumaricCheck.Check('9');
        assertEquals("you entered number",result);
    }



}