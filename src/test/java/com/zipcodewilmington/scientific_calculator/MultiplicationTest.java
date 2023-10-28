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
        int expected = 24;
        int actual = Console.multiplication(6, 4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MultiplicationTest2(){
        int expected = 0;
        int actual = Console.multiplication(0, 7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MultiplicationTest3(){
        int expected = 54;
        int actual = Console.multiplication(-9, -6);
        Assert.assertEquals(expected, actual);
    }
}
