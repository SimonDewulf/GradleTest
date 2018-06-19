package com.vdabmao2018.lessen.les9;

import java.nio.BufferOverflowException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        boolean isNotNumber = true;
        String bewerking;
        double result;
        double getala = 0;
        double getalb = 0;
        Bewerking test = Bewerking.NIETS;


        while (isNotNumber) {

            try {
                System.out.println("geef getal a op");
                getala = sc.nextDouble();
                System.out.println("geef getal b op");
                getalb = sc.nextDouble();

                System.out.println("geef een bewerking op, optellen, aftrekken, vermenigvuldigen of delen");


                bewerking = sc.nextLine();
                bewerking = sc.nextLine();
                bewerking = bewerking.toUpperCase();
                test = Bewerking.valueOf(bewerking);


                isNotNumber = false;
            } catch (InputMismatchException | IllegalArgumentException a) {
                sc.nextLine();
                System.out.println("geen getal of geen bewerking");
                a.printStackTrace();
            }
        }

            test.bewerking(getala, getalb);
    }
}
