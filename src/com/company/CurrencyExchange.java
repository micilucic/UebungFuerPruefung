package com.company;

public class CurrencyExchange {
    public static void main(String[] args) {

        System.out.println(exchangeCurrency("USD", 10.0));
    }

    public static double exchangeCurrency(String currencyID, double value) {

        if (currencyID.equals("HUF")) {
            value = value * 328.61;
        } else if (currencyID.equals("SEK")) {
            value = value * 10.76;
        } else if (currencyID.equals("USD")) {
            value = value * 1.12;
        } else if (currencyID.equals("CAD")) {
            value = value * 1.47;
        }
        return value;
    }
}

