package com.hillel.controller;

import com.hillel.service.HouseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// сервлет созданый(связаный) с помощью АННОТАЦИИ;
@WebServlet("/houses") // "/houses" - приставка к базовой строке в браузере, по которой будем обращаться/переходить на наш сервлет(страничку в браузере);
public class HouseServlet extends HttpServlet { // *любой сервлет(класс) должен наследоваться от HttpServlets чтобы Tomcat мог определить его как сервлет (считатет анотацию);
    private final HouseService houseService = new HouseService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("houses", houseService.findAllHouses());
        req.getRequestDispatcher("views/houses.jsp").forward(req, resp);
    }
}