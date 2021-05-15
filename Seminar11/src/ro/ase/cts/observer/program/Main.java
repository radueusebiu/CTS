package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Main {

    public static void main(String[] args) {

        ManagerSala managerSala = new ManagerSala("Sala Sporturilor");
        Observer clientAbonat1 = new ClientAbonat("Lucian");
        Observer clientAbonat2 = new ClientAbonat("Costinel");
        Observer clientAbonat3 = new ClientAbonat("George");
        managerSala.aboneaza(clientAbonat1);
        managerSala.aboneaza(clientAbonat2);
        managerSala.aboneaza(clientAbonat3);
        managerSala.anuntaMeci("fotbal");

        System.out.println();
        managerSala.dezaboneaza(clientAbonat3);
        managerSala.anuntaMeci("voley");
    }
}
