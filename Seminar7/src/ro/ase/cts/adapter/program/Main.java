package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterCreditClasa;
import ro.ase.cts.adapter.clase.AdapterLeasingToCredit;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {

    public static void creazaLeasing(CreditAbstract creditAbstract){
        creditAbstract.oferaCredit();
    }

    public static void main(String[] args) {

        Leasing leasing = new Leasing("Dorel",100);
        AdapterLeasingToCredit adapterLeasingToCredit = new AdapterLeasingToCredit(leasing);
        creazaLeasing(adapterLeasingToCredit);

        AdapterCreditClasa adapterCreditClasa = new AdapterCreditClasa("Daniel",100);
        creazaLeasing(adapterCreditClasa);
    }
}
