package it.unikey.primecalculator.utilities;

import it.unikey.primecalculator.entities.Menu;

public abstract class PositiveIntUtil {

    public static int check(int intNumber) {
        boolean isPositiveInt = false;
        do {
            if(intNumber <= 0) {
                System.out.print("Ehm... insert a positive INT number: ");
                intNumber = IntUtil.check(Menu.getKeyboard().nextLine());
            }
            else
                isPositiveInt = true;
        } while(!isPositiveInt);
        return intNumber;
    }
}
