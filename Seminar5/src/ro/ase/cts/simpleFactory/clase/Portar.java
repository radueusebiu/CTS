package ro.ase.cts.simpleFactory.clase;

public class Portar extends Jucator {

    public Portar(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append(super.toString());
        sb.append('}');

        return sb.toString();
    }
}
