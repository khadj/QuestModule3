package com.quest.servlet;

import org.junit.jupiter.api.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.mockito.Mockito.*;

class GameStartServletTest {
    @Test
    public void testAcceptChoice() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getParameter("choice")).thenReturn("accept");
        when(request.getSession()).thenReturn(session);

        GameStartServlet servlet = new GameStartServlet();
        servlet.doPost(request, response);

        verify(request.getRequestDispatcher("question1.jsp")).forward(request, response);
        verify(session, never()).setAttribute(eq("gamesPlayed"), anyInt());
    }

    @Test
    public void testRejectChoice() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getParameter("choice")).thenReturn("reject");
        when(request.getSession()).thenReturn(session);

        GameStartServlet servlet = new GameStartServlet();
        servlet.doPost(request, response);

        verify(response).sendRedirect("defeat.jsp");
        verify(session).setAttribute(eq("gamesPlayed"), anyInt());
    }
}