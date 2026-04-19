package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.Date;

@WebServlet("/sessionTrack")
public class SessionTrackingServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Create or get session
        HttpSession session = request.getSession();

        // Set session expiry (1 minute)
        session.setMaxInactiveInterval(60);

        // Visit count
        Integer count = (Integer) session.getAttribute("visitCount");

        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        session.setAttribute("visitCount", count);

        // Get session details
        String sessionId = session.getId();
        Date creationTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        // Display output
        out.println("<html><body>");

        out.println("<h2>Session Tracking Information</h2>");

        out.println("<p><b>Session ID:</b> " + sessionId + "</p>");
        out.println("<p><b>Creation Time:</b> " + creationTime + "</p>");
        out.println("<p><b>Last Access Time:</b> " + lastAccessTime + "</p>");
        out.println("<p><b>Visit Count:</b> " + count + "</p>");

        out.println("<p><i>Session expires in 1 minute</i></p>");
        out.println("<a href='sessionTrack'>Refresh</a>");

        out.println("</body></html>");
    }
}