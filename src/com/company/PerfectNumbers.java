package com.company;

public class PerfectNumbers {
    public static void main(String[] args) {
        int perfectNum;
        int num;

        for (int i = 1; i < 100000000; i ++) {
            if (isPerfectNumber(i)) {
                System.out.println(i + " is a perfect number !");
            }
        }
    }
    public static boolean isPerfectNumber (int number) {
        if (number == sumOfRealDivisors(number)) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOfRealDivisors (int number) {
      int sum = 0;

      for (int i = 1; i <= number / 2; i++) {
          if (number % i == 0) {
              sum = sum + i;
          }
      } return sum;
    }
}
