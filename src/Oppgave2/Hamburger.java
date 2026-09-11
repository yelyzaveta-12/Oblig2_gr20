package Oppgave2;

public class Hamburger {

    private int bestilling;

    public Hamburger(int bestilling) {
        this.bestilling = bestilling;
    }

    public int getBestilling() {
        return bestilling;
    }

    @Override
    public String toString() {
        return "Hamburger fra bestilling " + bestilling;
    }
}
