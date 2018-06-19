package com.vdabmao2018.iterations5_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int a = 0;
        int b = 1;
        int n = sc.nextInt();

        System.out.print(a + " ");

        double average = 1;

        for (int i = 0; i <= n; i++) {
            int c = a;
            a = a + b;
            b = c;

            average = average + a;
            System.out.print(a + " ");
        }

        average = average / (n + 1);
        System.out.println("\n" + df.format(average));
    }
}
