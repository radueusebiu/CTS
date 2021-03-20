package ro.ase.cts.restaurant;

public class Restaurant {
    private String denumire;
    private int nrMese;
    private boolean isOpen;

    private static Restaurant restaurant = null;

    private Restaurant(String denumire, int nrMese, boolean isOpen) {
        this.denumire = denumire;
        this.nrMese = nrMese;
        this.isOpen = isOpen;
    }

    public static synchronized Restaurant getInstance(String denumire, int nrMese, boolean isOpen){
        if(restaurant == null){
            restaurant = new Restaurant(denumire, nrMese, isOpen);
        }
        return restaurant;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNrMese(int nrMese) {
        this.nrMese = nrMese;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrMese=").append(nrMese);
        sb.append(", isOpen=").append(isOpen);
        sb.append('}');
        return sb.toString();
    }
}
