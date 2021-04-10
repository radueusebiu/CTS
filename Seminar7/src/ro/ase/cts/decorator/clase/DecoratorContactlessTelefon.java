package ro.ase.cts.decorator.clase;

public class DecoratorContactlessTelefon extends DecoratorAbstract {

    public DecoratorContactlessTelefon(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    public void platesteContactless(){
        System.out.println(((Card)super.getCardAbstract()).getTitular() + " a platit contactless cu telefonul.");
    }

}
