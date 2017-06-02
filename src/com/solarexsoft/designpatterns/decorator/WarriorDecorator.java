package com.solarexsoft.designpatterns.decorator;

/**
 * Created by houruhou on 02/06/2017.
 */
public class WarriorDecorator implements Warrior {
    private Warrior original;
    public WarriorDecorator(Warrior original){
        this.original = original;
    }
    @Override
    public void attack() {
        original.attack();
    }

    @Override
    public void fleeBattle() {
        original.fleeBattle();
    }

    @Override
    public int getAttackPower() {
        return original.getAttackPower();
    }
}
