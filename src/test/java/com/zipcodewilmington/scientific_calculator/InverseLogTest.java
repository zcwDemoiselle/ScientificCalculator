package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InverseLogTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void InverseLog1(){
        double expected = 3.1622776601683795;
        double actual = Console.logInverse(0.5);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test
    public void InverseLog2(){
        double expected = 10.0;
        double actual = Console.logInverse(1);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void InverseLog3(){
        Console.inverseSine(2);
    }
}

