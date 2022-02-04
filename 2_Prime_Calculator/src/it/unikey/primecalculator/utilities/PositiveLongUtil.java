package it.unikey.primecalculator.utilities;

import it.unikey.primecalculator.entities.Menu;

public abstract class PositiveLongUtil {

    public static long check(long longNumber) {
        boolean isPositiveLong = false;
        do {
            if(longNumber <= 0) {
                System.out.print("Ehm... insert a positive INT number: ");
                longNumber = IntUtil.check(Menu.getKeyboard().nextLine());
            }
            else
                isPositiveLong = true;
        } while(!isPositiveLong);
        return longNumber;
    }
}
