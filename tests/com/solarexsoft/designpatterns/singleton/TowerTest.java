package com.solarexsoft.designpatterns.singleton;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by houruhou on 01/06/2017.
 */
class TowerTest extends SingletonTest<Tower> {
    public TowerTest() {
        super(Tower::getInstance);
    }

}