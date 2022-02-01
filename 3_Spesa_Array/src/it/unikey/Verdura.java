package it.unikey;

public class Verdura extends Prodotto{
    private float pesoKg;

    public Verdura() {
    }

    public Verdura (String nomeVerdura, float prezzoKg, float pesoKg) {
        super.setNomeProdotto(nomeVerdura);
        super.setPrezzoProdotto(prezzoKg);
        if(pesoKg < 0.1)
            setPesoKg(0.1f);
        else
            setPesoKg(pesoKg);
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public String toString() {
        return "Nome della Verdura: "      + getNomeProdotto() + "\n"  +
                "Peso: "                   + getPesoKg()       + " Kg" + "\n" +
                "Prezzo Della Verdura: "   + getPrezzoProdotto() + "€";
    }
}
