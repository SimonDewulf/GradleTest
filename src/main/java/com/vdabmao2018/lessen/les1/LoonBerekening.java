package com.vdabmao2018.lessen.les1;

import java.util.Scanner;

public class LoonBerekening {
    public static void main(String[] args) {

        float loon = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("geef aantal dagen gewerkt in: ");
        float aantalDagen = sc.nextInt();
        float loonPerDag = 100;

        System.out.println("geef aantal kinderen in ");
        int aantalKinderen = sc.nextInt();
        float bedragPerKind = 50;

        System.out.println("geef in \"true\" voor bedrijfswagen en \"false\" voor geen bedrijfswagen");
        boolean bedrijfswagen = sc.nextBoolean();
        float bedragZonderBedrijfsWagen = 150;


        loon = loon + aantalDagen * loonPerDag;
        loon = loon + aantalKinderen * bedragPerKind;

        if (!bedrijfswagen) {
            loon = loon + bedragZonderBedrijfsWagen;
        }

        System.out.println(loon);

    }
}
