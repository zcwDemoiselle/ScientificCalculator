package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void SquareTest1(){
        double expected = 36;
        double actual = Console.square(6);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test
    public void SquareTest2(){
        double expected = 0;
        double actual = Console.square(0);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test
    public void SquareTest3(){
        double expected = 81;
        double actual = Console.square(-9);
        Assert.assertEquals(expected, actual, 0.0003f);
    }
}


