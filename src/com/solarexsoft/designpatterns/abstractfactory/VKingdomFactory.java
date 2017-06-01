package com.solarexsoft.designpatterns.abstractfactory;

/**
 * Created by houruhou on 01/06/2017.
 */
public class VKingdomFactory implements KingdomFactory {
    @Override
    public King createKing() {
        return new VKing();
    }

    @Override
    public Army createArmy() {
        return new VArmy();
    }
}
