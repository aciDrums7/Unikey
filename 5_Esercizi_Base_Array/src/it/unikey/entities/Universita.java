package it.unikey.entities;

public class Universita {
    private Docente[] docenti;

    public Universita(Docente[] docenti) {
        this.docenti = docenti;
    }

    public int etaMinima() {
        int etaMin = Integer.MAX_VALUE;
        for(Docente d : this.docenti) {
            if(d.getEta() < etaMin)
                etaMin = d.getEta();
        }
        return etaMin;
    }
}
