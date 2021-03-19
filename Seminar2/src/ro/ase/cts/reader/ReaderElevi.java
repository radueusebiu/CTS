package ro.ase.cts.reader;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderElevi extends ReaderAplicant {
    public ReaderElevi(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input1 = new Scanner(new File(super.numeFisier));
        input1.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input1.hasNext()) {
            Elev elev = new Elev();
            super.readAplicant(input1,elev);
            int clasa = input1.nextInt();
            String tutore = input1.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input1.close();
        return elevi;
    }
}
