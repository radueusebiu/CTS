package ro.ase.cts.builder.program;

import ro.ase.cts.builder.Rezervare;
import ro.ase.cts.builder.RezervareBuilder;
import ro.ase.cts.builder.RezervareBuilderV2;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(1,false,true,true,false,"Jaz");
        System.out.println(rezervare);

        Rezervare rezervare2 = new RezervareBuilder()
                .setCod(10)
                .setBauturaRacoritoareInclusa(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .build();
        System.out.println(rezervare2.toString());

        Rezervare rezervare3 = new RezervareBuilder()
                .setCod(11)
                .setScaunErgonomic(true)
                .build();
        System.out.println(rezervare3.toString());

        Rezervare rezervare4 = new RezervareBuilder(12)
                .setGenMuzica("pop")
                .build();
        System.out.println(rezervare4.toString());

        RezervareBuilder builder = new RezervareBuilder();
        Rezervare r1;
        Rezervare r2;
        r1 = builder.setGenMuzica("jazz").build();
        r2 = builder.setCod(14).build();
        System.out.println(r1.toString());
        System.out.println(r2.toString());

        RezervareBuilderV2 builderV2 = new RezervareBuilderV2()
                .setBauturaRacoritoareInclusa(true)
                .setMancareInclusa(true);
        Rezervare rezervare5 = builderV2.setCod(5).build();
        Rezervare rezervare6 = builderV2.setCod(6).build();
        System.out.println(rezervare5.toString());
        System.out.println(rezervare6.toString());
    }
}
