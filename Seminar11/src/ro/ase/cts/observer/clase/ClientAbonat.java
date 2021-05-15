package ro.ase.cts.observer.clase;

public class ClientAbonat implements Observer {

    private String numeClient;

    public ClientAbonat(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void primesteAnunt(String mesaj) {
        System.out.println(this.numeClient + " ai primit anuntul " + mesaj);
    }
}
