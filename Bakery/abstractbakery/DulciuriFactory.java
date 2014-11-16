package abstractbakery;

import interfaces.IBiscuite;
import interfaces.IPrajitura;

/**
 * Created by ION on 16.11.2014.
 */
public abstract class DulciuriFactory {
    /**
     *
     * clasa abstracta cu metode de colectare
     * a datelor despre obiecte
     *
     */
    abstract IBiscuite getBiscuite(String biscuite);
    abstract IPrajitura getPrajitura(String prajitura);
}
