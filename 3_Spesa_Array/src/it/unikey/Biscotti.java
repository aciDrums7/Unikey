package it.unikey;

public class Biscotti extends Prodotto {
    private String tipoConfezione;

    public Biscotti() {
    }

    public Biscotti(String nomeBiscotti, float prezzoBiscotti, String tipoConfezione) {
        super.setNomeProdotto(nomeBiscotti);
        switch(tipoConfezione.toLowerCase()) {
            case "media":
                setTipoConfezione("media");
            break;
            case "grande":
                setTipoConfezione("grande");
            break;
            default:
                setTipoConfezione("piccola");
            break;
        }
        setPrezzoBiscotti(prezzoBiscotti);
    }

    public String getTipoConfezione() {
        return tipoConfezione;
    }

    public void setTipoConfezione(String tipoConfezione) {
        this.tipoConfezione = tipoConfezione;
    }

    public void setPrezzoBiscotti(float prezzo) {
        switch(tipoConfezione) {
            case "media":
                super.setPrezzoProdotto(prezzo *= 1.5);
            break;
            case "grande":
                super.setPrezzoProdotto(prezzo *= 2);
            break;
            default:
                super.setPrezzoProdotto(prezzo);
            break;
        }
    }

    @Override
    public String toString() {
        return
                "Nome dei Biscotti: "      + getNomeProdotto() + "\n" +
                "Confezione: "            + getTipoConfezione() + "\n" +
                "Prezzo Dei Biscotti: "   + getPrezzoProdotto() + "€";
    }
}
