package ro.ase.cts.decoratormultiplu.clase;

public class Bilet  implements IOperatorBilet{
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;

    public Bilet(String numeEchipaGazda, String numeEchipaOaspeti) {
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    @Override
    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    @Override
    public String getNumeEchipaOaspeti() {
        return numeEchipaOaspeti;
    }

    @Override
    public void rezervaBilet() {
        System.out.println(numeEchipaGazda + " joaca impotriva "+ numeEchipaOaspeti);
    }
}
