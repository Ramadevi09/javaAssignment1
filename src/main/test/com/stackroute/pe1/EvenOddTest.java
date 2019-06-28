package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {
    EvenOdd evenOdd=null;
    @Before
    public void setUp(){
        System.out.println("Before");
        evenOdd=new EvenOdd();

    }
    @After
    public void  tearDown(){
        evenOdd=null;
        System.out.println("After");
    }
    @Test
    public void givenIntegerContainEvenAndShouldLiesIn20to30PrintEven(){
        String result=EvenOdd.EvenOddCheck(22);
        assertEquals("jerry",result);
    }
    @Test
    public void givenIntegerContainOddAndShouldLiesIn20to30PrintOdd(){
        String result=EvenOdd.EvenOddCheck(23);
        assertEquals("tom",result);
    }
    @Test
    public void givenIntegerContainNumberAndShouldNotLiesIn20to30PrintMessage(){
        String result=EvenOdd.EvenOddCheck(10);
        assertEquals("not lies in 20to30",result);
    }


}