package it.unikey.utilities;

import java.util.Locale;

public abstract class UtilString {

    /*1) Scrivere il metodo static void stampaIniziali(String nome, String cognome) che stampi su schermo le iniziali di
    nome e cognome nel seguente formato “N. C.” dove N è il primo carattere delle stringa nome e C è il primo carattere
    della stringa cognome.
    Es. nome = “Mario”, cognome = “Rossi” -> M. R.*/
    public static void stampaIniziali(String nome, String cognome) {
        String[] nomeArray = nome.split("");
        String[] cognomeArray = cognome.split("");
        System.out.println(nomeArray[0].toUpperCase() + ". " + cognomeArray[0].toUpperCase() + ".");
    }

    /*2) Scrivere il metodo static void stampaVocali(String s) che stampa solo le vocali della stringa‘s’ presa input.
    Es. s = "Hello World” -> “eoo”*/
    public static void stampaVocali(String s) {
        String[] sArray = s.split("");
        String vocals = "";
        for(String letter : sArray) {
            if(letter.equalsIgnoreCase("a") ||
                letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u"))
                vocals += letter;
        }
        System.out.println(vocals);
    }

    /*3) Scrivere ilmetodo static String contrario(String s) che ritorna la stringa ‘s’ letta alcontrario.
    Es. s = “Hello” -> “olleH”*/
    public static String contrario(String s) {
        String[] sArray = s.split("");
        String sReverse = "";
        for(int i = sArray.length-1; i >= 0; i--) {
            sReverse += sArray[i];
        }
        return sReverse;
    }

    /*4) Scrivere il metodo static boolean haVocali(String s) che ritorni ‘true’ se la stringa ‘s’contiene almeno una
    vocale, false altrimenti.
    Es. s = “Hello” -> true*/
    public static boolean haVocali(String s) {
        String[] sArray = s.split("");
        for(String letter : sArray)
            if(letter.equalsIgnoreCase("a") ||
                letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u"))
                return true;
        return false;
    }

    /*5) Scrivere il metodo static int contaOccorrenze(String s, char occorrenza) che ritorni il numero di volte in cui
    il carattere ‘occorrenza’ compare nella stringa ‘s’.
    Es. s = “Hello World”, occorrenza = ‘l’ -> 3*/
    public static int contaOccorrenze(String s, char occorrenza) {
       int nOccorrenze = 0;
       String newOccorrenza = Character.toString(occorrenza);
       String[] sArray = s.split("");
       for(String letter : sArray)
           if(letter.equalsIgnoreCase(newOccorrenza))
               nOccorrenze++;
       return nOccorrenze;
    }

    /*6) Scrivere il metodo static boolean occorrenze3Consecutive(String s, char occorrenza) cheritorni ‘true’ se la
        stringa ‘s’ contiene 3 caratteri consecutivi uguali a ‘occorrenza’
    Es. s = “Heeeello”, occorrenza = ‘e’ -> true*/
    public static boolean occorrenze3Consecutive(String s, char occorrenza) {
        int nOccorrenze = 0;
        String newOccorrenza = Character.toString(occorrenza);
        String[] sArray = s.split("");
        for(String letter : sArray)
            if(letter.equalsIgnoreCase(newOccorrenza)) {
                nOccorrenze++;
                if(nOccorrenze == 3)
                    return true;
            }
            else
                nOccorrenze = 0;
        return false;
    }

    /*7) Scrivere il metodo static boolean caratteriConsecutivi(String s) che ritorni ‘true’ se lastringa ‘s’
    contiene 3 caratteri qualsiasi uguali consecutivi
    Es. s = “ciaaa” -> true oppure s = “javabase” -> false (in quanto le 3 ‘a’ non sonoconsecutive)*/
    public static boolean caratteriConsecutivi(String s) {
        int nOccorrenze = 0;
        String[] sArray = s.split("");
        String newOccorrenza = sArray[0];
        for(String letter : sArray) {
            if(newOccorrenza.equalsIgnoreCase(letter)) {
                nOccorrenze++;
                if(nOccorrenze == 3)
                    return true;
            }
            else {
                nOccorrenze = 1;
                newOccorrenza = letter;
            }
        }
        return false;
    }

    /*8) Scrivere il metodo static occorrenzeConsecutive(String s, int n, char occorrenza) cheritorna ‘true’
    se la stringa ‘s’ contiene un numero pari a ‘n’ di caratteri consecutivi uguali a‘occorrenza’*/
    public static boolean occorrenzeConsecutive(String s, int n, char occorrenza) {
        int nOccorrenze = 0;
        String newOccorrenza = Character.toString(occorrenza);
        String[] sArray = s.split("");
        for(String letter : sArray)
            if(letter.equalsIgnoreCase(newOccorrenza)) {
                nOccorrenze++;
                if(nOccorrenze == n)
                    return true;
            }
            else
                nOccorrenze = 0;
        return false;
    }

    /*9) Scrivere un metodo static sostituisciOccorrenze(String s, char vecchio, char nuovo) cheritorna una stringa
    contenete i caratteri di ‘s’ tranne quelli uguali al carattere ‘vecchio’ chedovranno essere sostituiti con il
    carattere ‘nuovo’
    Es. s = “Hello World”, vecchio = ‘l’, nuovo = ‘*’ -> “He**o Wor*d”*/
    public static String sostituisciOccorrenze(String s, char vecchio, char nuovo) {
        String[] sArray = s.split("");
        String sSostituita = "";
        String sVecchio = Character.toString(vecchio);
        String sNuovo = Character.toString(nuovo);

        for(String letter : sArray) {
            if(letter.equalsIgnoreCase(sVecchio))
                sSostituita += sNuovo;
            else
                sSostituita += letter;
        }
        return sSostituita;
    }

    /*10) Scrivere il metodo static boolean palindroma(String s) che ritorna ‘true’ se la stringa ‘s’ èpalindroma.
    Una stringa è palindroma se letta da dx verso sx o da sx verso dx contiene lastessa sequenza di caratteri.
    Es. s = “anna” -> true; s = “amoroma” -> true; s = “itopinonaveanonipoti” -> true*/
    public static boolean palindroma(String s) {
        return (s.equalsIgnoreCase(contrario(s)));
    }

    /*11) Scrivere un metodo static alternaStringhe(String a, String b) che date due stringhe ‘a’ e ‘b’della stessa
    lunghezza, ritorna la stringa ottenuta prendendo alternativamente uncarattere da ‘a’ e uno da ‘b’.
    Es. a = “hello”, b=”world” -> “hweolrllod”*/
    public static String alternaStringhe(String a, String b) {
        String[] aArray  = a.split("");
        String[] bArray  = b.split("");
        String altString = "";
        for(int i = 0; i < aArray.length; i++) {
            altString += aArray[i] + bArray[i];
        }
        return altString;
    }

    /*12) Scrivere un metodo static void stampaConInizialiMaiuscole(String s) che stampa la stringa‘s’ rendendo maiuscola
    la lettera iniziale di ciascuna parola che compone ‘s’
    Es. s = “un due tre” -> Un Due Tre
    Consiglio: utilizzare i metodi d’istanza della classe s.substring()
    e s.toUpperCase()*/
    public static void stampaConInizialiMaiuscole(String s) {
        String[] sArray = s.split(" ");
        String inizialiMaiusc = "";
        String[] temp;
        for(String word : sArray) {
            temp = word.split("");
            for(int i = 0; i < temp.length; i++) {
                if(i == 0)
                    inizialiMaiusc += temp[i].toUpperCase();
                else {
                    if(i != (temp.length-1))
                        inizialiMaiusc += temp[i];
                    else
                        inizialiMaiusc += temp[i] + " ";
                }
            }
        }
        System.out.println(inizialiMaiusc);
    }
}
