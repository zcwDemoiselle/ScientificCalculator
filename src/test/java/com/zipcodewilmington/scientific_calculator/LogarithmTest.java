package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogarithmTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void LogarithmTest1(){
        double expected = 2.302585092994046;
        double actual = Console.logarithm(10);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test
    public void LogarithmTest2(){
        double expected = 0;
        double actual = Console.logarithm(1);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void LogarithmTest3(){
        Console.logarithm(-5);
    }
}