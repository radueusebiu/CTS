package ro.ase.cts.program;

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
    }
}
