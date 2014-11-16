package bakery;

import abstractbakery.DulciuriFactory;
import classes.Amandina;
import classes.Savarina;
import interfaces.IBiscuite;
import interfaces.IPrajitura;

/**
 * Created by ION on 16.11.2014.
 */
public class PrajituraFactory extends DulciuriFactory {
    @Override
    public IPrajitura getPrajitura(String prajitura) {
        if (prajitura == null) {
            return null;
        }
        if (prajitura.equalsIgnoreCase("SAVARINA")) {
            return new Savarina();
        } else if (prajitura.equalsIgnoreCase("AMANDINA")) {
            return new Amandina();
        }
        return null;
    }

    @Override
    public IBiscuite getBiscuite(String biscuite) {
        return null;
    }
}
