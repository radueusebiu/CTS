package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IOperatorRezervari {

    private OperatorRezervare operatorRezervare;
    private int numarMinimDePersoane;

    public ProxyRezervare(OperatorRezervare operatorRezervare, int numarMinimDePersoane) {
        this.operatorRezervare = operatorRezervare;
        this.numarMinimDePersoane = numarMinimDePersoane;
    }

    @Override
    public void rezerva(int numarPersoane) {
        if(numarPersoane >= numarMinimDePersoane){
            operatorRezervare.rezerva(numarPersoane);
        }
        else{
            System.out.println("Numarul de persoane este prea mic!");
        }
    }
}
