package ro.ase.cts.facade.clase;

public class Masa {
    private int cod;
    private int nrPersoane;

    public Masa(int cod, int nrPersoane) {
        this.cod = cod;
        this.nrPersoane = nrPersoane;
    }

    public int getCod() {
        return cod;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
