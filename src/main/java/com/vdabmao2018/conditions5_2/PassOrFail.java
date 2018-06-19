package com.vdabmao2018.conditions5_2;

public class PassOrFail {
    public static void main(String[] args) {

        int score = (int) (Math.random() * 100);

        if (score >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }


    }
}
