package com.constants;

public interface TemplatePaths {

    String ROOT = "html";
    String DELIMETER = "/";

    interface Simple {

        String ROOT = TemplatePaths.ROOT + DELIMETER + "simple";
        String MAIN = ROOT + DELIMETER + "main.ftl";
    }
}
