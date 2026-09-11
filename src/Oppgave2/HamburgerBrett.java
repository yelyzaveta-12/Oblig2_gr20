package Oppgave2;


import java.util.ArrayList;
import java.util.List;

public class HamburgerBrett {

    private int kapasitet;
    public HamburgerBrett(int kapasitet) {
        this.kapasitet = kapasitet;
    }
    private List<Hamburger> brett = new ArrayList<>();

    public synchronized void leggTil(Hamburger hamburger) {
        while(brett.size() >= kapasitet){

            System.out.println(Thread.currentThread().getName() +
                    "(kokk) klar med hamburger, men brett fullt. Venter!");


            try{
                wait();
            } catch (InterruptedException e) {
                return;
            }

            brett.add(hamburger);
            System.out.println(Thread.currentThread().getName()
                    + "(kokk) legger på hamburger ◖" + hamburger + "◗. Brett: ◖" + brett + "◗");

            notifyAll();
        }
    }

    public synchronized Hamburger taAv() {
        while(brett.isEmpty()){

            System.out.println(Thread.currentThread().getName() +
                    "(servitør) ønsker å ta hamburger, men brett tomt. Venter!" );
            try {
                wait();
            } catch (InterruptedException e) {
                return null;
            }
        }

        Hamburger hamburger = brett.get(0);
        System.out.println(Thread.currentThread().getName() +
                "(servitør) tar av hamburger ◖" + hamburger + "◗. Brett: ◖" + brett + "◗");

        notifyAll();
        return hamburger;
    }

    public int paaBrett () {
        return brett.size();
    }
}






