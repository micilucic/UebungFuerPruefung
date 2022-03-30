package com.company;

public class Zinsberechnung {
    public static void main(String[] args) {

        int kontostand = 2560;
        float zinsen = 1.5f;

        float erg = (kontostand * zinsen * 365) / (100*360);

        System.out.println(erg);

    }
}
