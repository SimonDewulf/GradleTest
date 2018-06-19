package com.vdabmao2018.lessen.les1;

public class PopulationIncrease {
    public static void main(String[] args) {


        long startingPopulation = 3120312486L;
        double secondsPerYear = 31536000;
        double population = startingPopulation;

        double birthsPerSecond = 1 / 7;
        double deathsPerSecond = 1 / 13;
        double immigrantsPerSecond = 1 / 45;


        double birthsPerYear = secondsPerYear * birthsPerSecond;
        double deathsPerYear = secondsPerYear * deathsPerSecond;
        double immigrantsPerYear = secondsPerYear * immigrantsPerSecond;

        for (int i = 0; i < 5; i++) {
            population = population + birthsPerYear + immigrantsPerYear - deathsPerYear;
            System.out.println("the population after year " + i + " equals " + population);
        }


    }
}
