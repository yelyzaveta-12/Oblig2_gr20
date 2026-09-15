package Oppgave3;

import java.util.Random;

public class Kokk extends Thread{

    private HamburgerBrett brett;


    public Kokk(HamburgerBrett brett, String navn) {
        this.brett = brett;
        setName(navn);
    }

    @Override
    public void run()  {

        for(int i = 0; i < 10; i++) {


            Random random = new Random();
            int tid = random.nextInt(2, 7);

            try {
                Thread.sleep(1000 * tid);



            int bestilling = brett.nesteBestilling();
            Hamburger hamburger = new Hamburger(bestilling);

            brett.leggTil(hamburger);

            System.out.println(getName() + "(kokk) legger på hamburger  ◖" + i + "◗");


            } catch (InterruptedException e) {
                break;
            }




        }
    }
}
