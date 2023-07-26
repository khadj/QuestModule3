package com.quest.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/question1")
public class Question1Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String identity = request.getParameter("identity");

        if ("truth".equals(identity)) {
            request.getRequestDispatcher("question2.jsp").forward(request, response);
        } else if ("lie".equals(identity)) {
            response.sendRedirect("defeat.jsp");
        }
    }
}
