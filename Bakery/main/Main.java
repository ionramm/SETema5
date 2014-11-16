package main;

import abstractbakery.DulciuriFactory;
import bakery.BiscuiteFactory;
import bakery.PrajituraFactory;
import bakeryproducer.BakeryProducer;
import interfaces.IBiscuite;
import interfaces.IPrajitura;

/**
 * Created by ION on 16.11.2014.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Abstract Factory Design Pattern
         *
         * Pentru a eidentia pattern-ul cerut, am creat in main
         * cate un obiect din fiecare produs folosindu-ma de
         * clasa DulciuriFactory si de interfete
         *
         */
        DulciuriFactory biscuiteFactory = BakeryProducer.getFactory("IBISCUITE");
        IBiscuite covrig = BiscuiteFactory.getBiscuite("COVRIG");
        covrig.framantare();
        covrig.rumenire();
        IBiscuite fursecuri = BiscuiteFactory.getBiscuite("FURSECURI");
        fursecuri.framantare();
        fursecuri.rumenire();
        IBiscuite biscuitiTaranesti = BiscuiteFactory.getBiscuite("BISCUITITARANESTI");
        biscuitiTaranesti.framantare();
        biscuitiTaranesti.rumenire();

        DulciuriFactory prajituraFactory = BakeryProducer.getFactory("IPrajitura");
        IPrajitura savarina = PrajituraFactory.getPrajitura("SAVARINA");
        savarina.blat();
        savarina.insiropare();
        IPrajitura amandina = PrajituraFactory.getPrajitura("AMANDINA");
        amandina.blat();
        amandina.insiropare();
    }
}
