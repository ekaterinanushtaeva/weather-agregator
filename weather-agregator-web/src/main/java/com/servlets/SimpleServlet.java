package com.servlets;

import com.constants.ContentTypes;
import com.utils.TemplateProcessor;
import com.constants.TemplateType;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//это тестовый сервлет
//если всё правильно настроено
//то по адресу localhost:8080
//должно вывестись сообщение hello
@WebServlet
public class SimpleServlet extends HttpServlet {

    @Inject
    private TemplateProcessor templateProcessor;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter responseOutputStreamWriter = response.getWriter();

        response.setContentType(ContentTypes.HTML);
        templateProcessor.processTemplate(TemplateType.SIMPLE, responseOutputStreamWriter);
    }
}
