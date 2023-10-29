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
        int expected = 720;
        int actual = Console.factorial(6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FactorialTest2(){
        int expected = 1;
        int actual = Console.factorial(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FactorialTest3(){
        int expected = -362880;
        int actual = Console.factorial(-9);
        Assert.assertEquals(expected, actual);
    }
}