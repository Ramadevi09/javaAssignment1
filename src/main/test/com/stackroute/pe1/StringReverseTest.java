package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringReverse;
    @Before
    public void setUp(){
        stringReverse=new StringReverse();
    }
    @After
    public void tearDown(){
        stringReverse=null;
    }
    @Test
    public void reverseOfAString(){
        String result=StringReverse.StrReverse("rama@");
        assertEquals("@amar",result);
    }
    @Test
    public void givenSInputtringIsEmptyPrintErrorMsg (){
        String result=StringReverse.StrReverse(" ");
        assertEquals("error message",result);
    }
    @Test
    public void givenInputStringIsNullPrintErrMsg(){
        String result=StringReverse.StrReverse(null);
        assertEquals("null",result);
    }


}