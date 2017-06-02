package com.solarexsoft.designpatterns.decorator;

/**
 * Created by houruhou on 02/06/2017.
 */
public class SimpleWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("warrior tries to grab you.");
    }

    @Override
    public void fleeBattle() {
        System.out.println("warrior shrieks in horror and runs away.");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }
}
