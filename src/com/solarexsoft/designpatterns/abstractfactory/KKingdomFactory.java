package com.solarexsoft.designpatterns.abstractfactory;

/**
 * Created by houruhou on 01/06/2017.
 */
public class KKingdomFactory implements KingdomFactory {
    @Override
    public King createKing() {
        return new KKing();
    }

    @Override
    public Army createArmy() {
        return new KArmy();
    }
}
