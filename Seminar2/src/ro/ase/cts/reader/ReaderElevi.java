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
    //    public static List<Aplicant> readPupil(String file) throws FileNotFoundException {
//        Scanner input2 = new Scanner(new File(file));
//        input2.useDelimiter(",|\n");
//        List<Aplicant> elevi = new ArrayList<Aplicant>();
//
//        while (input2.hasNext()) {
//            String nume = input2.next();
//            String prenume = input2.next();
//            int varsta = input2.nextInt();
//            int punctaj = input2.nextInt();
//            int nr = input2.nextInt();
//            String[] vect = new String[5];
//            for (int i = 0; i < nr; i++)
//                vect[i] = input2.next();
//            int clasa = input2.nextInt();
//            String tutore = input2.next();
//            Elev e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
//            elevi.add(e);
//        }
//
//        input2.close();
//        return elevi;
//    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.numeFisier));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev elev = new Elev();
            super.readAplicant(input2,elev);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
