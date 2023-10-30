package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareRootTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void SquareRootTest1(){
        double expected = 2;
        double actual = Console.squareRoot(4);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SquareRootTest2() { Console.squareRoot(0); }

    @Test(expected = IllegalArgumentException.class)
    public void SquareRootTest3() { Console.squareRoot(-9); }
}



