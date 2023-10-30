package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TangentTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void TangentTest1(){
        double expected = 0.54630248984;
        double actual = Console.tangent(0.5);
        Assert.assertEquals(expected, actual, .00000000001);
    }

    @Test
    public void TangentTest2(){
        double expected = 1.55740772465;
        double actual = Console.tangent(1);
        Assert.assertEquals(expected, actual, .00000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TangentTest3(){
        Console.tangent(2);
    }
}