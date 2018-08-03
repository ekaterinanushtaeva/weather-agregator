package com.utils.impl;

import com.alibaba.fastjson.JSON;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.utils.api.RequestExecutor;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import java.util.Map;

@Component
public class RequestExecutorImpl implements RequestExecutor {

    @Override
    public String executeGetRequest(String url, Map<String, Object> headers,
                                    Map<String, String> queryParams) {
        WebResource webResource = buildWebResource(url, headers);

        webResource = addRequestParams(queryParams, webResource);

        return webResource.get(String.class);
    }

    @Override
    public String executePostRequest(String url, Map<String, Object> headers,
                                     Object requestBody) {
        WebResource webResource = buildWebResource(url, headers);

        return webResource
                .type(MediaType.APPLICATION_JSON)
                .post(String.class, JSON.toJSON(requestBody));
    }

    private WebResource buildWebResource(String url, Map<String, Object> headers) {
        WebResource webResource = Client.create()
                .resource(url);

        addRequestHeaders(headers, webResource);
        return webResource;
    }

    private WebResource addRequestParams(Map<String, String> queryParams, WebResource webResource) {
        for (Map.Entry<String, String> queryParam : queryParams.entrySet()) {
            webResource = webResource.queryParam(queryParam.getKey(), queryParam.getValue());
        }

        return webResource;
    }

    private void addRequestHeaders(Map<String, Object> headers, WebResource webResource) {
        for (Map.Entry<String, Object> header : headers.entrySet()) {
            webResource.header(header.getKey(), header.getValue());
        }
    }
}
