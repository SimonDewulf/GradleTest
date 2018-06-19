package com.vdabmao2018.extraOefeningen;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a maximum: ");
        int max = sc.nextInt();
        System.out.print("enter a minimum: ");
        int min = sc.nextInt();

        boolean isWon = false;

        double randomNumber = (int) (Math.random() * (max - min) + min);

        for (int i = 1; i <= 3; i++) {

            System.out.println("take a guess");
            int guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations");
                isWon = true;
                break;
            } else {
                if (i < 3) {
                    System.out.println("try again!");
                }
            }
        }

        if (!isWon) {
            System.out.println("game over");
        }
    }
}
