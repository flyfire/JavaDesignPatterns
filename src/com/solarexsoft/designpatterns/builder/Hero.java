package com.solarexsoft.designpatterns.builder;

/**
 * Created by houruhou on 02/06/2017.
 */
public class Hero {

    private Profession profession;
    private String name;
    private HairColor hairColor;
    private Weapon weapon;

    public Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.weapon = builder.weapon;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a ").append(profession).append(" named ").append(name);
        if (hairColor != null) {
            sb.append(" with ").append(hairColor).append(" hair");
        }
        if (weapon != null) {
            sb.append(" armed with ").append(weapon);
        }
        sb.append(".");
        return sb.toString();
    }

    public static class Builder {
        private final Profession profession;
        private final String name;
        private HairColor hairColor;
        private Weapon weapon;

        public Builder(Profession profession, String name) {
            if (profession == null || name == null) {
                throw new IllegalStateException("profession and name cant be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }

    }
}
