package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InverseTest {
    private Console scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new Console();
    }

    @Test
    public void InverseTest1(){
        double expected = 0.16666666666;
        double actual = Console.inverse(6);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test
    public void InverseTest2(){
        double expected = 1;
        double actual = Console.inverse(1);
        Assert.assertEquals(expected, actual, 0.0003f);
    }

    @Test(expected = IllegalAccessException.class)
    public void test() throws Exception {
        double actual = Console.inverse(0);
        Assert.assertEquals(null, actual, 0.0003f);

    }
}

