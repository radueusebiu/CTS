package ro.ase.cts.factoryMethod.clase;

public class FactortPortar implements AbstractFactory {
    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Portar(nume, meciuriJucate);
    }
}
