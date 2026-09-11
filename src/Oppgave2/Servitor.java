package Oppgave2;

public class Servitor extends Thread {

    private HamburgerBrett brett;
    private String navn;

    public Servitor(HamburgerBrett brett, String navn) {
        this.brett = brett;
        setName(navn);
    }

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){

            Hamburger hamburger = brett.taAv();

            System.out.println(getName() + "(servitør) tar av hamburger ◖" + hamburger.getBestilling() + "◗");

            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                break;
            }

        }
    }
}

