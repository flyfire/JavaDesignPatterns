package com.solarexsoft.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by houruhou on 03/06/2017.
 */
public class WeatherObservable {
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public WeatherObservable() {
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void weatherChanges() {
        WeatherType[] enumWeather = WeatherType.values();
        currentWeather = enumWeather[(currentWeather.ordinal() + 1) % enumWeather.length];
        notifyObservers(currentWeather);
    }

    private void notifyObservers(WeatherType currentWeather) {
        for (WeatherObserver observer : observers) {
            observer.update(currentWeather);
        }
    }
}
