package classes;

import interfaces.IPrajitura;

/**
 * Created by ION on 16.11.2014.
 */
public class Savarina implements IPrajitura {
    /**
     * in aceasta clasa am definitivat ce tip
     * de blat are savarina si cum se va insiropa
     */
    @Override
    public void blat() {
        System.out.println("Blat foarte pufos.");
    }

    @Override
    public void insiropare() {
        System.out.println("Mut sirop putin dulce.");
    }
}
