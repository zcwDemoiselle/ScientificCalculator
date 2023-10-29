package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InverseSineTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void InverseSineTest1(){
        double expected = 0.5235987755983;
        double actual = Console.inverseSine(0.5);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test
    public void InverseSineTest2(){
        double expected = -1.5707963267949;
        double actual = Console.inverseSine(-1);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void InverseSineTest3(){
        Console.inverseSine(2);
    }
}