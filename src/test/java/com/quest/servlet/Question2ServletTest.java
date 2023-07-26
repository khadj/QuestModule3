package com.quest.servlet;

import org.junit.jupiter.api.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.mockito.Mockito.*;

class Question2ServletTest {
    @Test
    public void testTruthIdentity() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("identity")).thenReturn("truth");

        Question2Servlet servlet = new Question2Servlet();
        servlet.doPost(request, response);

        verify(request.getRequestDispatcher("victory.jsp")).forward(request, response);
    }

    @Test
    public void testLieIdentity() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("identity")).thenReturn("lie");

        Question2Servlet servlet = new Question2Servlet();
        servlet.doPost(request, response);

        verify(response).sendRedirect("defeat.jsp");
    }
}