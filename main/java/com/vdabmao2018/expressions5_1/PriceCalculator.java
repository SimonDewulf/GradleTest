package com.vdabmao2018.expressions5_1;

public class PriceCalculator {
    public static void main(String[] args) {

        int price = 35;
        int quantity = 5;
        int taxrate = 21;

        double priceDouble = price;
        double quantityDouble = quantity;
        double taxrateDouble = taxrate;

        double priceCaltulator = (priceDouble * quantityDouble) + (priceDouble * quantityDouble * (taxrateDouble / 100));
        System.out.println(priceCaltulator);

    }
}
