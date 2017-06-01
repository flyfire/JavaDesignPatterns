package com.solarexsoft.designpatterns.abstractfactory;

/**
 * Created by houruhou on 01/06/2017.
 */
public class App {
    private King king;
    private Army army;

    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setArmy(factory.createArmy());
    }

    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }

    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    public King getKing() {
        return king;
    }

    public void setKing(King king) {
        this.king = king;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

}
