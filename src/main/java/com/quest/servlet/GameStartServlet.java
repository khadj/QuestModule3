package com.quest.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/game")
public class GameStartServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String choice = request.getParameter("choice");
        HttpSession session = request.getSession();

        if ("accept".equals(choice)) {
            // Если игрок принял вызов, переходим на страницу мостика капитана (question1.jsp)
            request.getRequestDispatcher("question1.jsp").forward(request, response);
        } else if ("reject".equals(choice)) {
            // Если игрок отклонил вызов, поражение (defeat.jsp)
            response.sendRedirect("defeat.jsp");
        }

        incrementGamesPlayed(session);
    }

    private void incrementGamesPlayed(HttpSession session) {
        Integer gamesPlayed = (Integer) session.getAttribute("gamesPlayed");
        if (gamesPlayed == null) {
            gamesPlayed = 1;
        } else {
            gamesPlayed++;
        }
        session.setAttribute("gamesPlayed", gamesPlayed);
    }
}
