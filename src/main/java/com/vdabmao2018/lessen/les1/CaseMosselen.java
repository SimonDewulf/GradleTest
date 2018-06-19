package com.vdabmao2018.lessen.les1;

import java.util.Scanner;

public class CaseMosselen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String maand = sc.nextLine();

        switch (maand) {

            case "januari":
            case "februari":
            case "maart":
            case "april":
                System.out.println("superlekker");
                break;
            case "mei":
            case "juni":
            case "juli":
            case "augustus":
                System.out.println("afblijven die handel");
                break;
            case "september":
            case "oktober":
            case "november":
            case "december":
                System.out.println("te klein");
                break;
            default:
                System.out.println("kweet nie op welke planeet dajgie leeft ma deze maand bestaat nie");
                break;


        }
    }
}
