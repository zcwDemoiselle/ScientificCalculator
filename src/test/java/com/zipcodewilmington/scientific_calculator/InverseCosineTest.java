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
        double expected = 1.0471975511966;
        double actual = Console.inverseCosine(0.5);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test
    public void InverseCosineTest2(){
        double expected = 3.1415926535898;
        double actual = Console.inverseCosine(-1);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void InverseCosineTest3(){
        Console.inverseCosine(2);
    }
}