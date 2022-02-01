package it.unikey;

public class Main {

    public static void main(String[] args) {
        Prodotto p;
        p = new Prodotto("Edoardo", 23);
        Biscotti campagnole = new Biscotti("Campagnole", 23, "media");
        Verdura pepperoni = new Verdura("Peperoni" ,1.75f, 3);

        /*System.out.println(pepperoni.getPrezzoProdotto() + " €");
        System.out.println(campagnole.toString());
        System.out.println(pepperoni.toString());*/

        Carrello c = new Carrello();
        c.aggiungiProdotto(campagnole);
        c.aggiungiProdotto(pepperoni);
        //System.out.println(c.toString());

        c.rimuoviProdotto("campagnole");
        //System.out.println(c.toString());

        System.out.println(Cassa.GeneraScontrino(c));

    }
}
