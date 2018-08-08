package com.utils;

import com.api.WeatherService;
import com.constants.ModelAttributes;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Data
@RequiredArgsConstructor
public class DataBuilder {

    private final List<WeatherService> weatherServices;

    public void addQueryResultIModel(Model model, String query) {
        model.addAttribute(ModelAttributes.WEATHER_LIST, weatherServices
                .stream()
                .flatMap(weatherService -> weatherService.getWeather(query).stream())
                .collect(Collectors.toList()));
    }

    public void addQueryResultIModel(Model model, double lat, double lon) {
        model.addAttribute(ModelAttributes.WEATHER_LIST, weatherServices
                .stream()
                .flatMap(weatherService -> weatherService.getWeather(lat, lon).stream())
                .collect(Collectors.toList()));
    }
}
