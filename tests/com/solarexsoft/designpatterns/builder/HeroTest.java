package com.solarexsoft.designpatterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by houruhou on 02/06/2017.
 */
class HeroTest {
    @Test
    public void testMissingProfession() throws Exception {
        assertThrows(IllegalStateException.class, ()->{
            new Hero.Builder(null, "a");
        });
    }

    @Test
    public void testMissingName() throws Exception {
        assertThrows(IllegalStateException.class, ()->{
            new Hero.Builder(Profession.KING, null);
        });
    }

    @Test
    public void testBuildHero() throws Exception {
        final String name = "David";
        final Hero hero = new Hero.Builder(Profession.WARRIOR, name)
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.BOW).build();
        assertNotNull(hero);
        assertNotNull(hero.toString());
        assertEquals(Profession.WARRIOR, hero.getProfession());
        assertEquals(name, hero.getName());
        assertEquals(HairColor.BLACK, hero.getHairColor());
        assertEquals(Weapon.BOW, hero.getWeapon());
    }
}