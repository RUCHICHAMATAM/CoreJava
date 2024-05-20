package com.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        ICCalculator calculator = new CasioCalculator();
        int result=calculator.add(6,90);
        System.out.println("Result "+result);
    }
}
