package com.solarexsoft.designpatterns.abstractfactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by houruhou on 01/06/2017.
 */
public class AbstractFactoryTest {
    private App app = new App();
    private static KingdomFactory kKingdomFactory;
    private static KingdomFactory vKingdomFactory;

    @BeforeAll
    public static void setup() {
        kKingdomFactory = new KKingdomFactory();
        vKingdomFactory = new VKingdomFactory();
    }

    @Test
    public void king() {
        final King kKing = app.getKing(kKingdomFactory);
        assertTrue(kKing instanceof KKing);
        assertEquals(kKing.getAge(), KKing.AGE);
        final King vKing = app.getKing(vKingdomFactory);
        assertTrue(vKing instanceof VKing);
        assertEquals(vKing.getAge(), VKing.AGE);
    }

    @Test
    public void army() {
        final Army kArmy = app.getArmy(kKingdomFactory);
        assertTrue(kArmy instanceof KArmy);
        assertEquals(kArmy.getDescription(), KArmy.DESCRIPTION);
        final Army vArmy = app.getArmy(vKingdomFactory);
        assertTrue(vArmy instanceof VArmy);
        assertEquals(vArmy.getDescription(), VArmy.DESCRIPTION);
    }

    @Test
    public void createKKingdom() {
        app.createKingdom(kKingdomFactory);
        final King king = app.getKing();
        final Army army = app.getArmy();
        assertTrue(king instanceof KKing);
        assertTrue(army instanceof KArmy);
        assertEquals(king.getAge(), KKing.AGE);
        assertEquals(army.getDescription(), KArmy.DESCRIPTION);
    }

    @Test
    public void createVKingdom() {
        app.createKingdom(vKingdomFactory);
        final King king = app.getKing();
        final Army army = app.getArmy();
        assertTrue(king instanceof VKing);
        assertTrue(army instanceof VArmy);
        assertEquals(king.getAge(), VKing.AGE);
        assertEquals(army.getDescription(), VArmy.DESCRIPTION);
    }
}
