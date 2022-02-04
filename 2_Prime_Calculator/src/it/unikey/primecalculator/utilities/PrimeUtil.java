package it.unikey.primecalculator.utilities;

public abstract class PrimeUtil {

  public static boolean isPrime(long number) {
    boolean isPrime = false;
    for (int i = 1; i <= number; i++) {
      if (number == 1) break; else if ((i != 1) && (number % i) == 0) if (
        i != number
      ) break; else isPrime = true;
    }
    return isPrime;
  }
}
