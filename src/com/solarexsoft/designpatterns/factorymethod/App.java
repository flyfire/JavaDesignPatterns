package com.solarexsoft.designpatterns.factorymethod;

/**
 * Created by houruhou on 02/06/2017.
 */
public class App {
    public static void main(String args[]){
        LoggerFactory factory = null;
        factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
        factory = new DatabaseLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
