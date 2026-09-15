package Oppgave3;

import Oppgave2.HamburgerBrett;
import Oppgave2.Kokk;
import Oppgave2.Servitor;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        final String[] kokker = {"Yekaterina", "Yevdokiya", "Marina", "Irina"};
        final String[] servitorer = {"Yelyzaveta", "Petro", "Aksiniya"};
        final int KAPASITET = 4;

        System.out.println("I denne simuleringen har vi: ");
        System.out.println(kokker.length + " kokker " + Arrays.toString(kokker));
        System.out.println(servitorer.length + " servitører " + Arrays.toString(servitorer));
        System.out.println("Kapasiteten til brettet er " + KAPASITET + " hamburgere.");
        System.out.println("Vi starter ...");

        Oppgave2.HamburgerBrett brett = new HamburgerBrett(KAPASITET);
        for (String navn : kokker) {
            new Kokk(brett, navn).start();
        }
        for (String navn : servitorer) {
            new Servitor(brett, navn).start();
        }


    }

}