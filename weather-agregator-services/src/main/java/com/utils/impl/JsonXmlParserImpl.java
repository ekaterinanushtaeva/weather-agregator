package com.utils.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.classes.YahooEntity;
import com.utils.api.JsonXmlParser;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.constants.JsonObjectConstants.*;

@Component
public class JsonXmlParserImpl implements JsonXmlParser {

    @Override
    public List<YahooEntity> jsonToYahooEntity(String json) {

        return ((JSONObject) JSON.parse(json))
                .getJSONObject(QUERY)
                .getJSONObject(RESULTS)
                .getJSONArray(CHANNEL)
                .getJSONObject(START_ARRAY_INDEX)
                .getJSONObject(ITEM)
                .getJSONArray(FORECAST)
                .toJavaList(YahooEntity.class);
    }
}
