package com.solarexsoft.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Created by houruhou on 01/06/2017.
 */
public abstract class SingletonTest<T> {
    private final Supplier<T> singletonInstanceMethod;

    public SingletonTest(final Supplier<T> singletonInstanceMethod) {
        this.singletonInstanceMethod = singletonInstanceMethod;
    }

    /*
     Test the singleton in a non-concurrent setting
     */
    @Test
    public void testMultipleCallsReturnTheSameObjectInSameThread() {
        T instance1 = this.singletonInstanceMethod.get();
        T instance2 = this.singletonInstanceMethod.get();
        T instance3 = this.singletonInstanceMethod.get();
        assertSame(instance1, instance2);
        assertSame(instance2, instance3);
        assertSame(instance1, instance3);
    }

    /*
     Test singleton instance in a concurrent setting
     */
    @Test
    public void testMultipleCallsReturnTheSameObjectInDifferentThreads() throws Exception {
        // create 10000 tasks and inside each callable instantiate the singleton class
        final List<Callable<T>> tasks = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            tasks.add(this.singletonInstanceMethod::get);
        }

        final ExecutorService executorService = Executors.newFixedThreadPool(8);
        final List<Future<T>> results = executorService.invokeAll(tasks);
        final T expectedInstance = this.singletonInstanceMethod.get();
        for (Future<T> result : results) {
            final T instance = result.get();
            assertNotNull(instance);
            assertSame(instance, expectedInstance);
        }

        executorService.shutdown();


    }


}
