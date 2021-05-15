package ro.ase.cts.memento.clase;

public class Memento {

    public int nrSpectatori;
    public String numeEchipaGazda;
    public String numeEchipaOaspeti;

    public Memento(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    public String getNumeEchipaOaspeti() {
        return numeEchipaOaspeti;
    }
}
