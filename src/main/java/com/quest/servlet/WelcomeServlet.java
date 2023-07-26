package com.quest.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Очищаем сессию при начале новой игры
        request.getSession().invalidate();

        // Переходим на страницу приветствия (index.jsp)
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}