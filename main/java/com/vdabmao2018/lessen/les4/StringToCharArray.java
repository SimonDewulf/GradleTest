package com.vdabmao2018.lessen.les4;

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        char[] charArray = convertStringtoCharArray(input.toLowerCase());

        //a, e, i, o, u, y
        int[] alfabetArray = new int[26];


     /*   for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case 'A':
                    alfabetArray[0]++;
                    break;
                case 'E':
                    alfabetArray[1]++;
                    break;
                case 'I':
                    alfabetArray[2]++;
                    break;
                case 'O':
                    alfabetArray[3]++;
                    break;
                case 'U':
                    alfabetArray[4]++;
                    break;
                case 'Y':
                    alfabetArray[5]++;
                    break;
                default:
                    break;
            }
        }*/

     for(int i = 0; i<charArray.length; i++){

        //using ASCII numbers => the number the pc uses to represent the character => cast char as int and subtract 97(value of lowercase a) => apply to rest of alfabet.
        alfabetArray[(int)(charArray[i])-97]++;
     }
     //made a full alfabetArray. irl it depends on application. judge the value of flexibility according to time and effort invested





        System.out.println("number of a's: " + alfabetArray[0]);
        System.out.println("number of e's: " + alfabetArray[4]);
        System.out.println("number of i's: " + alfabetArray[8]);
        System.out.println("number of o's: " + alfabetArray[14]);
        System.out.println("number of u's: " + alfabetArray[20]);
        System.out.println("number of y's: " + alfabetArray[24]);
    }

    public static char[] convertStringtoCharArray(String in){

        char[] out = new char[in.length()];
        for(int i = 0; i < out.length; i++){
            out[i] = in.charAt(i);
        }

        return out;


    }
}
