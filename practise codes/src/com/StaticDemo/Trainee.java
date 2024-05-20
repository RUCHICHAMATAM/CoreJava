package com.StaticDemo;

public class Trainee {
    private static int count;
    public Trainee(){
        count++;
    }

     public static int  getCount(Trainee trainee) {
        return trainee.count;
    }
}
