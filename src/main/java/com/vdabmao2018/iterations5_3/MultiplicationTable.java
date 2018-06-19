package com.vdabmao2018.iterations5_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print(i * j + " ");
                if (j % input == 0) {
                    System.out.println();
                }
            }
        }
    }
}
