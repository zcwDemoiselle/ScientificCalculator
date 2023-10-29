package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void FactorialTest1(){
        double expected = 720;
        double actual = Console.factorial(6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FactorialTest2(){
        double expected = 1;
        double actual = Console.factorial(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FactorialTest3(){
        double expected = -362880;
        double actual = Console.factorial(-9);
        Assert.assertEquals(expected, actual);
    }
}