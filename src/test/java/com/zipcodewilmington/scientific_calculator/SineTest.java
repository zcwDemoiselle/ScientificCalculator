package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SineTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void SineTest1(){
        double expected = 0.479425538604203;
        double actual = Console.sine(0.5);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test
    public void SineTest2(){
        double expected = 0.8414709848078965;
        double actual = Console.sine(1);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SineTest3(){
        Console.sine(2);
    }
}