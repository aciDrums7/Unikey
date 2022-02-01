package it.unikey;

public class Verdura extends Prodotto{
    private float pesoKg;

    public Verdura (String nomeVerdura, float prezzoKg, float pesoKg) {
        super.setNomeProdotto(nomeVerdura);
        if(pesoKg < 0.1)
            setPesoKg(0.1f);
        else
            setPesoKg(pesoKg);
        setPrezzoVerdura(prezzoKg);
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    public void setPrezzoVerdura(float prezzoKg) {
        super.setPrezzoProdotto(prezzoKg * getPesoKg());
    }

    @Override
    public String toString() {
        return "Nome della Verdura: "      + getNomeProdotto() + "\n"  +
                "Peso: "                   + getPesoKg()       + " Kg" + "\n" +
                "Prezzo Della Verdura: "   + getPrezzoProdotto() + "€";
    }
}
