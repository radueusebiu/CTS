package ro.ase.cts.simpleFactory.clase;

public class Factory {
    public Jucator getJucator(TipJucator tipJucator, String nume, int varsta){
        switch (tipJucator){
            case PORTAR:
                return new Portar(nume,varsta);
            case FUNDAS:
                return new Fundas(nume,varsta);
            case ATACANT:
                return new Atacant(nume,varsta);
            default: throw new IllegalArgumentException();
        }
    }
}
