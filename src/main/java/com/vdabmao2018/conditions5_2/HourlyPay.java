package com.vdabmao2018.conditions5_2;

import java.util.Scanner;


public class HourlyPay {
    public static void main(String[] args) {

        double grossPayPerWeekEmployee1;
        double grossPayPerWeekEmployee2;
        double grossPayPerWeekEmployee3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the first employee");
        String employee1 = sc.nextLine();

        System.out.println("enter " + employee1 + "'s hourly wage");
        double wageEmployee1 = sc.nextDouble();

        System.out.println("enter " + employee1 + "'s hours worked");
        double hoursThisWeekEmployee1 = sc.nextDouble();
        sc.nextLine(); //empty scanner to be consumed by some shitty stuff


        System.out.println("enter the name of the second employee");
        String employee2 = sc.nextLine();

        System.out.println("enter " + employee2 + "'s hourly wage");
        double wageEmployee2 = sc.nextDouble();

        System.out.println("enter " + employee2 + "'s hours worked");
        double hoursThisWeekEmployee2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("enter the name of the third employee");
        String employee3 = sc.nextLine();

        System.out.println("enter " + employee3 + "'s hourly wage");
        double wageEmployee3 = sc.nextDouble();

        System.out.println("enter " + employee3 + "'s hours worked");
        double hoursThisWeekEmployee3 = sc.nextDouble();

        if (hoursThisWeekEmployee1 <= 40) {
            grossPayPerWeekEmployee1 = hoursThisWeekEmployee1 * wageEmployee1;
        } else {
            grossPayPerWeekEmployee1 = hoursThisWeekEmployee1 * wageEmployee1 + (hoursThisWeekEmployee1 - 40) * 0.5 * wageEmployee1;
        }

        if (hoursThisWeekEmployee2 <= 40) {
            grossPayPerWeekEmployee2 = hoursThisWeekEmployee2 * wageEmployee2;
        } else {
            grossPayPerWeekEmployee2 = hoursThisWeekEmployee2 * wageEmployee2 + (hoursThisWeekEmployee2 - 40) * 0.5 * wageEmployee2;
        }

        if (hoursThisWeekEmployee3 <= 40) {
            grossPayPerWeekEmployee3 = hoursThisWeekEmployee3 * wageEmployee3;
        } else {
            grossPayPerWeekEmployee3 = hoursThisWeekEmployee3 * wageEmployee3 + (hoursThisWeekEmployee3 - 40) * 0.5 * wageEmployee3;
        }

        System.out.println(employee1 + "'s gross weekly wage amounts to: " + grossPayPerWeekEmployee1);
        System.out.println(employee2 + "'s gross weekly wage amounts to: " + grossPayPerWeekEmployee2);
        System.out.println(employee3 + "'s gross weekly wage amounts to: " + grossPayPerWeekEmployee3);

    }
}
