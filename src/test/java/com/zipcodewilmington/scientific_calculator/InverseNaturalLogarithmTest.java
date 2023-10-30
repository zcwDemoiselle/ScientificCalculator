package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InverseNaturalLogarithmTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void InverseNaturalLogarithmTest1(){
        double expected = 20.085536923187668;
        double actual = Console.inverseNaturalLogarithm(3);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test
    public void InverseNaturalLogarithmTest2(){
        double expected = 2.7182818284590455;
        double actual = Console.inverseNaturalLogarithm(1);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void InverseNaturalLogarithmTest3(){
        Console.inverseNaturalLogarithm(-5);
    }
}