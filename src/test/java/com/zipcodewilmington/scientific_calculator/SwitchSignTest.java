package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SwitchSignTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void SwitchSignTest1(){
        double expected = -6;
        double actual = Console.switchSign(6);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test
    public void SwitchSignTest2(){
        double expected = 0;
        double actual = Console.switchSign(0);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test
    public void SwitchSignTest3(){
        double expected = 9;
        double actual = (int) Console.switchSign(-9);
        Assert.assertEquals(expected, actual, 0.0003f);
    }
}

