package com.api;

import com.classes.Entity;

import java.util.List;

public interface WeatherService {

    List<Entity> getWeather(double lat, double lon);

    List<Entity> getWeather(String query);
}
