package com.stackroute.pe1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NthiterationTest {
        Nthiteration nthiteration;
        @Before
        public void setUp(){
            System.out.println("Before");
            nthiteration=new Nthiteration();
        }
        @After
        public void  tearDown(){

            System.out.println("After");
            nthiteration=null;
        }
        @Test
        public void repeatNumberSeries(){
            String result=Nthiteration.Check(4);
            assertEquals("1223334444",result);

        }
    @Test
    public void givenInputisNagativeNumberPrintErrMsg(){
        String result=Nthiteration.Check(-4);
        assertEquals("number should be positive",result);

    }
    @Test
    public void givenInputisZeroNumberPrintErrMsg(){
        String result=Nthiteration.Check(0);
        assertEquals("error",result);

    }





}