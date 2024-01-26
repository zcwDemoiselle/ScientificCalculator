package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void MultiplicationTest1(){
        double expected = 24;
        double actual = Console.multiplication(6, 4);
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void MultiplicationTest2(){
        double expected = 0;
        double actual = Console.multiplication(0, 7);
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void MultiplicationTest3(){
        double expected = 54;
        double actual = Console.multiplication(-9, -6);
        Assert.assertEquals(expected, actual, 0.1);
    }
}
