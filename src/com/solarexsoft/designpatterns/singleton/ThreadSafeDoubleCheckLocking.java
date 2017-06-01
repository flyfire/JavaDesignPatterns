package com.solarexsoft.designpatterns.singleton;

/**
 * Created by houruhou on 01/06/2017.
 */
public class ThreadSafeDoubleCheckLocking {
    private static volatile ThreadSafeDoubleCheckLocking instance;

    private ThreadSafeDoubleCheckLocking() {
        // prevent instantiating by reflection call
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static ThreadSafeDoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeDoubleCheckLocking.class){
                if (instance == null){
                    instance = new ThreadSafeDoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
