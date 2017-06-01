package com.solarexsoft.designpatterns.singleton;

/**
 * Created by houruhou on 01/06/2017.
 */
public final class Tower {
    private Tower() {
    }

    private static final Tower INSTANCE = new Tower();

    public static Tower getInstance(){
        return INSTANCE;
    }
}
