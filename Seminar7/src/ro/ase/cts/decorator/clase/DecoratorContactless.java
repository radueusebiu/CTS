package ro.ase.cts.decorator.clase;

public class DecoratorContactless extends DecoratorAbstract {

    public DecoratorContactless(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    public void platesteContactless(){
        System.out.println(((Card)super.getCardAbstract()).getTitular()+ " a platit contactless.");
    }

}
