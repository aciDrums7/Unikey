package it.unikey.main;

import it.unikey.Utilities.ArraysUtilities;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un array di numeri reali, separati da una virgola" +
                            " (es. 3,-6.5,45334.534):");
        ArraysUtilities.printMinMax(ArraysUtilities.toDoubleArray(in.nextLine().split(",")));

    }
}
