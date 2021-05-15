package ro.ase.cts.memento.clase;

public class MeciJucat {
    private int nrSpectatori;
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;
    private int nrJandarmi;
    private int nrBileteVandute;

    public MeciJucat(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti, int nrJandarmi, int nrBileteVandute) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
        this.nrJandarmi = nrJandarmi;
        this.nrBileteVandute = nrBileteVandute;
    }

    public Memento creareMemento(){
        return new Memento(nrSpectatori,numeEchipaGazda,numeEchipaOaspeti);
    }

    public void setMemento(Memento memento){
        this.nrSpectatori = memento.getNrSpectatori();
        this.numeEchipaGazda = memento.getNumeEchipaGazda();
        this.numeEchipaOaspeti = memento.getNumeEchipaOaspeti();
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNumeEchipaGazda(String numeEchipaGazda) {
        this.numeEchipaGazda = numeEchipaGazda;
    }

    public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MeciJucat{");
        sb.append("nrSpectatori=").append(nrSpectatori);
        sb.append(", numeEchipaGazda='").append(numeEchipaGazda).append('\'');
        sb.append(", numeEchipaOaspeti='").append(numeEchipaOaspeti).append('\'');
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append('}');
        return sb.toString();
    }
}
