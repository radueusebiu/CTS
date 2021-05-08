package ro.ase.cts.command.clase;


public abstract class ComandaAbstracta {

    private ContBancar contBancar;
    private float suma;

    public ComandaAbstracta(ContBancar contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    public ContBancar getContBancar() {
        return contBancar;
    }

    public float getSuma() {
        return suma;
    }

    public abstract void executa();
}
