package com.constants;

public interface TemplatePaths {

    String DELIMETER = "/";

    interface Simple {

        String ROOT = "simple";
        String MAIN = ROOT + DELIMETER + "main";
    }

    interface Weather {

        String ROOT = "weather";
        String MAIN = ROOT + DELIMETER + "main";
    }
}
