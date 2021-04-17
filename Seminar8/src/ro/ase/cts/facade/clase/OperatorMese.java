package ro.ase.cts.facade.clase;

class OperatorMese {

    public static boolean esteLibera(Masa masa){
       return masa.getNrPersoane() == 0;
    }
}
