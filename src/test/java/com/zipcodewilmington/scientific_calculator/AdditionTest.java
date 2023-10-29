package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void AdditionTest1(){
        double expected = 10;
        double actual = Console.addition(6, 4);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test
    public void AdditionTest2(){
        double expected = 7;
        double actual = Console.addition(0, 7);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test
    public void AdditionTest3(){
        double expected = -15;
        double actual = Console.addition(-9, -6);
        Assert.assertEquals(expected, actual, 0.0003f);
    }
}