package com.calculator;

public class IBMCalculator implements ICCalculator{
    @Override
    public int add(int num1,int num2){
        return num1+num2;
    }
}
