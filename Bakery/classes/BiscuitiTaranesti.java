package classes;

import interfaces.IBiscuite;

/**
 * Created by ION on 16.11.2014.
 */
public class BiscuitiTaranesti implements IBiscuite {
    /**
     * in aceasta clasa am definitivat cum
     * se vor framanta si rumeni biscuitii
     * taranesti
     */
    @Override
    public void rumenire() {
        System.out.println("Produs bine rumenit.");
    }

    @Override
    public void framantare() {
        System.out.println("Framantare medie.");
    }
}