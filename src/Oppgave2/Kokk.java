package Oppgave2;

public class Kokk extends Thread {

    private HamburgerBrett brett;


    public Kokk(HamburgerBrett brett, String navn) {
        this.brett = brett;
        setName(navn);
    }

    @Override
    public void run() {

        for(int i = 0; i < 10; i++) {

            Hamburger hamburger = new Hamburger(i);
            brett.leggTil(hamburger);

            System.out.println(getName() + "(kokk) legger på hamburger  ◖" + i + "◗");


            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                break;
            }

        }
    }

}