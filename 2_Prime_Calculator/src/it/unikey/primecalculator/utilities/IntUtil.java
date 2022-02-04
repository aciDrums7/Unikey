package it.unikey.primecalculator.utilities;

import it.unikey.primecalculator.entities.Menu;

public abstract class IntUtil {

    public static int check(String scannerInput) {
        boolean isInt = false;
        int parsedInput = 0;
        do {
            try {
                parsedInput = Integer.parseInt(scannerInput);
                isInt = true;
            }
            catch(Exception e) {
                System.out.print("Ehm... insert an INT number: ");
                scannerInput = Menu.getKeyboard().nextLine();
            }
        } while(!isInt);
        return parsedInput;
    }
}
