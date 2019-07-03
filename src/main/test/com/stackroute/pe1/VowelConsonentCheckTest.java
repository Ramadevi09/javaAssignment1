package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonentCheckTest {
    VowelConsonentCheck vowelConsonentCheck=null;
    @Before
    public  void setUp(){
        vowelConsonentCheck=new VowelConsonentCheck();
    }
    @After
    public void tearDown(){
        vowelConsonentCheck=null;
    }
    @Test
    public void givenStringContainOneCharacterShouldPrintVowel(){
        String result=VowelConsonentCheck.vowelConsonentCheck("a");
        assertEquals("vowels",result);
    }
    @Test
    public void givenStringContainOneCharacterShouldPrintConsonant(){
        String result=VowelConsonentCheck.vowelConsonentCheck("h");
        assertEquals("consonants",result);
    }
    @Test
    public void givenStringContainOneNumberShouldPrintNumber(){
        String result=VowelConsonentCheck.vowelConsonentCheck("1");
        assertEquals("numbers",result);
    }
    @Test
    public void givenStringContainMoreCharacterShouldPrintVowelsConsonantsMessage(){
        String result=VowelConsonentCheck.vowelConsonentCheck("abid");
        assertEquals("vowelsconsonantsvowelsconsonants",result);
    }


}