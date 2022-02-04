package it.unikey.primecalculator.utilities;

public abstract class PrimeArrayUtil {

    public static long[] check(long[] inputArray) {
        long[] PrimesArray = new long[0];
        int primesListLength = 0;
        for(long n : inputArray) {
            if(PrimeUtil.isPrime(n)) {
                primesListLength++;
                PrimesArray = LongArrayUtil.copy(PrimesArray, primesListLength);
                PrimesArray[primesListLength - 1] = n;
            }
        }
        return PrimesArray;
    }
}
