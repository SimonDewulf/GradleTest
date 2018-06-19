package com.vdabmao2018.iterations5_3;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {

        /*
         Write a program called ExtractDigits to extract each digit from an int, in the reverse order.
         For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.

Hints: Use n % 10 to extract the least-significant digit; and n = n / 10 to discard the least-significant digit.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an int");
        int input = sc.nextInt();

        for (int i = 1; i < 1000; i++) {
            System.out.println(input % 10);

            if (input < 10) {
                i += 1000;
            }
            input = (input / 10);
        }
    }
}
