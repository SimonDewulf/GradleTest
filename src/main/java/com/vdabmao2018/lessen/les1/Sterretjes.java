package com.vdabmao2018.lessen.les1;

public class Sterretjes {
    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            System.out.print("\n");

            for (int l = 40; l >= i; l--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("**");
            }
        }

        System.out.print("\n");
        for (int i = 0; i < 20; i++) {

            System.out.println("                                      *****");
        }
    }
}
