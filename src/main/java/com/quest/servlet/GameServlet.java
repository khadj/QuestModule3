package com.quest.servlet;

import com.quest.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/game")
public class GameServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        Player player = (Player) session.getAttribute("player");
        if (player == null) {
            player = new Player();
            session.setAttribute("player", player);
        }

        String action = request.getParameter("action");

        if (action == null) {
            // Отобразить страницу приветствия
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);

        } else if (action.equals("start")) {
            // Начать игру
            player.incrementGamesPlayed();
            session.setAttribute("player", player);
            request.getRequestDispatcher("/question1.jsp").forward(request, response);
        } else if (action.equals("question1")) {
            // Обработать ответ на вопрос 1
            String answer = request.getParameter("answer");

            if (answer.equals("1")) {
                request.getRequestDispatcher("/question2.jsp").forward(request, response);
            } else if (answer.equals("2")) {
                request.getRequestDispatcher("/question3.jsp").forward(request, response);
            }
        }
    }
}
