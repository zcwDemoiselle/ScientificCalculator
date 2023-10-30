package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivisionTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void DivisionTest1(){
        double expected = 1.5;
        double actual = Console.division(6, 4);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void DivisionTest2(){Console.division(7, 0);}

    @Test
    public void DivisionTest3(){
        double expected = 3;
        double actual = Console.division(9,3);
        Assert.assertEquals(expected, actual, 0.0003f);
    }
}