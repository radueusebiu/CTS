package ro.ase.cts.program;

import ro.ase.cts.restaurant.Restaurant;
import ro.ase.cts.singletone.AsigurareMedicala;

public class MainClass {

    public static void main(String[] args){
        AsigurareMedicala asigurareMedicala1 = AsigurareMedicala.getInstance();
        AsigurareMedicala asigurareMedicala2 = AsigurareMedicala.getInstance();

        asigurareMedicala1.setId(2);
        asigurareMedicala2.setContributie(247.4f);

        System.out.println(asigurareMedicala1.toString());
        System.out.println(asigurareMedicala2.toString());

        //Asigurare lazy
        ro.ase.cts.singletone.lazy.AsigurareMedicala asigurareMedicalaLazy1 = ro.ase.cts.singletone.lazy.AsigurareMedicala.getInstance(100,"Eusebiu",165.4f);
        ro.ase.cts.singletone.lazy.AsigurareMedicala asigurareMedicalaLazy2 = ro.ase.cts.singletone.lazy.AsigurareMedicala.getInstance(200,"Maria",475.4f);
        System.out.println(asigurareMedicalaLazy1.toString());
        System.out.println(asigurareMedicalaLazy2.toString());

        //Restaurant lazy
        Restaurant restaurant1 = Restaurant.getInstance("Linea",20,true);
        Restaurant restaurant2 = Restaurant.getInstance("KFC",10,false);

        restaurant1.setDenumire("Poesia");
        restaurant2.setNrMese(15);

        System.out.println(restaurant1.toString());
        System.out.println(restaurant2.toString());
    }
}
