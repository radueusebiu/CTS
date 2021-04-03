package ro.ase.cts.factoryMethod.clase;

public class Portar extends Jucator {
    public Portar(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
