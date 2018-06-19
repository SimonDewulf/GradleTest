package com.vdabmao2018.expressions5_1;

import java.util.Scanner;

public class NameRecogniser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String firstName = input.substring(0, input.indexOf(" "));
        String lastName = input.substring(input.indexOf(" "), input.length());

        System.out.print(firstName);
        System.out.println(lastName.toUpperCase());

    }
}
