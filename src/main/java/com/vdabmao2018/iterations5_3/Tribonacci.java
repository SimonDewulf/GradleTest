package com.vdabmao2018.iterations5_3;

public class Tribonacci {
    public static void main(String[] args) {

        int n = 20;
        int a = 0;
        int b = 1;
        int c = 1;
        int sum = 0;


        for (int i = 0; i < n; i++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
            System.out.println(sum);
        }

    }
}
