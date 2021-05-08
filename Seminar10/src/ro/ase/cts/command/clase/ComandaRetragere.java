package ro.ase.cts.command.clase;

public class ComandaRetragere extends ComandaAbstracta {
    public ComandaRetragere(ContBancar contBancar, float suma) {
        super(contBancar, suma);
    }

    @Override
    public void executa() {
        super.getContBancar().retragere(getSuma());
    }
}
