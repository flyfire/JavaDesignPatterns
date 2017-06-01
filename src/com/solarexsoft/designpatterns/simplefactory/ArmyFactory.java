package com.solarexsoft.designpatterns.simplefactory;

/**
 * Created by houruhou on 01/06/2017.
 */
public class ArmyFactory {
    public static Army getArmy(String arg) {
        Army result = null;
        if (arg.equalsIgnoreCase("K")) {
            result = new KArmy();
        } else if (arg.equalsIgnoreCase("V")) {
            result = new VArmy();
        }
        return result;
    }
}
