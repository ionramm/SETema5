package classes;

import interfaces.IBiscuite;

/**
 * Created by ION on 16.11.2014.
 */
public class Fursecuri implements IBiscuite {
    /**
     * in aceasta clasa am definitivat cum
     * se vor framanta si rumeni fursecurile
     */
    @Override
    public void rumenire() {
        System.out.println("Produs cu rumenire medie.");
    }

    @Override
    public void framantare() {
        System.out.println("Framantare intensa in sens trigonometric.");
    }
}
