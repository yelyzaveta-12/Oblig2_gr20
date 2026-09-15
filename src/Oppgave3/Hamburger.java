package Oppgave3;

public class Hamburger {

    private int bestilling;

    public Hamburger(int bestilling) {
        this.bestilling = bestilling;
    }
    public int getBestilling() {
        return bestilling;
    }
    public void setBestilling(int bestilling) {
        this.bestilling = bestilling;
    }

    @Override
    public String toString() {
        return "◖" + bestilling + "◗";
    }
}
