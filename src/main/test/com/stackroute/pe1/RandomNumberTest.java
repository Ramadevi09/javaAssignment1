package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomNumberTest {
    RandomNumber randomNumber;
    @Before
    public void setUp(){
        randomNumber=new RandomNumber();
    }

    @After
    public void tearDown(){

        randomNumber=null;
    }
    @Test
    public void givenStringContainsTwoIntegersShouldReturnMatch(){
//Arrange
//Act
        String result = RandomNumber.guessMethod(22, 22);
//Assert
        assertEquals( "Number guessed matches original number", result);
    }
    @Test
    public void givenStringContainsTwoIntegersShouldReturnLesser(){
//Arrange
//Act
        String result = RandomNumber.guessMethod(50, 84);
//Assert
        assertEquals( "Number guessed is less than the original number", result);
    }
    @Test
    public void givenStringContainsTwoIntegersShouldReturnGreater(){
//Arrange
//Act
        String result = RandomNumber.guessMethod(60 , 24);
//Assert
        assertEquals( "Number guessed is more than the original number", result);
    }


}