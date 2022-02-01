package it.unikey;

public class Main {

    public static void main(String[] args) {
        Persona francesco = new Persona("Francesco", "Male", 28);

        Impiegato giovanni = new Impiegato();

        Persona edoardo = new Impiegato();
        //proprieta' e metodi sono di Persona;
        //inizializzando a Impiegato, se c'e' override
        //si vedra' l'output del metodo overridato

        Persona sara = new Persona("Francesco", "Male", 28);



    }
}
