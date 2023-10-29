package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InverseCosineTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void InverseCosineTest1(){
        double expected = 720;
        double actual = Console.inverseCosine(6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void InverseCosineTest2(){
        double expected = 720;
        double actual = Console.inverseCosine(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void InverseCosineTest3(){
        double expected = 720;
        double actual = Console.inverseCosine(-7);
        Assert.assertEquals(expected, actual);
    }
}