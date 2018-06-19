package com.vdabmao2018.conditions5_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Taxation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("enter your gross income");
        double grossIncome = sc.nextDouble();
        double tax;
        double netIncome;

        //defining tax brackets
        double incomeBracket1 = 8680;
        double incomeBracket2 = 12360;
        double incomeBracket3 = 20600;
        double incomeBracket4 = 37750;

        //defining tax rates
        double socialSecurityRate = 0.1307;
        double rateBelow1 = 0.25;
        double rate1to2 = 0.30;
        double rate2to3 = 0.40;
        double rate3to4 = 0.45;
        double rateAbove4 = 0.50;

        double socialSecurityValue = grossIncome * socialSecurityRate;
        double startTaxableIncome = grossIncome - socialSecurityValue;
        double taxableIncome = startTaxableIncome;

        System.out.println("social security value: " + df.format(socialSecurityValue));
        System.out.println("taxable income value: " + df.format(startTaxableIncome));

        if (startTaxableIncome < incomeBracket1) {
            tax = taxableIncome * rateBelow1;
            System.out.println("tax value: " + df.format(tax));

            netIncome = startTaxableIncome - tax;
            System.out.println("net income value: " + df.format(netIncome));

        } else if (startTaxableIncome < incomeBracket2) {
            tax = incomeBracket1 * rateBelow1;
            taxableIncome = taxableIncome - incomeBracket1;
            tax = tax + taxableIncome * rate1to2;
            System.out.println("tax value: " + df.format(tax));

            netIncome = startTaxableIncome - tax;
            System.out.println("net income Value: " + df.format(netIncome));

        } else if (startTaxableIncome < incomeBracket3) {
            tax = incomeBracket1 * rateBelow1;
            taxableIncome = taxableIncome - incomeBracket1;
            tax = tax + (incomeBracket2 - incomeBracket1) * rate1to2;
            taxableIncome = taxableIncome - (incomeBracket2 - incomeBracket1);
            tax = tax + taxableIncome * rate2to3;
            System.out.println("tax value " + df.format(tax));

            netIncome = startTaxableIncome - tax;
            System.out.println("net income value: " + df.format(netIncome));

        } else if (startTaxableIncome < incomeBracket4) {
            tax = incomeBracket1 * rateBelow1;
            taxableIncome = taxableIncome - incomeBracket1;
            tax = tax + (incomeBracket2 - incomeBracket1) * rate1to2;
            taxableIncome = taxableIncome - (incomeBracket2 - incomeBracket1);
            tax = tax + (incomeBracket3 - incomeBracket2) * rate2to3;
            taxableIncome = taxableIncome - (incomeBracket3 - incomeBracket2);
            tax = tax + taxableIncome * rate3to4;
            System.out.println("tax value: " + df.format(tax));

            netIncome = startTaxableIncome - tax;
            System.out.println("net Income value: " + df.format(netIncome));

        } else {
            tax = incomeBracket1 * rateBelow1;
            taxableIncome = taxableIncome - incomeBracket1;
            tax = tax + (incomeBracket2 - incomeBracket1) * rate1to2;
            taxableIncome = taxableIncome - (incomeBracket2 - incomeBracket1);
            tax = tax + (incomeBracket3 - incomeBracket2) * rate2to3;
            taxableIncome = taxableIncome - (incomeBracket3 - incomeBracket2);
            tax = tax + (incomeBracket4 - incomeBracket3) * rate3to4;
            taxableIncome = taxableIncome - (incomeBracket4 - incomeBracket3);
            tax = tax + taxableIncome * rateAbove4;
            System.out.println("tax value: " + df.format(tax));

            netIncome = startTaxableIncome - tax;
            System.out.println("net income value: " + df.format(netIncome));


        }
    }
}