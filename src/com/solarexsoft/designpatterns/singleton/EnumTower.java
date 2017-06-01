package com.solarexsoft.designpatterns.singleton;

/**
 * Created by houruhou on 01/06/2017.
 */
public enum EnumTower {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
