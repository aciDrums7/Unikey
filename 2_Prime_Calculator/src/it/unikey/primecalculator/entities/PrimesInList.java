package it.unikey.primecalculator.entities;
import it.unikey.primecalculator.utilities.*;
import it.unikey.primecalculator.utilities.IntUtil;

public abstract class PrimesInList {

    public static void launchPrimesInList() {
        System.out.print("How many integers do you want to check? ");
        boolean isAlreadyInArray = false;
        long newNumber;
        int nOfInt = PositiveIntUtil.check(IntUtil.check(Menu.getKeyboard().nextLine()));
        long[] Array = new long[nOfInt];
        for(int i = 0; i < nOfInt; i++) {
            isAlreadyInArray = false;
            System.out.print("Inserisci il " + (i+1) + "° numero: ");
            newNumber = PositiveLongUtil.check(LongUtil.check(Menu.getKeyboard().nextLine()));
            for (long l : Array)
                if (l == newNumber) {
                    isAlreadyInArray = true;
                    break;
                }
            if(!isAlreadyInArray)
                Array[i] = newNumber;
            }

        long[] PrimesArray = LongArrayUtil.sort(PrimeArrayUtil.check(Array));
        if(PrimesArray.length == 0)
            System.out.println("\n... Error 404: primes numbers not found :')");
        else {
            System.out.println("\nPrimes in list: " + "\n" +
                    "---------------------");
            for(int i = 0; i < PrimesArray.length; i++) {
                if(i == (PrimesArray.length-1))
                    System.out.print(PrimesArray[i] + "\n");
                else
                    System.out.print(PrimesArray[i] + ", ");
            }
        }
    }
}
