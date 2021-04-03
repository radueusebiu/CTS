package ro.ase.cts.factoryMethod.program;

import ro.ase.cts.factoryMethod.clase.*;

public class Main {

    private static void afisareInformatiiJucator(AbstractFactory abstractFactory, String nume, int meciuriJucate){
        Jucator jucator = abstractFactory.getJucator(nume, meciuriJucate);

        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {

        afisareInformatiiJucator(new FactoryAtacant(),"Daniel",10);
        afisareInformatiiJucator(new FactortPortar(),"Cristi",20);
        afisareInformatiiJucator(new FactoryFundas(),"Marinel",35);
        afisareInformatiiJucator(new FactoryMijlocas(),"Stefan",23);

    }
}
