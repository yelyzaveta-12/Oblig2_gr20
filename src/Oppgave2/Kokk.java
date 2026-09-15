package Oppgave2;

import java.util.Random;

public class Kokk extends Thread {

    private HamburgerBrett brett;
    private int nesteBestilling = 1;

    public Kokk(HamburgerBrett brett, String navn) {
        this.brett = brett;
        setName(navn);
    }
    public synchronized int nesteBestillingM() {
        return nesteBestilling++;
    }

    @Override
    public void run() {

        for(int i = 0; i < 10; i++) {


            Random random = new Random();
            int tid = random.nextInt(2, 7);

            try {
                Thread.sleep(tid * 1000);
            } catch (InterruptedException e) {
                break;
            }


            int bestilling = brett.nesteBestilling();
            Hamburger hamburger = new Hamburger(bestilling);

            brett.leggTil(hamburger);

            System.out.println(getName() + "(kokk) legger på hamburger  ◖" + i + "◗");




        }
    }

}