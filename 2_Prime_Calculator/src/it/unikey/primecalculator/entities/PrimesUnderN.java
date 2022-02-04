package it.unikey.primecalculator.entities;
import it.unikey.primecalculator.utilities.*;

public abstract class PrimesUnderN {

    public static void launchPrimesUnderN() {
        System.out.print("\nInsert an int number: ");
        int supLimit = PositiveIntUtil.check(IntUtil.check(Menu.getKeyboard().nextLine()));
        long[] longArray = new long[supLimit];
        for(int i = 1; i < longArray.length; i++) {
            longArray[i] = i;
        }
        long[] PrimesArray = PrimeArrayUtil.check(longArray);
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
