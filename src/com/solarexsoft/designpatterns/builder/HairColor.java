package com.solarexsoft.designpatterns.builder;

/**
 * Created by houruhou on 02/06/2017.
 */
public enum HairColor {
    WHITE,BLACK,BROWN,RED;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
