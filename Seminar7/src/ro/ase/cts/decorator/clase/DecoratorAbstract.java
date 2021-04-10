package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements CardAbstract{

    private CardAbstract cardAbstract;

    public DecoratorAbstract(CardAbstract cardAbstract) {
        this.cardAbstract = cardAbstract;
    }

    public CardAbstract getCardAbstract() {
        return cardAbstract;
    }

    @Override
    public void platesteOnline() {
        cardAbstract.platesteOnline();
    }

    @Override
    public void platestePOS() {
        cardAbstract.platestePOS();
    }

    public void platesteContactless(){};

}
