package com.company;

public class CapitalLetters {

    public static void main(String[] args) {

        String satz = "My name is milica lucic";
        System.out.println(capitalLetter(satz));

    }

    public static String capitalLetter(String letters) {
        String neuerSatz = "";

        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) == ' ') {
                neuerSatz = neuerSatz + " " + Character.toUpperCase(letters.charAt(i + 1));
                i++;
            } else {
                neuerSatz = neuerSatz + letters.charAt(i);
            }
        }
        return neuerSatz;
    }
}
