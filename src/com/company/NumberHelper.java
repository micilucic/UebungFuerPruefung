package com.company;

import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};

        System.out.println(Arrays.toString(getFlatArray(numbers)));
    }

    public static int[] getFlatArray(int[][] numbers) {
        int arrayLenghtCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            arrayLenghtCount = arrayLenghtCount + numbers[i].length;
        }
        int [] newArray = new int [arrayLenghtCount];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                newArray[count] = numbers [i][j];
                count++;
            }
        }
        return newArray;
    }
}
