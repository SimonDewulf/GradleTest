package com.vdabmao2018.lessen.les9;

import java.text.DecimalFormat;
import java.text.ParseException;

public class CheckedExceptions {
    public static void main(String[] args) {

//checked exceptions are expected by the classes below. yet there they couldn't try and catch them because they depend on the input
        //==> they are thrown according to following syntax: method() throws Xexception {method body}
        //this forces a try & catch higherup in the program, or the program won't compile. u can also delay it with another throw, but there will have to be a try & catch at some point


    DecimalFormat df = new DecimalFormat("#,##0.00£");

    double input = 4471515.04517146;
    int input2 = 35454;


    double input3 = 24684513546845354.54321354321354321;

        System.out.println(df.format(input));
        System.out.println(df.format(input2));
        System.out.println(df.format(input3));


        try {
            System.out.println(df.parse(df.format(input)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
