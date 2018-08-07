package com.utils.api;

import com.classes.YahooEntity;

import java.util.List;

public interface JsonXmlParser {

    List<YahooEntity> jsonToYahooEntityList(String json);
}
