package com.solarexsoft.designpatterns.simplefactory;

/**
 * Created by houruhou on 01/06/2017.
 */
public class App {
    public static void main(String args[]) {
        Army army = null;
        army = ArmyFactory.getArmy("k");
        System.out.println(army.getDescription());
        army = ArmyFactory.getArmy("v");
        System.out.println(army.getDescription());
    }
}
