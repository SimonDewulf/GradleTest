package main.java.com.vdabmao2018.lessen.les1;

public class Bank {
    public static void main(String[] args) {


        double startKapitaal = 100000;
        double kapitaal = 100000;
        double rente = 0.035;
        int termijn = 10;

        for (int i = 1; i <= termijn; i++) {

            kapitaal = kapitaal * (1 + rente);
            System.out.println("na " + i + "jaren is uw startkapitaal van " + startKapitaal + " gegroeid tot " + kapitaal);
        }


    }
}
