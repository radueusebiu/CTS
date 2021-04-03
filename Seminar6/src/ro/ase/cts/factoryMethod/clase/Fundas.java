package ro.ase.cts.factoryMethod.clase;

public class Fundas extends Jucator {
    public Fundas(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
