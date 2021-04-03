package ro.ase.cts.factoryMethod.clase;

public class Atacant extends Jucator {
    public Atacant(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
