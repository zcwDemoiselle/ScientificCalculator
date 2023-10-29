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
        int expected = 720;
        int actual = Console.inverseTangent(6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void InverseTangentTest2(){
        int expected = 720;
        int actual = Console.inverseTangent(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void InverseTangentTest3(){
        int expected = 720;
        int actual = Console.inverseTangent(-7);
        Assert.assertEquals(expected, actual);
    }
}