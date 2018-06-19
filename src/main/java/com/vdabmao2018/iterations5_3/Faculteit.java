package com.vdabmao2018.iterations5_3;

import java.util.Scanner;

public class Faculteit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        long input = sc.nextLong();
        long faculty = input;


        for (long i = input - 1; i > 1; i--) {

            faculty = faculty * i;
        }

        System.out.println(faculty);

    }
}
