package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.AbstractPrototype;
import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {

    public static void main(String[] args) {
        AbstractPrototype abstractPrototype1 = new ClientStadion("Eusebiu",21);
        AbstractPrototype abstractPrototype2 = abstractPrototype1.copiaza();
        ClientStadion clientStadion = (ClientStadion) abstractPrototype1.copiaza();
        clientStadion.setDenumire("Mirel");

        System.out.println(abstractPrototype1.toString());
        System.out.println(abstractPrototype2.toString());
        System.out.println(clientStadion.toString());


        Bilet bilet1 = new Bilet(1,"Steaua","Dinamo","20 martie 2019");
        Bilet bilet2 = (Bilet) bilet1.copiaza();
        bilet2.setCod(2);

        System.out.println(bilet1.toString());
        System.out.println(bilet2.toString());

    }
}
