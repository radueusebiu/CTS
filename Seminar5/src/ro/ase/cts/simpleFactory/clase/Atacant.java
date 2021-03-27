package ro.ase.cts.simpleFactory.clase;

public class Atacant extends Jucator {
    public Atacant(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
