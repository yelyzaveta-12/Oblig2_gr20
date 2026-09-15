package Oppgave3;

import java.util.Random;

public class Servitor extends Thread{

    private HamburgerBrett brett;

    public Servitor(HamburgerBrett brett, String navn) {
        this.brett = brett;
        setName(navn);
    }

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){

            Random random = new Random();
            int tid = random.nextInt(2, 7);

            try{
                Thread.sleep(1000 * tid);

               Hamburger h = brett.taAv();
                System.out.println(getName() + "(servitør) tar av hamburger ◖" + h.getBestilling() + "◗");



            } catch (InterruptedException e) {
                break;
            }

        }
    }
}

