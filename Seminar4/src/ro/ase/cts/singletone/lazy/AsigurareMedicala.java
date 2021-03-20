package ro.ase.cts.singletone.lazy;

public class AsigurareMedicala {
    private int id;
    private String numeAsigurat;
    private float contributie;

    //Declarare instanta
    private static AsigurareMedicala asigurareMedicala = null;

    //Constructorul trebuie sa fie private
    private AsigurareMedicala(int id, String numeAsigurat, float contributie) {
        this.id = id;
        this.numeAsigurat = numeAsigurat;
        this.contributie = contributie;
    }

    //Obtinerea unei instante
    public static synchronized AsigurareMedicala getInstance(int id, String numeAsigurat, float contributie){
        if(asigurareMedicala == null){
            asigurareMedicala = new AsigurareMedicala(id, numeAsigurat, contributie);
        }
        return asigurareMedicala;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeAsigurat(String numeAsigurat) {
        this.numeAsigurat = numeAsigurat;
    }

    public void setContributie(float contributie) {
        this.contributie = contributie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AsigurareMedicala{");
        sb.append("id=").append(id);
        sb.append(", numeAsigurat='").append(numeAsigurat).append('\'');
        sb.append(", contributie=").append(contributie);
        sb.append('}');
        return sb.toString();
    }


}
