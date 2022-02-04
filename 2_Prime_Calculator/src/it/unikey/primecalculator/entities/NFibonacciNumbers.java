package it.unikey.primecalculator.entities;

import it.unikey.primecalculator.utilities.IntUtil;
import it.unikey.primecalculator.utilities.LongArrayUtil;
import it.unikey.primecalculator.utilities.PositiveIntUtil;

public abstract class NFibonacciNumbers {

    public static void launchNFibonacciNumbers() {
        System.out.print("\nHow many Fibonacci numbers do you want to print (between 2 and 93)? ");
        int nFibonacciNumbers = PositiveIntUtil.check(IntUtil.check(Menu.getKeyboard().nextLine()));
        boolean isNValid = false;
        do {
            if(nFibonacciNumbers >= 2 && nFibonacciNumbers <= 93)
                isNValid = true;
            else {
                System.out.print("Ehm... you know, between 2 and 93: ");
                nFibonacciNumbers = PositiveIntUtil.check(IntUtil.check(Menu.getKeyboard().nextLine()));
            }
        } while(!isNValid);
        long[] FibonacciArray = {0,1};
        for(int i = 0; i < (nFibonacciNumbers-2); i++) {
            FibonacciArray = LongArrayUtil.copy(FibonacciArray, (FibonacciArray.length+1));
            FibonacciArray[FibonacciArray.length-1] = FibonacciArray[FibonacciArray.length-2] + FibonacciArray[FibonacciArray.length-3];
        }
        System.out.println("\nFirst " + nFibonacciNumbers + " Fibonacci's numbers: " + "\n" +
                            "---------------------");
        for(int i = 0; i < FibonacciArray.length; i++) {
            if(i == (FibonacciArray.length-1))
                System.out.print(FibonacciArray[i] + "\n");
            else
                System.out.print(FibonacciArray[i] + ", ");
        }
    }
}
