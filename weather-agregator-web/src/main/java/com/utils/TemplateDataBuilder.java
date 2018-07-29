package com.utils;

import com.constants.TemplateType;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class TemplateDataBuilder {

    public Map<String, Object> buildDataForTemplate(TemplateType templateType) {
        Map<String, Object> dataMap = new HashMap<String, Object>();

        switch (templateType) {
            case SIMPLE:
                return dataMap;
            default:
                return dataMap;
        }
    }
}
