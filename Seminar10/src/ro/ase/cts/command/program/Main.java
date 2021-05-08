package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.*;

public class Main {

    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();
        ContBancar contBancar = new ContBancar("Gigel");
        managerComenzi.invocaComanda(new ComandaConstituire(contBancar,500));
        managerComenzi.invocaComanda(new ComandaDepunere(contBancar,100));
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new ComandaRetragere(contBancar,250));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new ComandaRetragere(contBancar,400));
        managerComenzi.executaComanda();
    }
}
