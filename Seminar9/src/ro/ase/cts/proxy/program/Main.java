package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervare;
import ro.ase.cts.proxy.clase.ProxyRezervare;

public class Main {

    public static void main(String[] args) {
        OperatorRezervare operatorRezervare = new OperatorRezervare("Linea");
        operatorRezervare.rezerva(2);

        ProxyRezervare proxyRezervare = new ProxyRezervare(operatorRezervare,4);
        proxyRezervare.rezerva(2);
        proxyRezervare.rezerva(5);

    }
}
