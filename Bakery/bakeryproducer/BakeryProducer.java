package bakeryproducer;

import abstractbakery.DulciuriFactory;
import bakery.BiscuiteFactory;
import bakery.PrajituraFactory;

/**
 * Created by ION on 16.11.2014.
 */
public class BakeryProducer {
    public static DulciuriFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("IBISCUITE")){
            return new BiscuiteFactory();
        }else if(choice.equalsIgnoreCase("IPRAJITURA")){
            return new PrajituraFactory();
        }
        return null;
    }
}
