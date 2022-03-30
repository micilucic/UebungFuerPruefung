package com.company;

public class PingPong {
    public static void main(String[] args) {


      /*  int i = 1;
        while (i <= 100) {
            if (i % 6 == 0) {
                System.out.println(i + " ping");
            } else if (i % 3 == 0) {
                System.out.println(i + " pong");
            } else if (i % 2 == 0) {
                System.out.println(i + " ping pong");
            } else {
                System.out.println(i + " -");
            }
            i++;
       } */

        for (int i = 1; i <= 100; ++i) {
            if (i % 6 == 0) {
                System.out.println(i + " ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + " pong");
            } else if (i % 2 == 0) {
                System.out.println(i + " ping");
            } else {
                System.out.println(i + " -");
            }
        }
    }
}
