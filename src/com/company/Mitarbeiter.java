package com.company;

import com.sun.source.tree.BreakTree;

public class Mitarbeiter {

    String vorname = "Hansi";
    String nachname = "Mayer";
    double gehalt;


    public double monatsAbrechnung() {
        
       double erg = gehalt * 12;
        // Wenn man z.B. 20 % abziehen soll, kann man statt erg = erg - (erg * (20/100));

        double einkommensStr = 0;
        double nochZuVersteuern;
        double versErg = erg * 0.8;
        nochZuVersteuern = versErg;

        if ( nochZuVersteuern >= 50001) {
            einkommensStr = (nochZuVersteuern - ((nochZuVersteuern - 50000) * 0.6) - (20000 * 0.45) - (10000 * 0.32) - (10000 * 0.2) - (10000 * 0.1));
        } else if (nochZuVersteuern > 30000 && nochZuVersteuern < 50000) {
            einkommensStr = ((nochZuVersteuern - (nochZuVersteuern - 30000) * 0.45) - (10000 * 0.32) - (10000 * 0.2) - (10000 * 0.1));
        } else if (nochZuVersteuern > 20000 && nochZuVersteuern < 30000) {
            einkommensStr = (nochZuVersteuern - (nochZuVersteuern - 20000) * 0.32) - (10000 * 0.2) - (10000 * 0.1);
        } else if (nochZuVersteuern > 10000 && nochZuVersteuern < 20000) {
            einkommensStr = (nochZuVersteuern  - ((nochZuVersteuern - 10000)* 0.2) - (10000 * 0.1));
        } else if (nochZuVersteuern <= 10000) {
            einkommensStr = (nochZuVersteuern - (nochZuVersteuern * 0.1));
        }
        return einkommensStr;
    }

   
    public static void main(String[] args) {

        Mitarbeiter Peter = new Mitarbeiter();

        Peter.vorname = "Peter";
        Peter.nachname = "Lech";
        Peter.gehalt = 2333.33;

        //System.out.println(Peter.monatsAbrechnung(34255.0));

        System.out.println(Peter.monatsAbrechnung()/12);

    }
}
