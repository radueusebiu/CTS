package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCard;
import ro.ase.cts.strategy.clase.PlataCash;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Daniel", new PlataCard());
        client.platesteNota(20);
        client.setiModPlata(new PlataCash());
        client.platesteNota(5);
    }
}
