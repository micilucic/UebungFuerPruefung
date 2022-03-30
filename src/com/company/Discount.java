package com.company;

public class Discount {
    public static void main(String[] args) {
        boolean senior = false;
        boolean student = false;
        boolean dog = false;

        if (senior == true || student == true || dog == true) {
            System.out.println("Discount is valid.");
        } else {
            System.out.println("Discount is not valid.");
        }

        int nonFiction = 3;
        int fiction = 3;

        if (nonFiction > 2 && fiction >= 1) {
            System.out.println("Discount is valid.");
        } else {
            System.out.println("Discount is not valid.");
        }

        int alcoholic = 1;
        int nonAlcoholic = 2;

        if (alcoholic == 0 && nonAlcoholic <= 1) {
            System.out.println("Discount is valid.");
        } else {
            System.out.println("Discount is not valid.");
        }
    }
}
