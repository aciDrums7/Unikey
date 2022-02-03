package it.unikey;

public class Main {

    public static void main(String[] args) {
        Quadro a = new Quadro("Impressioni di Settembre", "sdvsdv", true, "sdvdv");
        Statua b = new Statua("Il David", "sdvsdv", true, "sdvdv", 105);
        Quadro c = new Quadro();
        Statua d = new Statua();

        Deposito.getListaOpereNelDeposito().add(d);

        Museo.carica(a);
        Museo.carica(a);
        Museo.carica(b);
        Museo.carica(c);
        Museo.carica(d);
        Museo.carica(d);

        System.out.println(Museo.stampaSala());
        System.out.println(Deposito.stampaDeposito());

        Opera.cerca(7);

        Museo.sposta(2);

        System.out.println(Museo.stampaSala());
        System.out.println(Deposito.stampaDeposito());
        
    }
}
