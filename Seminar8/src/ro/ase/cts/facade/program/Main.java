package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;
//import ro.ase.cts.facade.clase.OperatorMese;
//import ro.ase.cts.facade.clase.Picolo;

public class Main {

    public static void main(String[] args) {
//        Masa masa = new Masa(10,0);
//
//        if(OperatorMese.esteLibera(masa)){
//            Picolo picolo = new Picolo("Andrei");
//            if(picolo.esteDebarasata(masa) && picolo.esteAranjata(masa)){
//                System.out.println("Poftiti la masa!");
//            }
//            else{
//                System.out.println("Mai asteptati putin!");
//            }
//        }
//        else{
//            System.out.println("Mai asteptati putin!");
//        }

        Masa masa1 = new Masa(20,0);
        if(Facade.potInvitaOameniiLaMasa(masa1)){
            System.out.println("Poftiti la masa!");
        }
        else{
            System.out.println("Mai asteptati putin!");
        }
    }
}
