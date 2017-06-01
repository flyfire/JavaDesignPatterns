package com.solarexsoft.designpatterns.simplefactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by houruhou on 01/06/2017.
 */
public class SimpleFactoryTest {
    @Test
    public void test(){
        Army army = ArmyFactory.getArmy("c");
        assertNull(army);
        army = ArmyFactory.getArmy("k");
        assertTrue(army instanceof KArmy);
        assertEquals(army.getDescription(), KArmy.DESCRIPTION);
        army = ArmyFactory.getArmy("v");
        assertTrue(army instanceof VArmy);
        assertEquals(army.getDescription(), VArmy.DESCRIPTION);
    }
}
