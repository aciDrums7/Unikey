package it.unikey;

public class Prodotto {
    private String nomeProdotto;
    private float prezzoProdotto;

    public Prodotto() {
    }

    public Prodotto(float prezzoProdotto) {
        setPrezzoProdotto(prezzoProdotto);
    }

    public Prodotto(String nomeProdotto) {
        setNomeProdotto(nomeProdotto);
    }

    public Prodotto(String nomeProdotto, float prezzoProdotto) {
        setNomeProdotto(nomeProdotto);
        setPrezzoProdotto(prezzoProdotto);
    }

    public float getPrezzoProdotto() {
        return prezzoProdotto;
    }

    public void setPrezzoProdotto(float prezzo) {
        prezzoProdotto = prezzo;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    @Override
    public String toString() {
        return "Nome del Prodotto: "        + nomeProdotto + "\n" +
                "Prezzo Base Del Prodotto"  + prezzoProdotto;
    }
}
