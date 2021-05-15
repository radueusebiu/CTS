package ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
    public abstract void asezareCoada();
    public abstract void prezintaBilet();
    public abstract void realizareControlCorporal();
    public abstract void ocupaLoc();
    public final void intrarePeStadion(){
        asezareCoada();
        prezintaBilet();
        realizareControlCorporal();
        ocupaLoc();
    };

}
