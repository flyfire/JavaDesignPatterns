package com.solarexsoft.designpatterns.factorymethod;

/**
 * Created by houruhou on 02/06/2017.
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("DatabaseLogger log to database");
    }
}
