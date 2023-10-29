package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubtractionTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void SubtractionTest1(){
        double expected = 2;
        double actual = Console.subtract(6, 4);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test
    public void SubtractionTest2(){
        double expected = -7;
        double actual = Console.subtract(0, 7);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test
    public void SubtractionTest3(){
        double expected = -3;
        double actual = Console.subtract(-9, -6);
        Assert.assertEquals(expected, actual, 0.0003f);
    }
}