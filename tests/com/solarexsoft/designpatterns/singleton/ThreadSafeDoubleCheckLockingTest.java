package com.solarexsoft.designpatterns.singleton;

/**
 * Created by houruhou on 01/06/2017.
 */
public class ThreadSafeDoubleCheckLockingTest extends SingletonTest<ThreadSafeDoubleCheckLocking> {
    public ThreadSafeDoubleCheckLockingTest() {
        super(ThreadSafeDoubleCheckLocking::getInstance);
    }
}
