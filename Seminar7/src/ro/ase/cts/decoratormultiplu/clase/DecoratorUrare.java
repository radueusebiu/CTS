package ro.ase.cts.decoratormultiplu.clase;

public class DecoratorUrare extends DecoratorAbstract {
    public DecoratorUrare(IOperatorBilet bilet) {
        super(bilet);
    }

    @Override
    public void rezervaBilet(){
        super.rezervaBilet();
        System.out.println("Paste fericit si hai la meci!");
    }
}
