package it.unikey.primecalculator.utilities;

import it.unikey.primecalculator.entities.Menu;

public abstract class LongUtil {

    public static long check(String scannerInput) {
        boolean isLong = false;
        long parsedInput = 0;
        do {
            try {
                parsedInput = Long.parseLong(scannerInput);
                isLong = true;
            }
            catch(Exception e) {
                System.out.print("Ehm... insert an INT number: ");
                scannerInput = Menu.getKeyboard().nextLine();
            }
        } while(!isLong);
        return parsedInput;
    }
}
