package com.company;

public class Strafe {

    String vorname;
    String nachname;
    String kennzeichen;

    int strafnummer;
    double strafe;
    int anzahl;

    public void strafe(int geschwindigkeitsüberschreitung) {



        if (geschwindigkeitsüberschreitung < 20) {
            strafe = strafe + 30;
        } else if (geschwindigkeitsüberschreitung < 30) {
            strafe = strafe + 50;
        } else if (geschwindigkeitsüberschreitung < 50) {
            strafe = strafe + 100;
        } else if (geschwindigkeitsüberschreitung < 100) {
            strafe = strafe + 500;
        } else {
            strafe = strafe + 1500;
        }
        anzahl++;

    }

    public void verbandspaket() {
        strafe = strafe + 25;
        anzahl++;
    }

    public void alkohol(double alk) {
        if (alk > 0.5 && alk < 1.0) {
            strafe = strafe + 100;
        } else if (alk > 1.0 && alk < 2.0) {
            strafe = strafe + 400;
        } else if (alk > 2.0 && alk < 3.0) {
            strafe = strafe + 1000;
        } else if (alk > 3.0) {
            strafe = strafe + 5000;
        }
        anzahl = anzahl + 2;
    }

    public void sonstiges(double wert) {
        strafe = strafe + wert;
        anzahl++;
    }

    public double getStrafe() {

        double discount = 0;

        if (anzahl == 1) {
            discount = strafe - (strafe * (0.3));
        } else if (anzahl == 2) {
            discount = strafe - (strafe * (0.2));
        } else if (anzahl == 3) {
            discount = strafe - (strafe * (0.1));
        } else {
            discount = strafe;
            System.out.println("Hansi goes to prison !");
        }
        return discount;
    }


    public static void main(String[] args) {

        Strafe hansi = new Strafe();


        hansi.vorname = "Hansi";
        hansi.nachname = "Meier";
        hansi.kennzeichen = "GU 321-654";


       hansi.strafe(55);
        System.out.println(hansi.strafe);


        System.out.println(hansi.anzahl);

        System.out.println(hansi.getStrafe());
        System.out.println("-------");

        hansi.verbandspaket();
        System.out.println(hansi.strafe);

        System.out.println(hansi.anzahl);

        System.out.println("----");
        System.out.println(hansi.getStrafe());
        hansi.alkohol(0.9);
        System.out.println(hansi.strafe);

        System.out.println(hansi.anzahl);


    }
}