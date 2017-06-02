package com.solarexsoft.designpatterns.factorymethod;

/**
 * Created by houruhou on 02/06/2017.
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("FileLooger log to file");
    }
}
