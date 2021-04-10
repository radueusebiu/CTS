package ro.ase.cts.decoratormultiplu.clase;

public class DecoratorSustinereEchipa extends DecoratorAbstract {

    public DecoratorSustinereEchipa(IOperatorBilet bilet) {
        super(bilet);
    }

    @Override
    public void rezervaBilet(){
        super.rezervaBilet();
        System.out.println("Sustinem echipa " + super.getNumeEchipaGazda());
    }
}
