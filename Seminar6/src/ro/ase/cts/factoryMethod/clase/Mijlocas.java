package ro.ase.cts.factoryMethod.clase;

public class Mijlocas extends Jucator {
    public Mijlocas(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mijlocas{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
