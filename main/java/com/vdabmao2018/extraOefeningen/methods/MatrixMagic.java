package com.vdabmao2018.extraOefeningen.methods;

import java.util.Scanner;

public class MatrixMagic {
    public static void main(String[] args) {

        int[][] matrix1 = matrixConstruct();
        int[][] matrix2 = matrixConstruct();


        System.out.println("test whether these matrices are multiplicable returns: " + multiplicationTest(matrix1, matrix2));

            if (multiplicationTest(matrix1, matrix2)) {

                int[][] product = product(matrix1, matrix2);
                System.out.println("multiplying these matrices returns");
                print2DArray(product);
            } else {
                System.out.println("you cannot multiply these matrices.");
            }

            if (isEqualDimensions(matrix1, matrix2)) {
                int[][] sum = addition(matrix1, matrix2);
                System.out.println("adding these matrices returns: ");
                print2DArray(sum);
            }

            if (isEqualDimensions(matrix1, matrix2)) {
                int[][] subtract = subtraction(matrix1, matrix2);
                System.out.println("subtracting these matrices returns: ");
                print2DArray(subtract);
        }
    }

    public static boolean multiplicationTest(int[][] a, int[][] b) {

        //acolumntest takes the first row of the first array => acolumntest.length is the amount of collums in the array
        //if the length of acolumntest equals the length of array[][] b then and only then do they have a product


        int[] acolumntest = a[0];
        return acolumntest.length == b.length;
    }

    public static int[][] product(int[][] a, int[][] b) {

        /*
        a b c      a b
        d e f      c d
                   e f
         */
        int[] columnsofa = a[0];
        int[] columnsOfb = b[0];
        int[][] product = new int[a.length][columnsOfb.length];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < columnsOfb.length; j++) {
                for (int k = 0; k < columnsofa.length; k++) {
                    product[i][j] = product[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        return product;

    }


    public static int[][] matrixConstruct() {
        Scanner sc = new Scanner(System.in);

        System.out.println("you will be instructed to enter a matrix");
        System.out.print("enter the AMOUNT of rows of the matrix: ");
        int rowsOfMatrix1 = sc.nextInt();
        System.out.print("enter the AMOUNT of columns of the matrix: ");
        int columnsOfMatrix1 = sc.nextInt();

        int[][] a = new int[rowsOfMatrix1][columnsOfMatrix1];

        System.out.println("enter the matrix as instructed");

        for (int i = 1; i <= rowsOfMatrix1; i++) {
            for (int j = 1; j <= columnsOfMatrix1; j++) {

                System.out.print("enter number " + j + " of row " + i + ": ");
                a[i - 1][j - 1] = sc.nextInt();
            }
        }

        return a;
    }

    public static void print2DArray(int[][] a) {


        int[] columnsOfa = a[0];
        for (int i = 0; i < a.length; i++) {                              //die for each loop notatie suggestie lijkt me vreemd
            System.out.println();
            for (int j = 0; j < columnsOfa.length; j++) {

                System.out.print(a[i][j] + "    ");
            }
        }
        System.out.println();
    }

    public static boolean isEqualDimensions(int[][] a, int[][] b) {
        boolean isEqualDimensions;

        int[] columnsOfA = a[0];
        int[] columnsOfB = b[0];

        if (a.length == b.length && columnsOfA.length == columnsOfB.length) {
            isEqualDimensions = true;
        } else {
            System.out.println("you cannot add or subtract these matrices");
            isEqualDimensions = false;
        }

        return isEqualDimensions;

    }

    public static int[][] addition(int[][] a, int[][] b) {

        int[] columns = a[0];
        int[][] sum = new int[a.length][columns.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < columns.length; j++) {
                sum[i][j] = sum[i][j] + a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static int[][] subtraction(int[][] a, int[][] b) {
        int[] columns = a[0];
        int[][] substract = new int[a.length][columns.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < columns.length; j++) {
                substract[i][j] = substract[i][j] + a[i][j] - b[i][j];
            }
        }
        return substract;
    }

}
