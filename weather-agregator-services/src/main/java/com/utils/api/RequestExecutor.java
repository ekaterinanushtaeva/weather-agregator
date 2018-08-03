package com.utils.api;

import java.util.Map;

public interface RequestExecutor {

    String executeGetRequest(String url, Map<String, Object> headers,
                             Map<String, String> queryParams);

    String executePostRequest(String url, Map<String, Object> headers,
                              Object requestBody);
}
