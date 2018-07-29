package com.utils;

import com.constants.TemplateType;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import static com.constants.TemplatePaths.Simple.*;
import static com.constants.TemplateType.*;

@Singleton
public class TemplateProcessor {

    @Inject
    private TemplateDataBuilder templateDataBuilder;

    @Inject
    private Configuration freemakerConfiguration;

    private Map<TemplateType, String> templateTypesToPaths;

    @PostConstruct
    public void init() {
        templateTypesToPaths = new HashMap<>();
        templateTypesToPaths.put(SIMPLE, MAIN);
    }

    //ToDo: ввести логирование
    //в кетче
    public void processTemplate(TemplateType templateType, Writer templateOutputStreamWriter) {

        try {
            freemakerConfiguration
                    .getTemplate(templateTypesToPaths.get(templateType))
                    .process(templateDataBuilder
                                    .buildDataForTemplate(templateType),
                            templateOutputStreamWriter);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
