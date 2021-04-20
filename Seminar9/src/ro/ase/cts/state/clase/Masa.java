package ro.ase.cts.state.clase;

public class Masa {
    private int idMasa;
    private StareMasa stareMasa;

    public Masa(int idMasa) {
        this.idMasa = idMasa;
        this.stareMasa = new Libera();
    }

    public StareMasa getStareMasa() {
        return stareMasa;
    }

    void setStareMasa(StareMasa stareMasa) {
        this.stareMasa = stareMasa;
    }

    public void rezervaMasa(String numeClient){
        if(this.getStareMasa() instanceof Libera){
            System.out.println(numeClient + " a rezevat masa!");
            this.setStareMasa(new Rezervata());
        }
        else{
            System.out.println("Masa nu este libera!");
        }
    }

    public void ocupaMasa(String numeClient){
        if(!(this.getStareMasa() instanceof Ocupata)){
            System.out.println(numeClient + " a ocupat masa!");
            this.setStareMasa(new Ocupata());
        }
        else{
            System.out.println("Masa nu poate fi ocupata!");
        }
    }

    public void elibereazaMasa(String numeClient){
        if(!(this.getStareMasa() instanceof Libera)){
            System.out.println(numeClient + " a eliberat masa!");
            this.setStareMasa(new Libera());
        }
        else{
            System.out.println("Masa este deja libera!");
        }
    }
}
