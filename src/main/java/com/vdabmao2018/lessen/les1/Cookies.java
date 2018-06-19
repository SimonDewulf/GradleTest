package com.vdabmao2018.lessen.les1;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numberOfCookies = sc.nextInt();

        double cookiesPerBag = 40;
        double servingsPerBag = 10;
        double caloriesPerServing = 300;

        double cookiesPerServing = cookiesPerBag / servingsPerBag;

        double caloriesPerCookie = caloriesPerServing / cookiesPerServing;

        double caloriesEaten = numberOfCookies * caloriesPerCookie;

        System.out.println(caloriesEaten);

    }
}
