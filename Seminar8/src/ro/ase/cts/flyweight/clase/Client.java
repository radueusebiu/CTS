package ro.ase.cts.flyweight.clase;

public class Client implements FlyweigyAbstract{
    private String nume;
    private int nrTelefon;
    private String email;

    public Client(String nume, int nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public void printeazaInformatiiRezervare(Rezervare rezervare) {
        System.out.println(rezervare.toString() + this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon=").append(nrTelefon);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
