package com.config;

import com.constants.Encoding;
import com.constants.TemplatePaths;
import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

import javax.enterprise.inject.Produces;
import java.util.Locale;

import static com.constants.FreemakerConstants.*;

public class FreemakerConfig {

    @Produces
    public Configuration buildConfiguration() {
        Configuration cfg = new Configuration(new Version(MAJOR_VERSION,
                MINOR_VERSION,
                MICRO_VERSION));

        //ToDo; возможно стоит вынести DELIMETER в какой-то отдельный интерфейс
        //что-то как-то не очень хорошо использовать здесь
        //TemplatePaths
        cfg.setClassForTemplateLoading(FreemakerConfig.class,
                TemplatePaths.DELIMETER);
        cfg.setDefaultEncoding(Encoding.UTF_8);
        cfg.setLocale(Locale.US);
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        return cfg;
    }
}
