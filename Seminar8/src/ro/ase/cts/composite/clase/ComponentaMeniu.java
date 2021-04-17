package ro.ase.cts.composite.clase;

public abstract class ComponentaMeniu {

    private String nume;

    public ComponentaMeniu(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void afisareDescriere();
    public abstract ComponentaMeniu getComponenta(int poz) throws Exception;
    public abstract void adaugaComponenta(ComponentaMeniu componenta);
    public abstract void stergeComponenta(ComponentaMeniu componenta);

}
