package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

    public static void main(String[] args) {

        Sectiune bauturi = new Sectiune("bauturi");
        Sectiune aperitive = new Sectiune("aperitive");

        Item cola = new Item("Coca-Cola");
        Item fanta = new Item("Fanta");

        Item bruschete = new Item("Bruschete");


        bauturi.adaugaComponenta(cola);
        bauturi.adaugaComponenta(fanta);
        aperitive.adaugaComponenta(bruschete);

        Sectiune meniu = new Sectiune("Meniu");
        meniu.adaugaComponenta(bauturi);
        meniu.adaugaComponenta(aperitive);

        meniu.afisareDescriere();
    }
}
