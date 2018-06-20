package com.vdabmao2018.lessen.les6;

import com.vdabmao2018.lessen.les5.beehive.Worker;

public class AdressMain {
    public static void main(String[] args) {

        Adress bestemming = new Adress(
                "Frank Deboosere",
                "kokstraat", "89",
                "8620",
                "Nieuwpoort");



        System.out.println(bestemming.getCity());
    }
}
