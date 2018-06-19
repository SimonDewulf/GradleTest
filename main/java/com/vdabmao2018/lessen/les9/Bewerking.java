package com.vdabmao2018.lessen.les9;

public enum  Bewerking {


    OPTELLEN(),
    AFTREKKEN(),
    VERMENIGVULDIGEN(),
    DELEN(),
    NIETS();




public void bewerking(double a, double b){
    switch (this) {
        case OPTELLEN:
            optellen(a, b);
            break;
        case AFTREKKEN:
            aftrekken(a, b);
            break;
        case VERMENIGVULDIGEN:
            vermenigvuldigen(a, b);
            break;
        case DELEN:
            delen(a, b);
            break;
        default:
            System.out.println("geen geldige bewerking");
    }

}

    public void optellen(double a, double b){
        double c = a + b;
        System.out.println(c);
    }

    public void aftrekken(double a, double b){
        double c = a - b;
        System.out.println(c);
    }

    public void vermenigvuldigen(double a, double b){
        double c = a*b;
        System.out.println(c);
    }
    public void delen(double a, double b){
        try{
            double c = a / b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("delen door nul is flauwekul");
        }
    }


    Bewerking() {

    }
}
