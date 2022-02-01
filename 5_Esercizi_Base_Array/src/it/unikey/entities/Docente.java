package it.unikey.entities;

public class Docente {
    private String nome;
    private String cognome;
    private int codice;
    private int eta;

    public Docente(String nome, String cognome, int codice, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.eta = eta;
    }

    public String getCognome() {
        return cognome;
    }

    public int getCodice() {
        return codice;
    }

    public int getEta() {
        return eta;
    }
}
