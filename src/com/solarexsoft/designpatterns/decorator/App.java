package com.solarexsoft.designpatterns.decorator;

/**
 * Created by houruhou on 02/06/2017.
 */
public class App {
    public static void main(String[] args) {
        SimpleWarrior warrior = new SimpleWarrior();
        warrior.attack();
        warrior.fleeBattle();

        ClubbedWarrior clubbedWarrior = new ClubbedWarrior(warrior);
        clubbedWarrior.attack();
        clubbedWarrior.fleeBattle();
    }
}
