package dubluri;

import clase.IStudent;

import java.util.List;

public class StudentFake implements IStudent {

    private String valoareNume;
    private List<Integer> valoareLista;
    private float valoareMedie;
    private int valoareNota;
    private boolean valoareAreRestanta;

    public void setValoareNume(String valoareNume) {
        this.valoareNume = valoareNume;
    }

    public void setValoareLista(List<Integer> valoareLista) {
        this.valoareLista = valoareLista;
    }

    public void setValoareMedie(float valoareMedie) {
        this.valoareMedie = valoareMedie;
    }

    public void setValoareNota(int valoareNota) {
        this.valoareNota = valoareNota;
    }

    public void setValoareAreRestanta(boolean valoareAreRestanta) {
        this.valoareAreRestanta = valoareAreRestanta;
    }

    @Override
    public String getNume() {
        return this.valoareNume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return this.valoareLista;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return this.valoareMedie;
    }

    @Override
    public int getNota(int index) {
        return this.valoareNota;
    }

    @Override
    public boolean areRestante() {
        return this.valoareAreRestanta;
    }
}
