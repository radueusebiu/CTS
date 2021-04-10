package ro.ase.cts.adapter.clase;

public class AdapterLeasingToCredit implements CreditAbstract {

    private Leasing leasing;

    public AdapterLeasingToCredit(Leasing leasing){
        this.leasing = leasing;
    }

    @Override
    public void oferaCredit() {
        leasing.creazaLeasing();
    }
}
