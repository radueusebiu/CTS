package ro.ase.cts.chainOfResponsibility.clase;

public abstract class Cont {

    private float sold;
    private Cont cont;

    public Cont(float sold) {
        this.sold = sold;
        this.cont = null;
    }

    public float getSold() {
        return sold;
    }

    public Cont getCont() {
        return cont;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public void setCont(Cont cont) {
        this.cont = cont;
    }

    public abstract void realizeazaPlata(float suma);
}
