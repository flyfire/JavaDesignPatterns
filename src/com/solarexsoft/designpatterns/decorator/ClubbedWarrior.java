package com.solarexsoft.designpatterns.decorator;

/**
 * Created by houruhou on 02/06/2017.
 */
public class ClubbedWarrior extends WarriorDecorator {
    public ClubbedWarrior(Warrior original) {
        super(original);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("~~~bomb~~~");
    }

    @Override
    public int getAttackPower() {
        return super.getAttackPower() + 10;
    }
}
