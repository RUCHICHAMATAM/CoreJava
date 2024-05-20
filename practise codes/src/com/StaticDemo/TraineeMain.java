package com.StaticDemo;

public class TraineeMain {
    public static void main(String[] args){
        Trainee trainee1=new Trainee();
        Trainee trainee2=new Trainee();
        Trainee trainee3=new Trainee();
        Trainee trainee4=new Trainee();
        int count= Trainee.getCount(trainee2);
        System.out.println(count);

    }
}
