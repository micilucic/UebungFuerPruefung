package com.company;

public class ArraySum {
    public static void main(String[] args) {
        int [] array = new int [] {1, 4,5, 6};

        System.out.println(calculateSum(array));
    }
    public static int calculateSum (int[] numbers) {
       int sum = 0;
        for (int i = 0; i < numbers.length; i++ ) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
