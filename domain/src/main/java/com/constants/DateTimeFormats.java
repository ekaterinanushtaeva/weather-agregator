package com.constants;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public interface DateTimeFormats {

    DateTimeFormatter AGREGATOR_DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("d MMMM yyyy",
            WeatherAgregatorLocales.RUSSIAN);
    DateTimeFormatter YAHOO_DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.US);
}
