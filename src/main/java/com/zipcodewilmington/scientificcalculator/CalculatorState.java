package com.zipcodewilmington.scientificcalculator;

public class CalculatorState {
    private double currentValue;

    public CalculatorState() {
        this.currentValue = 0;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double value) {
        this.currentValue = value;
    }

    public void clearDisplay() {
        this.currentValue = 0;
    }


}

