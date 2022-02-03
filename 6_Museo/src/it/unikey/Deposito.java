package it.unikey;

import java.util.ArrayList;

public abstract class Deposito {
    
    private static ArrayList<Opera> listaOpereNelDeposito = new ArrayList<>();

    public static ArrayList<Opera> getListaOpereNelDeposito() {
        return listaOpereNelDeposito;
    }

    public static String stampaDeposito() {
        String ris = "\nLista Opere nel Deposito:\n\n";
        for(Opera o : listaOpereNelDeposito)
            ris += o.toString() + "\n";
        return ris;
    }

    
    
}
