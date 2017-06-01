package com.solarexsoft.designpatterns.singleton;

/**
 * Created by houruhou on 01/06/2017.
 */
public class EnumTowerTest extends SingletonTest<EnumTower> {
    public EnumTowerTest() {
        super(() -> EnumTower.INSTANCE);
    }
}
