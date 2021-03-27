package ro.ase.cts.simpleFactory.clase;

public class FactorySingletone {

    private static FactorySingletone factorySingletone = null;

    private FactorySingletone() {
    }

    public static synchronized FactorySingletone getInstance(){
        if(factorySingletone == null){
             factorySingletone = new FactorySingletone();
        }
        return factorySingletone;
    }

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
