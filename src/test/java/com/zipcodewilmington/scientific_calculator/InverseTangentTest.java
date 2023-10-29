package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InverseTangentTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void InverseTangentTest1(){
        double expected = 0.46364760900081;
        double actual = Console.inverseTangent(0.5);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test
    public void InverseTangentTest2(){
        double expected = -0.78539816339745;
        double actual = Console.inverseTangent(-1);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void InverseTangentTest3(){
        Console.inverseTangent(2);
    }
}