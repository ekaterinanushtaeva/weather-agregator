package com.constants;

public interface RequestParams {

    String YAHOO_YQL_QUERY="select item.forecast from weather.forecast where woeid in (select woeid from geo.places where text='%s') limit 10";
    String QUERY="q";
}
