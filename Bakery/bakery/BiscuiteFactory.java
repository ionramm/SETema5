package bakery;

import abstractbakery.DulciuriFactory;
import classes.BiscuitiTaranesti;
import classes.Covrig;
import classes.Fursecuri;
import interfaces.IBiscuite;
import interfaces.IPrajitura;

/**
 * Created by ION on 16.11.2014.
 */
public class BiscuiteFactory extends DulciuriFactory {
    @Override
    public IBiscuite getBiscuite(String biscuite) {
        if (biscuite == null) {
            return null;
        }
        if (biscuite.equalsIgnoreCase("BISCUITITARANESTI")) {
            return new BiscuitiTaranesti();
        } else if (biscuite.equalsIgnoreCase("FURSECURI")) {
            return new Fursecuri();
        } else if (biscuite.equalsIgnoreCase("COVRIG")) {
            return new Covrig();
        }
        return null;
    }

    @Override
    public IPrajitura getPrajitura(String prajitura) {
        return null;
    }
}
