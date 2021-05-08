package ro.ase.cts.chainOfResponsibility.program;

import ro.ase.cts.chainOfResponsibility.clase.Cont;
import ro.ase.cts.chainOfResponsibility.clase.ContCredit;
import ro.ase.cts.chainOfResponsibility.clase.ContCurent;
import ro.ase.cts.chainOfResponsibility.clase.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent(200);
        Cont contEconomii = new ContEconomii(500);
        Cont contCredit = new ContCredit(700);

        contCurent.setCont(contEconomii);
        contEconomii.setCont(contCredit);

        contCurent.realizeazaPlata(150);
        contCurent.realizeazaPlata(60);
        contCurent.realizeazaPlata(490);
        contCurent.realizeazaPlata(250);
        contCurent.realizeazaPlata(300);
    }
}
