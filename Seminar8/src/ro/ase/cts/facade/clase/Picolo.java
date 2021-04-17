package ro.ase.cts.facade.clase;

class Picolo {

    private String nume;

    public Picolo(String nume) {
        this.nume = nume;
    }

    public boolean esteDebarasata(Masa masa){
        return masa.getCod()%2 == 0;
    }

    public boolean esteAranjata(Masa masa){
        return masa.getCod()%5 == 0;
    }
}
