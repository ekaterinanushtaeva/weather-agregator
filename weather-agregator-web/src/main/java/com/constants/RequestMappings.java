package com.constants;

public interface RequestMappings {

    String ROOT = "/";

    interface Simple {

        String ROOT = RequestMappings.ROOT + "simple";
        String MAIN = RequestMappings.ROOT + "main";
    }
}
