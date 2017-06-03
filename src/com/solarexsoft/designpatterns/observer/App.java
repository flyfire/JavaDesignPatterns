package com.solarexsoft.designpatterns.observer;

import com.solarexsoft.designpatterns.observer.generic.GHobbits;
import com.solarexsoft.designpatterns.observer.generic.GOrcs;
import com.solarexsoft.designpatterns.observer.generic.GWeather;

/**
 * Created by houruhou on 03/06/2017.
 */
public class App {
    public static void main(String[] args) {
        WeatherObservable weatherObservable = new WeatherObservable();
        weatherObservable.addObserver(new Hobbits());
        weatherObservable.addObserver(new Orcs());
        weatherObservable.weatherChanges();
        weatherObservable.weatherChanges();
        weatherObservable.weatherChanges();
        weatherObservable.weatherChanges();
        System.out.println("-------------");
        GWeather weather = new GWeather();
        weather.addObserver(new GHobbits());
        weather.addObserver(new GOrcs());
        weather.weatherChanges();
        weather.weatherChanges();
        weather.weatherChanges();
        weather.weatherChanges();
    }
}
