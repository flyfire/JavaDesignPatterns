package com.solarexsoft.designpatterns.factorymethod;

/**
 * Created by houruhou on 02/06/2017.
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
