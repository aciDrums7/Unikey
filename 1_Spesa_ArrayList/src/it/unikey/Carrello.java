package it.unikey;

import java.util.ArrayList;

public class Carrello {
    private ArrayList<Prodotto> contenutoCarrello;

    public Carrello() {
        contenutoCarrello = new ArrayList<Prodotto>();
    }

    /*public Carrello() {

    }*/

    public ArrayList<Prodotto> getContenutoCarrello() {
        return contenutoCarrello;
    }

    public void AggiungiProdotto(Prodotto prodottoDaAggiungere) {
        contenutoCarrello.add(prodottoDaAggiungere);
        System.out.println('"' + prodottoDaAggiungere.getNomeProdotto() + '"' + " aggiunto con successo al carrello!");
    }

    public void RimuoviProdotto(Prodotto prodottoDaRimuovere) {
        for(Prodotto p : contenutoCarrello) {
            if (p.getNomeProdotto().equalsIgnoreCase(prodottoDaRimuovere.getNomeProdotto()))
                    contenutoCarrello.remove(p);
        }
        System.out.println('"' + prodottoDaRimuovere.getNomeProdotto() + '"' + " rimosso con successo dal carrello!");
    }

    @Override
    public String toString() {
        String prodottiNelCarrello = "Contenuto del Carrello:" + "\n" + "-------------------------------" + "\n";
        for(Prodotto p : contenutoCarrello)
            prodottiNelCarrello += p.toString() + "\n" + "-------------------------------" + "\n";
        return prodottiNelCarrello;
    }
}
