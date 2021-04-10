package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorContactless;
import ro.ase.cts.decorator.clase.DecoratorContactlessTelefon;

public class Main {


    public static void main(String[] args) {
        Card card = new Card("George", "2347");
        card.platesteOnline();
        card.platestePOS();
        DecoratorAbstract decoratorAbstract = new DecoratorContactless(card);
        decoratorAbstract.platesteContactless();
        decoratorAbstract.platesteOnline();
        decoratorAbstract.platestePOS();

        DecoratorAbstract decoratorAbstract1 = new DecoratorContactlessTelefon(card);
        decoratorAbstract1.platesteContactless();
        decoratorAbstract1.platesteOnline();
        decoratorAbstract1.platestePOS();

    }
}
