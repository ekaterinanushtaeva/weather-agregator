package com.utils.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.classes.YahooEntity;
import com.utils.api.JsonXmlParser;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.constants.JsonObjectConstants.*;

@Component
public class JsonXmlParserImpl implements JsonXmlParser {


    @Override
    public List<YahooEntity> jsonToYahooEntityList(String json) {
        JSONObject results = ((JSONObject) JSON.parse(json))
                .getJSONObject(QUERY)
                .getJSONObject(RESULTS);

        if (results == null) {
            return Collections.emptyList();
        }

        return results
                .getJSONArray(CHANNEL)
                .stream()
                .map(jsonObject -> ((JSONObject) jsonObject)
                        .getJSONObject(ITEM)
                        .getObject(FORECAST, YahooEntity.class))
                .collect(Collectors.toList());
    }
}
