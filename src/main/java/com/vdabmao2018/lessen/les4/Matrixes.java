package com.vdabmao2018.lessen.les4;

public class Matrixes {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 0},
                {2, 3, 4}
        };


        int[][] matrix2 = {
                {1, 2},
                {3, 2},
                {1, 4}
        };


        //matrix1: 2X3
        //matrix2: 3X2

        int[][] product = {
                {matrix1[0][0] * matrix2[0][0] + matrix1[0][1] * matrix2[1][0] + matrix1[0][2] * matrix2[2][0],
                        matrix1[0][0] * matrix2[0][1] + matrix1[0][1] * matrix2[1][1] + matrix1[0][2] * matrix2[2][1]},
                {matrix1[1][0] * matrix2[0][0] + matrix1[1][1] * matrix2[1][0] + matrix1[1][2] * matrix2[2][0],
                        matrix1[1][0] * matrix2[0][1] + matrix1[1][1] * matrix2[1][1] + matrix1[1][2] * matrix2[2][1]}
        };

        System.out.println(product[0][0] + "  " + product[0][1]);
        System.out.println(product[1][0] + " " + product[1][1]);


    }


}

//bepaal 2 matrixen adhb ARrays (2d => dubbelArrays)
//vermenigvuldig ze. (google)



