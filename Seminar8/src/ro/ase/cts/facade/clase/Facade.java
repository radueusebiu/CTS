package ro.ase.cts.facade.clase;

public class Facade {
    public static boolean potInvitaOameniiLaMasa(Masa masa){
        if(OperatorMese.esteLibera(masa)){
            Picolo picolo = new Picolo("Marius");
            if(picolo.esteDebarasata(masa) && picolo.esteAranjata(masa)){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }
}
