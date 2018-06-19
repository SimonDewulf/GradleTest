package main.java.com.vdabmao2018.lessen.les11;

import java.util.Scanner;
import static java.lang.Math.*;

public class Fraction {
    int teller;
    int noemer;

    public Fraction(int teller, int noemer) {
        this.teller = teller;
        this.noemer = noemer;
    }




    public Fraction simplify(){

        int grootsteGemeneDeler = greatestCommonFactor(this.teller, this.noemer);

       int t = this.teller/ grootsteGemeneDeler;
       int n = this.noemer/ grootsteGemeneDeler;

       Fraction result = new Fraction(t, n);


        return result;
    }

    public Fraction addFraction(Fraction a){

        int resultNoemer = this.noemer * a.noemer;
        int firstTeller = this.teller * a.noemer;
        int Secondteller = a.teller * this.noemer;

        int resultTeller = firstTeller + Secondteller;

        Fraction result = new Fraction(resultTeller, resultNoemer);
        return result.simplify();
    }



    public Fraction subtractFraction(Fraction a){


        int resultNoemer = this.noemer * a.noemer;
        int firstTeller = this.teller * a.noemer;
        int Secondteller = a.teller * this.noemer;

        int resultTeller = firstTeller - Secondteller;

        Fraction result = new Fraction(resultTeller, resultNoemer);



        return result.simplify();


    }


    public Fraction multiplyFraction(Fraction a){

        int resultNoemer = this.noemer*a.noemer;

        int resultTeller = this.teller*a.teller;

        Fraction result = new Fraction(resultTeller, resultNoemer);


        result.simplify();

        return result;


    }

    public Fraction divideFraction(Fraction a){

        int resultNoemer = this.noemer*a.teller;

        int resultTeller = this.teller*a.noemer;

        Fraction result = new Fraction(resultTeller, resultNoemer);


        result.simplify();

        return result;

    }

    public void printFraction(){

        System.out.println(this.teller);
        System.out.println("-----");
        System.out.println(this.noemer);
        System.out.println();


    }



    public static int greatestCommonFactor(int a, int b) {
        if(a == 0 || b == 0) {
            return 1;
        }

        a = abs(a);
        b = abs(b);
        if(a < b) {
            return greatestCommonFactor(b, a);
        }

        int delta = a % b;
        if(delta == 0) {
            return b;
        } else {
            return greatestCommonFactor(b, delta);
        }
    }


    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public void setNoemer(int noemer) {
        this.noemer = noemer;
    }
}



