package com.vdabmao2018.extraOefeningen.methods;

public class PrintArray {
    public static void main(String[] args) {

        int[] a = {5, 5, 6, 3, 4, 5, 8, 5, 4, 5};

        printArray(a);
    }

    public static void printArray(int[] a) {

        //take int array, print contents in the form of a1, a2, a2, ... an
        int i = 0;

        for (i = 0; i < a.length - 1; i++) {

            System.out.print("a" + a[i] + ", ");
        }
        System.out.println("a" + a[i]);
    }
}
