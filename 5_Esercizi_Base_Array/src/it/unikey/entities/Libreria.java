package it.unikey.entities;

public class Libreria {
    private Libro[] libri;

    public Libreria(Libro[] libri) {
        this.libri = libri;
    }

    public int LibriAutorePrezzoMajN(String autore, double prezzo) {
        int counter = 0;
        for(Libro l : libri) {
            if(l.getAutore().equalsIgnoreCase(autore) &&
                l.getPrezzo() > prezzo)
                counter++;
        }
        return counter;
    }
}
