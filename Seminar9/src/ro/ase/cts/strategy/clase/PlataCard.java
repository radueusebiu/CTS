package ro.ase.cts.strategy.clase;

public class PlataCard implements IModPlata {


    @Override
    public void plateste(int suma) {
        System.out.println("A fost platita cu cardul suma de " + suma);
    }
}
