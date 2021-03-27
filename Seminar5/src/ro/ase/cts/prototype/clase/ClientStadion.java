package ro.ase.cts.prototype.clase;

public class ClientStadion implements AbstractPrototype {
    private String denumire;
    private int varsta;

    private ClientStadion() {
    }

    public ClientStadion(String denumire, int varsta) {
        //validari parametrii
        this.denumire = denumire;
        //daca persoana este majora?
        this.varsta = varsta;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public AbstractPrototype copiaza() {
        ClientStadion clona = new ClientStadion();

        clona.denumire = this.denumire;
        clona.varsta = this.varsta;

        return clona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientStadion{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
