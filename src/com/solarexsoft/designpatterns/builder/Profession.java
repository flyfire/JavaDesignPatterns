package com.solarexsoft.designpatterns.builder;

/**
 * Created by houruhou on 02/06/2017.
 */
public enum Profession {
    WARRIOR,KING,THIEF;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
