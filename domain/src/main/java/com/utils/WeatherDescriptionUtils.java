package com.utils;

import com.constants.WeatherDescriptions;
import lombok.experimental.UtilityClass;

import java.util.HashMap;
import java.util.Map;

import static com.constants.YahooConstants.WeatherCodes.*;

@UtilityClass
public class WeatherDescriptionUtils {

    private static Map<Integer, String> yahooCodesToDescriptions = new HashMap<>();

    static {
        yahooCodesToDescriptions.put(TORNADO, WeatherDescriptions.TORNADO);
        yahooCodesToDescriptions.put(HAIL, WeatherDescriptions.HAIL);
        yahooCodesToDescriptions.put(TROPICAL_STORM, WeatherDescriptions.TROPICAL_STORM);
        yahooCodesToDescriptions.put(HURRICANE, WeatherDescriptions.HURRICANE);
        yahooCodesToDescriptions.put(SHOWERS_DAY, WeatherDescriptions.SHOWERS_DAY);
        yahooCodesToDescriptions.put(SEVERE_THUNDERSTORMS, WeatherDescriptions.SEVERE_THUNDERSTORMS);
        yahooCodesToDescriptions.put(THUNDERSTORMS_NIGHT, WeatherDescriptions.THUNDERSTORMS_NIGHT);
        yahooCodesToDescriptions.put(MIXED_RAIN_AND_SNOW, WeatherDescriptions.MIXED_RAIN_AND_SNOW);
        yahooCodesToDescriptions.put(MIXED_RAIN_AND_SLEET, WeatherDescriptions.MIXED_RAIN_AND_SLEET);
        yahooCodesToDescriptions.put(DRIZZLE, WeatherDescriptions.DRIZZLE);
        yahooCodesToDescriptions.put(TROPICAL_STORM, WeatherDescriptions.TROPICAL_STORM);
        yahooCodesToDescriptions.put(FREEZING_DRIZZLE, WeatherDescriptions.FREEZING_DRIZZLE);
        yahooCodesToDescriptions.put(MIXED_SNOW_AND_SLEET, WeatherDescriptions.MIXED_SNOW_AND_SLEET);
        yahooCodesToDescriptions.put(SEVERE_THUNDERSTORMS, WeatherDescriptions.SEVERE_THUNDERSTORMS);
        yahooCodesToDescriptions.put(SHOWERS_NIGHT, WeatherDescriptions.SHOWERS_NIGHT);
        yahooCodesToDescriptions.put(FREEZING_RAIN, WeatherDescriptions.FREEZING_RAIN);
        yahooCodesToDescriptions.put(SNOW_FURRIES, WeatherDescriptions.SNOW_FURRIES);
        yahooCodesToDescriptions.put(LIGHT_SNOW_SHOWERS, WeatherDescriptions.LIGHT_SNOW_SHOWERS);
        yahooCodesToDescriptions.put(BLOWING_SNOW, WeatherDescriptions.BLOWING_SNOW);
        yahooCodesToDescriptions.put(SNOW, WeatherDescriptions.SNOW);
        yahooCodesToDescriptions.put(SLEET, WeatherDescriptions.SLEET);
        yahooCodesToDescriptions.put(DUST, WeatherDescriptions.DUST);
        yahooCodesToDescriptions.put(FOGGY, WeatherDescriptions.FOGGY);
        yahooCodesToDescriptions.put(HAZE, WeatherDescriptions.HAZE);
        yahooCodesToDescriptions.put(SMOKY, WeatherDescriptions.SMOKY);
        yahooCodesToDescriptions.put(BLUSTERY, WeatherDescriptions.BLUSTERY);
        yahooCodesToDescriptions.put(WINDY, WeatherDescriptions.WINDY);
        yahooCodesToDescriptions.put(COLD, WeatherDescriptions.COLD);
        yahooCodesToDescriptions.put(CLOUDY, WeatherDescriptions.CLOUDY);
        yahooCodesToDescriptions.put(MOSTLY_CLOUDY_NIGHT, WeatherDescriptions.MOSTLY_CLOUDY_NIGHT);
        yahooCodesToDescriptions.put(MOSTLY_CLOUDY_DAY, WeatherDescriptions.MOSTLY_CLOUDY_DAY);
        yahooCodesToDescriptions.put(PARTLY_CLOUDY_NIGHT, WeatherDescriptions.PARTLY_CLOUDY_NIGHT);
        yahooCodesToDescriptions.put(PARTLY_CLOUDY_DAY, WeatherDescriptions.PARTLY_CLOUDY_DAY);
        yahooCodesToDescriptions.put(CLEAR_NIGHT, WeatherDescriptions.CLEAR_NIGHT);
        yahooCodesToDescriptions.put(SUNNY, WeatherDescriptions.SUNNY);
        yahooCodesToDescriptions.put(FAIR_NIGHT, WeatherDescriptions.FAIR_NIGHT);
        yahooCodesToDescriptions.put(FAIR_DAY, WeatherDescriptions.FAIR_DAY);
        yahooCodesToDescriptions.put(MIXED_FAIR_AND_HAIL, WeatherDescriptions.MIXED_FAIR_AND_HAIL);
        yahooCodesToDescriptions.put(HOT, WeatherDescriptions.HOT);
        yahooCodesToDescriptions.put(ISOLATED_THUNDERSTORMS, WeatherDescriptions.ISOLATED_THUNDERSTORMS);
        yahooCodesToDescriptions.put(SCATTERED_THUNDERSTORMS_NIGHT, WeatherDescriptions.SCATTERED_THUNDERSTORMS_NIGHT);
        yahooCodesToDescriptions.put(SCATTERED_THUNDERSTORMS_DAY, WeatherDescriptions.SCATTERED_THUNDERSTORMS_DAY);
        yahooCodesToDescriptions.put(SCATTERED_SHOWERS, WeatherDescriptions.SCATTERED_SHOWERS);
        yahooCodesToDescriptions.put(HEAVY_SNOW_NIGHT, WeatherDescriptions.HEAVY_SNOW_NIGHT);
        yahooCodesToDescriptions.put(SCATTERED_SNOW_SHOWERS, WeatherDescriptions.SCATTERED_SNOW_SHOWERS);
        yahooCodesToDescriptions.put(HEAVY_SNOW_DAY, WeatherDescriptions.HEAVY_SNOW_DAY);
        yahooCodesToDescriptions.put(PARTLY_CLOUDY, WeatherDescriptions.PARTLY_CLOUDY);
        yahooCodesToDescriptions.put(THUNDERSTORMS_DAY, WeatherDescriptions.THUNDERSTORMS_DAY);
        yahooCodesToDescriptions.put(HEAVY_SNOW, WeatherDescriptions.HEAVY_SNOW);
        yahooCodesToDescriptions.put(ISOLATED_THUDER_SHOWERS, WeatherDescriptions.ISOLATED_THUDER_SHOWERS);
        yahooCodesToDescriptions.put(SNOW_SHOWERS, WeatherDescriptions.SNOW_SHOWERS);
        yahooCodesToDescriptions.put(NOT_AVAILABLE, WeatherDescriptions.NOT_AVAILABLE);
    }

    public String yahooCodeToDescription(int code) {
        return yahooCodesToDescriptions.getOrDefault(code, "");
    }
}
