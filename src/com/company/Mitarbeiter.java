package com.company;

import com.sun.source.tree.BreakTree;

public class Mitarbeiter {

    String vorname;
    String nachname;
    double gehalt;
    int alter;


    public double monatsAbrechnung() {


        double erg = gehalt * 12;
        // Wenn man z.B. 20 % abziehen soll, kann man statt erg = erg - (erg * (20/100));
        erg = erg * (80 / 100);

        if (gehalt < 10000) {
            gehalt = erg - (gehalt * (10 / 100));
        } else if (gehalt > 10000 && gehalt < 20000) {
            erg = gehalt - (gehalt * (20 / 100));
        } else if (gehalt > 20000 && gehalt < 30000) {
            erg = gehalt - (gehalt * (32 / 100));
        } else if (gehalt > 30000 && gehalt < 50000) {
            erg = gehalt - (gehalt * (45 / 100));
        } else if (gehalt > 50.001) {
            erg = gehalt - (gehalt * (60 / 100));
        }
        return erg;
    }

    public static void main(String[] args) {

        Mitarbeiter Peter = new Mitarbeiter();

        Peter.vorname = "Peter";
        Peter.nachname = "Lech";
        Peter.gehalt = 45366;

        //System.out.println(Peter.monatsAbrechnung(34255.0));

        System.out.println(Peter.monatsAbrechnung());
    }
}
