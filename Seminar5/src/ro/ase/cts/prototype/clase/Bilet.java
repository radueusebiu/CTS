package ro.ase.cts.prototype.clase;

public class Bilet implements AbstractPrototype{
    private int cod;
    private String numeEchipa1;
    private String numeEchipa2;
    private String dataSiOra;

    public Bilet(int cod, String numeEchipa1, String numeEchipa2, String dataSiOra) {
        this.cod = cod;
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
        this.dataSiOra = dataSiOra;
    }

    public Bilet() {
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public AbstractPrototype copiaza() {
        Bilet copie = new Bilet();
        copie.cod = this.cod;
        copie.numeEchipa1 = this.numeEchipa1;
        copie.numeEchipa2 = this.numeEchipa2;
        copie.dataSiOra = this.dataSiOra;
        return copie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("cod=").append(cod);
        sb.append(", numeEchipa1='").append(numeEchipa1).append('\'');
        sb.append(", numeEchipa2='").append(numeEchipa2).append('\'');
        sb.append(", dataSiOra='").append(dataSiOra).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

