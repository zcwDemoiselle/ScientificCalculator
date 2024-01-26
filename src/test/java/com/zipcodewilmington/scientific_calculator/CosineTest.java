package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CosineTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void CosineTest1(){
        double expected = 0.8775825618903728;
        double actual = Console.cosine(0.5);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test
    public void CosineTest2(){
        double expected = 0.5403023058681398;
        double actual = Console.cosine(-1);
        Assert.assertEquals(expected, actual, .00000000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CosineTest3(){
        Console.cosine(2);
    }
}