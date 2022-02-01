package it.unikey;

public class Carrello {
    private Prodotto[] contenuto;

    public Carrello() {
        contenuto = new Prodotto[0];
    }

    public Prodotto[] getContenuto() {
        return contenuto;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        Prodotto[] temp = new Prodotto[contenuto.length + 1];
        for(int i = 0; i < contenuto.length; i++) {
            temp[i] = contenuto[i];
        }
        temp[temp.length-1] = prodotto;
        contenuto = temp;
        System.out.println('"' + prodotto.getNomeProdotto() + '"' + " aggiunto con successo al carrello!");
    }

    public void rimuoviProdotto(String nomeProdotto) {
        boolean isFound = false;
        int indexFound = -1;
        for(int i = 0; i < contenuto.length; i++) {
            if (nomeProdotto.equalsIgnoreCase(contenuto[i].getNomeProdotto()))  {
                isFound = true;
                indexFound = i;
            }
        }
        if(isFound) {
            Prodotto[] temp = new Prodotto[contenuto.length-1];
            int j = 0;
            for(int i = 0; i < temp.length; i++) {
                j++;
                if(j == indexFound) {
                    j++;
                    temp[i] = contenuto[j];
                }
                else
                    temp[i] = contenuto[j];
            }
            contenuto = temp;
            System.out.println('"' + nomeProdotto + '"' + " rimosso con successo dal carrello!");
        }
        else
            System.out.println("Prodotto non trovato!");
    }

    @Override
    public String toString() {
        String prodottiNelCarrello = "\nContenuto del Carrello:" +
                                     "\n-------------------------------" + "\n";
        for(Prodotto p : contenuto)
            prodottiNelCarrello += p.toString() +
                                    "\n-------------------------------" + "\n";
        return prodottiNelCarrello;
    }
}
