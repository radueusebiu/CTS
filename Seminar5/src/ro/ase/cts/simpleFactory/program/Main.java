package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.clase.*;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Jucator portar = factory.getJucator(TipJucator.PORTAR, "Cristi", 23);
        Jucator fundas = factory.getJucator(TipJucator.FUNDAS, "Dorel", 28);
        System.out.println(portar.toString());
        System.out.println(fundas.toString());

        //Pentru factory care este si Singletone
        FactorySingletone factorySingletone = FactorySingletone.getInstance();
        Jucator portar2 = factorySingletone.getJucator(TipJucator.PORTAR,"Sorin",25);
        Jucator fundas2 = factorySingletone.getJucator(TipJucator.FUNDAS,"Marin",29);
        System.out.println(portar2.toString());
        System.out.println(fundas2.toString());

    }
}
