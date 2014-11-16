package classes;

import interfaces.IPrajitura;

/**
 * Created by ION on 16.11.2014.
 */
public class Amandina implements IPrajitura {
    /**
     * in aceasta clasa am definitivat ce tip
     * de blat are amandina si cum se va insiropa
     */
    @Override
    public void blat() {
        System.out.println("Blat putin pufos.");
    }

    @Override
    public void insiropare() {
        System.out.println("Sirop foarte dulce.");
    }
}
