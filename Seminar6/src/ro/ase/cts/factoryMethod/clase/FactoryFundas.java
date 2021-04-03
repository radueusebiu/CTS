package ro.ase.cts.factoryMethod.clase;

public class FactoryFundas implements AbstractFactory {
    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Fundas(nume, meciuriJucate);
    }
}
