package com.solarexsoft.designpatterns.observer;

/**
 * Created by houruhou on 03/06/2017.
 */
public class Orcs implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case RAINY:
                System.out.println("The orcs are dripping wet.");
                break;
            case COLD:
                System.out.println("The orcs are freezing cold.");
                break;
            case SUNNY:
                System.out.println("The sun hurts the orcs' eyes.");
                break;
            case WINDY:
                System.out.println("The orc smell almost vanishes in the wind.");
                break;
            default:
                break;
        }
    }
}
