package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat repeat;
    @Before
    public void setUp(){

        repeat=new StringRepeat();




    }
    @After
    public void tearDown() {

        repeat = null;
    }
    @Test
    public void repetitionOfString(){
        String result=StringRepeat.repeat(3,"ramadevi");
        assertEquals("ramadevievievievi",result);
    }
    @Test
    public void givenSInputtringIsEmptyPrintErrorMsg (){
        String result=StringRepeat.repeat(3," ");
        assertEquals("error message",result);
    }
    @Test
    public void givenInputStringIsNullPrintErrMsg(){
        String result=StringRepeat.repeat(2,null);
        assertEquals("null",result);
    }

}