package com.solarexsoft.designpatterns.observer;

/**
 * Created by houruhou on 03/06/2017.
 */
public enum WeatherType {
    SUNNY, RAINY, WINDY, COLD;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
