package com.solarexsoft.designpatterns.observer.generic;

import com.solarexsoft.designpatterns.observer.WeatherType;

/**
 * Created by houruhou on 03/06/2017.
 */
public interface Animal extends Observer<GWeather, Animal, WeatherType> {
}
