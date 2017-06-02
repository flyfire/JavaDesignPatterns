package com.solarexsoft.designpatterns.builder;

/**
 * Created by houruhou on 02/06/2017.
 */
public class App {
    public static void main(String[] args) {
        Hero warrior = new Hero.Builder(Profession.WARRIOR, "Aliya").withHairColor(HairColor.BROWN).withWeapon(Weapon.SWORD).build();
        System.out.println(warrior);
        Hero king = new Hero.Builder(Profession.KING, "JohnSnow").withHairColor(HairColor.RED).withWeapon(Weapon.DAGGER).build();
        System.out.println(king);
        Hero thief = new Hero.Builder(Profession.THIEF, "BlackSmith").withHairColor(HairColor.BLACK).withWeapon(Weapon.BOW).build();
        System.out.println(thief);
    }
}
