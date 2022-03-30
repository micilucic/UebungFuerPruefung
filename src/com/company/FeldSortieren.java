package com.company;

import java.util.Arrays;

public class FeldSortieren {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 4, 1};

        arrangeOrder(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void arrangeOrder(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int tempStorage = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = tempStorage;
            }
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                arrangeOrder(numbers);
            }
        }
    }
}
