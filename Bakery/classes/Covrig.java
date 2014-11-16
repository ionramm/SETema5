package classes;

import interfaces.IBiscuite;

/**
 * Created by ION on 16.11.2014.
 */
public class Covrig implements IBiscuite {
    /**
     * in aceasta clasa am definitivat cum
     * se va framanta si rumeni covrigul
     */
    @Override
    public void rumenire() {
        System.out.println("Produs foarte putin rumenit.");
    }

    @Override
    public void framantare() {
        System.out.println("Framantare usoara.");
    }
}
