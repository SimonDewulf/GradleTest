package com.vdabmao2018.extraOefeningen;

import java.util.Scanner;

public class GradesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students");
        int numberOfStudents = sc.nextInt();

        int[] gradesArray = new int[numberOfStudents];


        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("enter a grade");
            gradesArray[i] = sc.nextInt();
            if (gradesArray[i] > 100 || gradesArray[i] < 0) {
                System.out.println("invalid grade");
                i--;
            }

        }


    }
}
