package com.utils.api;

import com.classes.YahooEntity;

import java.util.List;

public interface JsonXmlParser {

    public List<YahooEntity> jsonToYahooEntity(String json);
}
