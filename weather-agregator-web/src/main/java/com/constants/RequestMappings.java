package com.constants;

public interface RequestMappings {

    String ROOT = "/";

    interface Simple {

        String ROOT = RequestMappings.ROOT + "simple";
        String MAIN = RequestMappings.ROOT + "main";
    }

    interface Weather {

        String ROOT = RequestMappings.ROOT + "weather";
        String MAIN = RequestMappings.ROOT + "main";
        String QUERY = "/{query}";
    }
}
