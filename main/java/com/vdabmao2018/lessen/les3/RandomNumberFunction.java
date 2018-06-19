package com.vdabmao2018.lessen.les3;

public class RandomNumberFunction {


    public static int berekenRandomGetal(int min, int max) {
        //int is what gets returned from the function
        //void means no return from the function


        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        return randomNumber;

    }

    public static boolean priemgetal(int n) {
        boolean isPrime = true;

        for (long i = 2L; i <= n / 2; i++) {

            if (n % i == 0) {
                isPrime = false;

            }
        }


        return isPrime;

    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {


            boolean isRandomPrime = RandomNumberFunction.priemgetal(RandomNumberFunction.berekenRandomGetal(10, 110));

            System.out.println(isRandomPrime);

        }
    }
}