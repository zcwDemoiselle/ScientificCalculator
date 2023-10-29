package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareRootTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void SquareRootTest1(){
        double expected = 2;
        double actual = Console.squareRoot(4);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test
    public void SquareRootTest2(){
        double expected = 0;
        double actual = Console.squareRoot(0);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test(expected = IllegalArgumentExpression.class)
    public void SquareRootTest3(){
        //double expected = new.IllegalArgumentExpression.class;
        double actual = Console.squareRoot(-9);
        Assert.assertEquals(expected, actual, 0.0003f);
    }
}

