package it.unikey;

public class Quadro extends Opera {

    private String tecnicaUsata;

    public Quadro() {
    }

    public Quadro(String titolo, String autore, boolean isEsposta, String tecnicaUsata) {
        super(titolo, autore, isEsposta);
        this.tecnicaUsata = tecnicaUsata;
    }

    public String getTecnicaUsata() {
        return tecnicaUsata;
    }

    public void setTecnicaUsata(String tecnicaUsata) {
        this.tecnicaUsata = tecnicaUsata;
    }

    @Override
    public String toString() {
        return "Quadro [autore = " + super.getAutore() + 
                ", titolo = " + super.getTitolo() + 
                ", isEsposta = " + super.isEsposta() + 
                ", tecnicaUsata = " + tecnicaUsata + "]";
    }


    
}
