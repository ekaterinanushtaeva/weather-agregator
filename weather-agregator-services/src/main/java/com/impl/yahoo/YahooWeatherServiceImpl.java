package com.impl.yahoo;

import com.api.WeatherService;
import com.classes.Entity;
import com.classes.YahooEntity;
import com.constants.RequestParams;
import com.constants.RequestUrls;
import com.utils.api.JsonXmlParser;
import com.utils.api.RequestExecutor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Slf4j
@Service
@RequiredArgsConstructor
public class YahooWeatherServiceImpl implements WeatherService {

    private final RequestExecutor requestExecutor;
    private final JsonXmlParser jsonXmlParser;

    @Override
    public List<Entity> getWeather(double lat, double lon) {
        String query = String.format("(%.2f,%.2f)", lat, lon);

        return getWeather(query);
    }

    @Override
    public List<Entity> getWeather(String query) {
        String yql_query = String.format(RequestParams.YAHOO_YQL_QUERY, query);
        List<YahooEntity> yahooEntities = jsonXmlParser
                .jsonToYahooEntityList(requestExecutor
                        .executeGetRequest(RequestUrls.YAHOO_URL,
                                Collections.emptyMap(),
                                Collections.singletonMap(RequestParams.QUERY, yql_query)));

        return yahooEntities
                .stream()
                .map(yahooEntity -> yahooEntity.init())
                .collect(Collectors.toList());
    }
}
