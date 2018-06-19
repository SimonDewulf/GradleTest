package com.vdabmao2018.extraOefeningen;

public class SumAndAverage {
    public static void main(String[] args) {

        double sum = 0;
        double i = 1;


        for (i = 1; i <= 100; i++) {

            sum = sum + i;
        }

        double average = sum / (i - 1);
        System.out.println("the sum is: " + sum);
        System.out.println("the average is: " + average);

        //why isn't it bloody taking everything as double... literally everything is a double.


    }
}
