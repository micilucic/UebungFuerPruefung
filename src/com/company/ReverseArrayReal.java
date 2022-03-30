package com.company;

import java.util.Arrays;

public class ReverseArrayReal {
    public static void main(String[] args) {

        int[] original = new int[]{1, 2, 3, 4};

        System.out.println("Original order: " + Arrays.toString(original));
        int [] newlyOrderd = reverse(original);
        System.out.println("New order: " + Arrays.toString(newlyOrderd));
    }

    public static int[] reverse(int[] original) {

        int[] newOrderArray = new int[original.length];

        for (int i = original.length - 1; i >= 0; i--) {
            //da speichert man mit original[i] den Wert im neuen Array auf der Stelle 0
            //weil original.lenght ist 4 - 1 - 3 = 0!!!!
            newOrderArray[original.length - 1 - i] = original[i];
        }
        return newOrderArray;
    }
}

