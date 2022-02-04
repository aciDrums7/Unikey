package it.unikey.primecalculator.entities;

import it.unikey.primecalculator.utilities.IntUtil;
import java.util.Scanner;

public abstract class Menu {
  private static final Scanner keyboard = new Scanner(System.in);

  public static void launchMenu() {
    boolean isNewIteration = false;
    System.out.print("Welcome to the Prime Calculator! " + "\n");
    do {
      boolean isOptionAvailable = false;
      System.out.print(
          "\n------------------------" +
              "\nPlease select an option:" +
              "\n\n1) Check primes in list" +
              "\n2) Print Primes < n" +
              "\n3) Print n Fibonacci numbers" +
              "\n\nInsert an available option: ");
      String scannerInput = keyboard.nextLine();
      do {
        switch (IntUtil.check(scannerInput)) {
          case 1:
            isOptionAvailable = true;
            PrimesInList.launchPrimesInList();
            break;
          case 2:
            isOptionAvailable = true;
            PrimesUnderN.launchPrimesUnderN();
            break;
          case 3:
            isOptionAvailable = true;
            NFibonacciNumbers.launchNFibonacciNumbers();
            break;
          default:
            System.out.print("Ehm... insert an available option: ");
            scannerInput = keyboard.nextLine();
            break;
        }
      } while (!isOptionAvailable);

      System.out.print(
          "\n----------------------------------------------------" +
              "\nDo you want to restart the Prime Calculator (y/n)? ");
      String restartCalculator = keyboard.next();
      while (!(restartCalculator.equalsIgnoreCase("y") ||
          restartCalculator.equalsIgnoreCase("n"))) {
        System.out.println(
            "I didn't get it... Do you want to restart the Prime Calculator (y/n)? ");
        restartCalculator = keyboard.next();
      }
      if (restartCalculator.equalsIgnoreCase("y"))
        isNewIteration = true;
      else if (restartCalculator.equalsIgnoreCase("n"))
        isNewIteration = false;
    } while (isNewIteration);

    System.out.println(
        "\nThanks for using Prime Calculator, have a nice day! :)");
  }

  public static Scanner getKeyboard() {
    return keyboard;
  }
}
