package it.unikey;

public abstract class Cassa {
    public static String GeneraScontrino(Carrello carrello) {
        return carrello.toString() + "\n" +
                "TOTALE: " + TotaleCarrello(carrello) + "€";
    }

    private static float TotaleCarrello(Carrello carrello) {
        float Totale = 0;
        for (Prodotto p : carrello.getContenutoCarrello()) {
            Totale += p.getPrezzoProdotto();
        }
        return Totale;
    }
}
