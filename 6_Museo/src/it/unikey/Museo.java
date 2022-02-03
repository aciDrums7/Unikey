package it.unikey;

import java.util.ArrayList;

public abstract class Museo {

    private static int spazioOpereMuseo = 3;
    private static ArrayList<Opera> listaOpereNelMuseo = new ArrayList<>();

    public static int getSpazioOpereMuseo() {
        return spazioOpereMuseo;
    }

    public static void setSpazioOpereMuseo(int spazioOpereMuseo) {
        Museo.spazioOpereMuseo = spazioOpereMuseo;
    }

    public static ArrayList<Opera> getListaOpereNelMuseo() {
        return listaOpereNelMuseo;
    }

    public static void carica(Opera opera) {
        if(!listaOpereNelMuseo.contains(opera)) {
            if (listaOpereNelMuseo.size() < spazioOpereMuseo) {
                opera.setEsposta(true);
                listaOpereNelMuseo.add(opera);
                System.out.println("\n" + opera.getTitolo() + " esposta/o nel Museo!");
            } else if(!Deposito.getListaOpereNelDeposito().contains(opera)){
                opera.setEsposta(false);
                Deposito.getListaOpereNelDeposito().add(opera);
                System.out.println("\nNon c'e' piu' posto nel Museo... " + opera.getTitolo() + " spostata/o nel Deposito :(");
            }
        }
    }

    public static Opera sposta(int codice) {
        try{
            listaOpereNelMuseo.get(codice).setEsposta(false);
            Deposito.getListaOpereNelDeposito().add(listaOpereNelMuseo.get(codice));
            listaOpereNelMuseo.remove(codice);
            return listaOpereNelMuseo.get(codice);
        }
        catch(Exception e) {
            System.out.println( "Opera non esposta nel Museo: impossibile effettuare lo spostamento");
            return null;
        }
    }

    public static String stampaSala() {
        String ris = "\nLista Opere nel Museo:\n\n";
        for (Opera o : listaOpereNelMuseo)
            ris += o.toString() + "\n";
        return ris;
    }

}
