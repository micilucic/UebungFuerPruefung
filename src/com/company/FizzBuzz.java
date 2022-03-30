package com.company;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {

      /*  for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Fizz !");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz!");
            } else if (i % 3 == 0) {
                System.out.println(i + " FizzBuzz!");
            } else {
                System.out.println(i);
            } */
        System.out.println(fizzBuzz(15));
        System.out.println(Arrays.toString(fizzBuzzArray()));
        showArray(fizzBuzzArray());
    }


    public static String fizzBuzz(int number) {

        String both = "FizzBuzz!";
        String first = "Fizz";
        String second = "Buzz!";
        String erg;
        if (number % 3 == 0 && number % 5 == 0) {
            return both;
        } else if (number % 5 == 0) {
            return second;
        } else if (number % 3 == 0) {
            return first;
        } else {
            return "-";
        }
    }

    public static String[] fizzBuzzArray() {
        String[] array = new String[100];
        for (int i = 0; i < 100; i++) {
            array[i] = fizzBuzz(i + 1);
        }
        return array;
    }

    public static void showArray(String[] array) {
        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }
    }
}
