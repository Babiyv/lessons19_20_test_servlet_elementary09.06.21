package com.hillel.controller;

import com.hillel.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// сервлет созданый(связаный) с помощью конфигурации в WEB.XML:
public class CustomerServlet extends HttpServlet { // *любой сервлет(класс) должен наследоваться от HttpServlets чтобы Tomcat мог определить его как сервлет (считатет анотацию);
    private final CustomerService customerService = new CustomerService();

    // запрос на получение данных:
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // реквест в который мы передаем данные с сервиса CustomerService:
        req.setAttribute("customers", customerService.findAllCustomers()); // "customers" - ключ по которому будем обращаться к нашему jsp
        // передаем наш реквест на jsp:
        req.getRequestDispatcher("views/customers.jsp").forward(req, resp);
    }
}