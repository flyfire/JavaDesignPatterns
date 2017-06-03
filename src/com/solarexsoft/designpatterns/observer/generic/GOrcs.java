package com.solarexsoft.designpatterns.observer.generic;

import com.solarexsoft.designpatterns.observer.WeatherType;

/**
 * Created by houruhou on 03/06/2017.
 */
public class GOrcs implements Animal {
    @Override
    public void update(GWeather subject, WeatherType argument) {
        switch (argument) {
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
