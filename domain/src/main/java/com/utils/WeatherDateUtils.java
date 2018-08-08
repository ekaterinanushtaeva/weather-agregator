package com.utils;

import com.constants.DateTimeFormats;
import com.constants.WeatherAgregatorLocales;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;

@UtilityClass
public class WeatherDateUtils {

    public String toWeatherAgregatorDateFormat(LocalDate localDate) {
        return localDate.format(DateTimeFormats.AGREGATOR_DATE_TIME_FORMAT);
    }

    public String toWeatherAgregatorDayFormat(DayOfWeek dayOfWeek) {
        return StringUtils.capitalize(dayOfWeek.getDisplayName(TextStyle.FULL, WeatherAgregatorLocales.RUSSIAN));
    }
}
