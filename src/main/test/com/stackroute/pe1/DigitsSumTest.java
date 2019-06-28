package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsSumTest {
    DigitsSum digitsSum;
    @Before
    public void setUp() {
        System.out.println("Before");
        digitsSum=new DigitsSum();
    }

    @After
    public void tearDown() {
        digitsSum=null;
        System.out.println("After");
    }
    @Test
    public void givenOneStringShouldReturnSum() {
//arrange

//Act
        String result= DigitsSum.digitsum("12 23 4 2");

//Assert
        assertEquals("41", result);

    }
    @Test
    public void givenOneStringShouldReturnError() {
//arrange

//Act
        String result= DigitsSum.digitsum("23 4 p");

//Assert
        assertEquals("Error", result);

    }
    @Test
    public void givenNullShouldReturnError() {
//arrange

//Act
        String result= DigitsSum.digitsum("null");

//Assert
        assertEquals("Error", result);

    }


}