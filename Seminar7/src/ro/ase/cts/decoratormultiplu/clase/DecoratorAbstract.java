package ro.ase.cts.decoratormultiplu.clase;

public abstract class DecoratorAbstract implements IOperatorBilet {

    private IOperatorBilet bilet;

    public DecoratorAbstract(IOperatorBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void rezervaBilet() {
        bilet.rezervaBilet();
    }

    @Override
    public String getNumeEchipaGazda() {
        return bilet.getNumeEchipaGazda();
    }

    @Override
    public String getNumeEchipaOaspeti() {
        return bilet.getNumeEchipaOaspeti();
    }
}
