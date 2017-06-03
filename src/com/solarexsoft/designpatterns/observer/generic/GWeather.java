package com.solarexsoft.designpatterns.observer.generic;

import com.solarexsoft.designpatterns.observer.WeatherType;

/**
 * Created by houruhou on 03/06/2017.
 */
public class GWeather extends Observable<GWeather, Animal, WeatherType> {
    private WeatherType currentWeather;

    public GWeather() {
        currentWeather = WeatherType.SUNNY;
    }

    public void weatherChanges() {
        WeatherType[] enumWeathers = WeatherType.values();
        currentWeather = enumWeathers[(currentWeather.ordinal()+1)%enumWeathers.length];
        notifyObservers(currentWeather);
    }
}
