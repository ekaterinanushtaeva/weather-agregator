package com.controllers;

import com.constants.RequestMappings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.constants.TemplatePaths.Simple.*;

@Controller
@RequestMapping(RequestMappings.Simple.ROOT)
public class SimpleController {

    //Возможно потом понадобится разное название шаблорнов и мапингов
    //поэтому для путей к шаблонам отдельный интерфейс
    @GetMapping(RequestMappings.Simple.MAIN)
    public String getMainPage(){

        return MAIN;
    }

}
