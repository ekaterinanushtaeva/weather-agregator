package com.controllers;

import com.constants.TemplatePaths.Weather;
import com.utils.DataBuilder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.constants.RequestMappings.Weather.*;

@Controller
@Data
@RequiredArgsConstructor
@RequestMapping(ROOT)
public class WeatherController {

    private final DataBuilder dataBuilder;

    @GetMapping(MAIN + QUERY)
    public String getWeatherByQuery(Model model, @PathVariable String query) {
        dataBuilder.addQueryResultIModel(model, query);

        return Weather.MAIN;
    }

    @GetMapping(MAIN)
    public String getWeatherByCoords(Model model, @RequestParam("lat") double lat, @RequestParam("lat") double lon) {
        dataBuilder.addQueryResultIModel(model, lat, lon);

        return Weather.MAIN;
    }
}
