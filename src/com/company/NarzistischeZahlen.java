package com.company;

public class NarzistischeZahlen {
    public static void main(String[] args) {
        int number = 153;


        /*System.out.println(Math.pow(153 % 100 / 10, 3));
        System.out.println(153%100/10);
        System.out.println(153%10);
        System.out.println(153/100);
        System.out.println(Math.pow(number % 10,3)); */

        narzistischeZahlenBerechnen();
    }

    public static void narzistischeZahlenBerechnen() {
        for (int i = 1; i < 1000; i++) {
            if (i == Math.pow(i / 100, 3) + (Math.pow(i % 100 / 10, 3)) + (Math.pow(i % 10, 3))) {
                System.out.println(i);
            }
        }
    }
}
