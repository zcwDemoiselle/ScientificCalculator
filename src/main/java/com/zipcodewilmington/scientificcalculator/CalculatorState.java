package com.zipcodewilmington.scientificcalculator;

public class CalculatorState {
    private double currentValue;
    private double memoryValue;

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

    public void addToMemory() {
        memoryValue += currentValue;
    }

    public void resetMemory() {
        memoryValue = 0;
    }

    public void recallMemory() {
        currentValue = memoryValue;
    }

}

