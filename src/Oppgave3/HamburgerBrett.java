package Oppgave3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class HamburgerBrett {

    private BlockingQueue<Hamburger> brett;
    private int nesteBestilling = 1;

    public HamburgerBrett(int kapasitet) {
        brett = new ArrayBlockingQueue<>(kapasitet);
    }

    public int nesteBestilling() {
        return nesteBestilling;
    }



    public void leggTil(Hamburger hamburger) throws InterruptedException {

        brett.put(hamburger);

        System.out.println(Thread.currentThread().getName() +
                "(kokk) klar med hamburger, men brett fullt. Venter!");
    }

    public Hamburger taAv() throws InterruptedException {

        Hamburger hamburger = brett.take();

        System.out.println(Thread.currentThread().getName() +
                "(servitør) tar av hamburger ◖" + hamburger + "◗. Brett: ◖" + brett + "◗");


        return hamburger;
    }

    public int paaBrett () {
        return brett.size();
    }
}

