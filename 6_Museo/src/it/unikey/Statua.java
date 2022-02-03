package it.unikey;

public class Statua extends Opera {

    private String materiale;
    private int altezza;

    public Statua() {
    }

    public Statua(String titolo, String autore, boolean isEsposta, String materiale, int altezza) {
        super(titolo, autore, isEsposta);
        this.materiale = materiale;
        this.altezza = altezza;
    }

    public String getMateriale() {
        return materiale;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Statua [autore = " + super.getAutore() + 
                ", titolo = " + super.getTitolo() + 
                ", isEsposta = " + super.isEsposta() +
                ", altezza = " + altezza + 
                ", materiale = " + materiale + "]";
    }

   
    
}
