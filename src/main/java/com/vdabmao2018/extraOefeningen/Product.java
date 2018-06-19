package com.vdabmao2018.extraOefeningen;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a limit to where the product should go");
        int input = sc.nextInt();

        int product = 1;


        for (int i = 1; i < input; i++) {

            product = product * i;
            System.out.println(product);
        }
    }
}
