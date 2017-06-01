package com.solarexsoft.designpatterns.singleton;

/**
 * Created by houruhou on 01/06/2017.
 */
public class ThreadSafeLazyLoadTower {
    private static ThreadSafeLazyLoadTower sInstance = null;

    private ThreadSafeLazyLoadTower() {

    }

    public static synchronized ThreadSafeLazyLoadTower getInstance() {
        if (sInstance == null) {
            sInstance = new ThreadSafeLazyLoadTower();
        }
        return sInstance;
    }
}
