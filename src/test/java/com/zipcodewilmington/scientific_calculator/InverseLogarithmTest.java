package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InverseLogarithmTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void InverseLogarithmTest1(){
        double expected = 1000;
        double actual = Console.inverseLogarithm(3);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test
    public void InverseLogarithmTest2(){
        double expected = 10;
        double actual = Console.inverseLogarithm(1);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void InverseLogarithmTest3(){
        Console.inverseLogarithm(-5);
    }
}