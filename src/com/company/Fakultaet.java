package com.company;

public class Fakultaet {
    public static void main(String[] args) {

        System.out.println(calcFaculty(6));
    }

    public static long calcFaculty(int value) {
        int erg = 1;
        for (int i = 1; i <= value; i++) {
              erg = erg * i;
        }
        return erg;
    }
}
