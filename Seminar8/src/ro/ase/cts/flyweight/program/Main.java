package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

import javax.swing.event.CaretListener;

public class Main {

    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(100,3,19);
        Rezervare rezervare2 = new Rezervare(101,5,17);
        Rezervare rezervare3 = new Rezervare(102,2,21);

        FabricaClienti fabrica = new FabricaClienti();

        Client client1 = fabrica.getClient("client1@gmail.com");
        client1.printeazaInformatiiRezervare(rezervare1);
        fabrica.getClient("maricel@gmail.com").printeazaInformatiiRezervare(rezervare2);

        fabrica.getClient("client1@gmail.com").printeazaInformatiiRezervare(rezervare3);
    }
}
